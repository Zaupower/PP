package com.company.Packing;

import com.company.Exceptions.ContException;
import com.company.Exceptions.PosException;
import com.company.Packing.PackedItem;
import order.packing.*;

import java.util.Arrays;

public class Container implements IContainer {

    public IItemPacked[] iItemPackeds = new IItemPacked[2];
    int volume;
    String reference;
    int depth;
    int height;
    int lenght;
    transient boolean isClosed = false;

    /**
     * Constructor de container para definir os parametros da classe
     *
     * @param volume
     * @param reference
     * @param depth
     * @param height
     * @param lenght
     */
    public Container(int volume, String reference, int depth, int height, int lenght) {
        this.volume = volume;
        this.reference = reference;
        this.depth = depth;
        this.height = height;
        this.lenght = lenght;
    }

    /**
     * Adiciona um item caso exista uma posicao disponivel
     * Falta: Verificar a posicao
     *
     * @param iItem
     * @param iPosition
     * @param color
     * @return
     * @throws ContException
     */
    @Override
    public boolean addItem(IItem iItem, IPosition iPosition, Color color) throws ContException {
        boolean test = false;
        for (int i = 0; i < iItemPackeds.length; i++) {
            if (iItemPackeds[i] == null) {
                iItemPackeds[i] = new PackedItem(color, iItem, iPosition);
                break;
            } else if (iItemPackeds[iItemPackeds.length - 1] != null || isClosed == true) {
                test = true;
            }
        }
        if (test) {
            isClosed();
            throw new ContException("Container sem posicoes disponiveis");
        }
        System.out.println(Arrays.toString(iItemPackeds));
        return test;
    }

    /**
     * Remove um item verificando a sua referencia, depois move a posicao null para ultimo
     *
     * @param iItem
     * @return
     * @throws ContException
     */
    @Override
    public boolean removeItem(IItem iItem) throws ContException {
        int rmIndex = 0;
        boolean test = false;
        if (iItem instanceof IItem) {
            for (int i = 0; i < iItemPackeds.length; i++) {
                if (iItemPackeds[i] != null && iItemPackeds[i].getItem().getReference().equals(iItem.getReference())) {
                    rmIndex = i;
                    System.out.println("rmIndex: " + rmIndex + " Reference: " + iItemPackeds[i].getItem().getReference());
                    test = true;
                }
            }
        }

        int j;
        if (test) {
            for (j = rmIndex; j < iItemPackeds.length - 1 && iItemPackeds[j] != null; j++) {
                iItemPackeds[j] = iItemPackeds[j + 1];
            }
            iItemPackeds[j] = null;

            System.out.println(Arrays.toString(iItemPackeds));

        } else {
            throw new ContException("Item nao encontrado");
        }
        return test;
    }

    /**
     * Valida Se todos os Items no array "iItemPackeds" estao dentro do contetor
     * Se nao excedem os limites do mesmo e se nao se sobrepoem
     *
     * @throws ContException
     * @throws PosException
     */
    @Override
    public void validate() throws ContException, PosException {

        if (this.volume < getOccupiedVolume()) {

            throw new ContException("Volume superior ao maximo permitido");
        }
        for (int i = 0; i < iItemPackeds.length; i++) {
            if (iItemPackeds[i] != null) {
                //Testa se os Items dentro dos Packed Items se encontram dentro do container
                if (iItemPackeds[i].getItem().getDepth() > this.depth ||
                        iItemPackeds[i].getItem().getHeight() > this.height ||
                        iItemPackeds[i].getItem().getLenght() > this.lenght) {
                    throw new PosException("Item: " + iItemPackeds[i].getItem().getReference() + "Encontra-se fora do container");
                }
            }
        }

        //Testar se os itens se sopreoeem
        for (int i = 0; i < iItemPackeds.length - 1; i++) {
            for (int j = 1; j < iItemPackeds.length; j++) {
                if (iItemPackeds[i] != null && iItemPackeds[j] != null) {
                    //X axis test
                    if (iItemPackeds[i].getPosition().getX() + iItemPackeds[i].getItem().getLenght() > iItemPackeds[j].getPosition().getX() ||
                            iItemPackeds[i].getPosition().getX() > iItemPackeds[j].getPosition().getX() + iItemPackeds[j].getItem().getLenght()) {
                        System.out.println(iItemPackeds[i].getPosition().getX());
                        System.out.println(iItemPackeds[j].getPosition().getX() + iItemPackeds[j].getItem().getLenght());
                        throw new PosException("Item: " + iItemPackeds[i].getItem().getReference() + "Items :" + i + " e " + j + " sobreoem se em xx");
                    }
                    //Y axis test
                    if (iItemPackeds[i].getPosition().getY() + iItemPackeds[i].getItem().getDepth() > iItemPackeds[j].getPosition().getY() ||
                            iItemPackeds[i].getPosition().getY() > iItemPackeds[j].getPosition().getY() + iItemPackeds[j].getItem().getDepth()) {
                        throw new PosException("Item: " + iItemPackeds[i].getItem().getReference() + "Items :" + i + " e " + j + " sobreoem se em yy");
                    }
                    //Z axis test
                    if (iItemPackeds[i].getPosition().getZ() + iItemPackeds[i].getItem().getHeight() > iItemPackeds[j].getPosition().getZ() ||
                            iItemPackeds[i].getPosition().getZ() > iItemPackeds[j].getPosition().getZ() + iItemPackeds[j].getItem().getHeight()) {
                        throw new PosException("Item: " + iItemPackeds[i].getItem().getReference() + "Items :" + i + " e " + j + " sobreoem se em zz");
                    }

                }
            }
        }
    }

    /**
     * Corre a funcao validate() verificando se todos os itens se encontram
     * devidamente acomodados
     *
     * @throws ContException
     * @throws PosException
     */
    @Override
    public void close() throws ContException, PosException {
        validate();
        isClosed = true;
    }

    /**
     * Retorna um item pesquisado pela sua referencia
     *
     * @param s
     * @return
     */
    @Override
    public IItem getItem(String s) {
        IItem tmp = null;
        for (int i = 0; i < iItemPackeds.length; i++) {
            if (iItemPackeds[i] != null && iItemPackeds[i].getItem().getReference().equals(s)) {
                tmp = iItemPackeds[i].getItem();
            }
        }
        return tmp;
    }

    /**
     * Retorna o sumatorio do volume de todos os items presentes no array de Packed Items
     *
     * @return
     */
    @Override
    public int getOccupiedVolume() {
        int tmp = 0;
        for (int i = 0; i < iItemPackeds.length; i++) {
            if (iItemPackeds[i] != null) {
                tmp += iItemPackeds[i].getItem().getVolume();
            }
        }
        return tmp;
    }

    /**
     * Retorna um array novo baseado no array inical de Items mas apenas com as
     * posicoes iguais aonumro de items
     *
     * @return
     */
    @Override
    public IItemPacked[] getPackedItems() {
        int tmp = 0;


        for (int i = 0; i < iItemPackeds.length; i++) {
            if (iItemPackeds[i] != null) {
                System.out.println("TMP" + tmp);
                tmp++;
            }
        }
        System.out.println("TMP" + tmp);

        IItemPacked[] iItemPackeds1 = new IItemPacked[tmp];
        System.out.println("iItemPackeds1 lenght" + iItemPackeds1.length);
        for (int i = 0; i < iItemPackeds1.length; i++) {
            iItemPackeds1[i] = iItemPackeds[i];
        }
        System.out.println(Arrays.toString(iItemPackeds1));
        return iItemPackeds1;
    }

    /**
     * Retorna a referencia do Container
     *
     * @return
     */
    @Override
    public String getReference() {

        return this.reference;
    }

    /**
     * Contador do numero de items adicionados
     *
     * @return
     */
    @Override
    public int getNumberOfItems() {
        int tmp = 0;
        for (int i = 0; i < iItemPackeds.length; i++) {
            if (iItemPackeds[i] != null) {
                System.out.println("TMP" + tmp);
                tmp++;
            }
        }
        return tmp;
    }

    /**
     * Calcula o volume libre restante no container
     *
     * @return
     */
    @Override
    public int getRemainingVolume() {
        return this.volume - getOccupiedVolume();
    }

    /**
     * Retorna um boleano que e alterado na funcao validate()
     *
     * @return
     */
    @Override
    public boolean isClosed() {
        return isClosed;
    }

    /**
     * profundidade do Container
     *
     * @return
     */
    @Override
    public int getDepth() {
        return this.depth;
    }

    /**
     * Altura do Container
     *
     * @return
     */
    @Override
    public int getHeight() {
        return this.height;
    }

    /**
     * Cumprimento do Container
     *
     * @return
     */
    @Override
    public int getLenght() {
        return this.lenght;
    }

    /**
     * Volume Ttal do Container
     *
     * @return
     */
    @Override
    public int getVolume() {
        return this.volume;
    }

    /**
     * Metodo toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "Container{" +
                "iItemPackeds=" + Arrays.toString(iItemPackeds) +
                ", volume=" + volume +
                ", reference='" + reference + '\'' +
                ", depth=" + depth +
                ", height=" + height +
                ", lenght=" + lenght +
                ", isClosed=" + isClosed +
                '}';
    }
}
