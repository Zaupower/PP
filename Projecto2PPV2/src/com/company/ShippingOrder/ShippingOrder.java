package com.company.ShippingOrder;

import com.company.Exceptions.ContException;
import com.company.Exceptions.OrdeException;
import order.base.ICustomer;
import order.base.IPerson;
import order.base.OrderStatus;
import order.exceptions.ContainerException;
import order.exceptions.OrderException;
import order.exceptions.PositionException;
import order.packing.IContainer;
import shippingorder.IShippingOrder;

import java.util.Arrays;

/**
 * Classe que gere os containers
 */
public class ShippingOrder implements IShippingOrder {
    private int orderId;
    private IPerson destination;
    private IContainer[] containers = new IContainer[10];
    private OrderStatus orderStatus = OrderStatus.AWAITS_TREATMENT;
    private ICustomer customer;

    /**
     * Construtor de Classe
     * @param orderId
     * @param customer
     */
    public ShippingOrder(int orderId, ICustomer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    /**
     * Verifica se Order Status esta IN_TREATMENT\
     * Verifica se existem campos null em IContainer\
     * Verifica se ja existe esse Container alocado
     *
     * @param iContainer
     * @return boolean
     * @throws OrdeException
     * @throws ContainerException
     */
    @Override
    public boolean addContainer(IContainer iContainer) throws OrdeException, ContainerException {
        boolean test = false;
        int findOne = findContainer(iContainer.getReference());
        if (orderStatus != OrderStatus.IN_TREATMENT) {
            throw new OrdeException("Order Status invalido");
        } else {
            //CheckNull
            if (checkNull(iContainer) || findOne >= 0 || !iContainer.isClosed()) {

                if (findOne > 0) {
                    System.out.println("Container ja existente na posicao: " + findOne);
                }

                throw new ContException(" Contentor: "+iContainer.getReference()+" ja existe ou Nao esta devidamente Fechado");
            } else {
                for (int i = 0; i < containers.length; i++) {
                    if (containers[i] == null) {
                        containers[i] = iContainer;
                        break;
                    } else if (containers[containers.length - 1] != null) {
                        test = true;
                    }
                }
                if (test) {
                    throw new ContException("Container sem posicoes disponiveis");
                }
            }
        }
        return test;
    }

    /**
     * Remove um container do array e move a posicao nula para a ultima posicao do array
     * @param iContainer
     * @return Boleano
     * @throws OrderException
     * @throws ContainerException
     */
    @Override
    public boolean removeContainer(IContainer iContainer) throws OrderException, ContainerException {
        int rmIndex = 0;
        boolean test = false;
        if (orderStatus != OrderStatus.IN_TREATMENT) {
            throw new OrdeException("Order Status invalido");
        } else {
            if (iContainer instanceof IContainer) {
                for (int i = 0; i < containers.length; i++) {
                    if (containers[i] != null && containers[i].getReference().equals(iContainer.getReference())) {
                        rmIndex = i;
                        test = true;
                    }
                }
            }

            int j;
            if (test) {
                for (j = rmIndex; j < containers.length - 1 && containers[j] != null; j++) {
                    containers[j] = containers[j + 1];
                }
                containers[j] = null;

            } else {
                throw new ContException("Item nao encontrado");
            }
        }
        return test;
    }

    /**
     * Verifica se um Container exite
     * Verificando a sua referencia
     * @param iContainer
     * @return Boleano
     */
    @Override
    public boolean existsContainer(IContainer iContainer) {
        boolean test = false;
        if (iContainer instanceof IContainer) {
            for (int i = 0; i < containers.length; i++) {
                if (containers[i] != null && containers[i].getReference().equals(iContainer.getReference())) {
                    test = true;
                }
            }
        }
        return test;
    }

    /**
     * Encontra 1 Container e retorna a sua posicao no array de Containers
     * @param s
     * @return
     */
    @Override
    public int findContainer(String s) {
        int test = (-1);
        for (int i = 0; i < containers.length; i++) {
            if (containers[i] != null && containers[i].getReference().equals(s)) {
                test = i;
            }
        }
        return test;
    }

    /**
     * Retona informacao sobre o destino do pedido
     * @return
     */
    @Override
    public IPerson getDestination() {
        return this.destination;
    }

    /**
     * Define o destino da encomenda
     * @param iPerson
     */
    @Override
    public void setDestination(IPerson iPerson) {
        this.destination = iPerson;

    }

    /**
     * Retorna o Cliente do pedido
     * @return
     */
    @Override
    public ICustomer getCustomer() {
        return this.customer;
    }

    /**
     *
     * @return Order Status
     */
    @Override
    public OrderStatus getStatus() {

        return this.orderStatus;
    }

    /**
     * DEfine o Status Actual Do pedido Consuante o seu estado atual e pedido
     * Caso o estado atual seja aguarda tratamento apenas pode ser mudado para  em Tratameno
     * Caso seja em tratamento apenas pode mudar para Fechado
     * @param orderStatus
     * @throws OrderException
     * @throws ContainerException
     * @throws PositionException
     */
    @Override
    public void setStatus(OrderStatus orderStatus) throws OrderException, ContainerException, PositionException {

        int counter = 0;
        if (orderStatus instanceof OrderStatus) {
            if (orderStatus == OrderStatus.IN_TREATMENT && this.orderStatus == OrderStatus.AWAITS_TREATMENT) {
                this.orderStatus = OrderStatus.IN_TREATMENT;
            } else if (orderStatus == OrderStatus.CLOSED && this.orderStatus == OrderStatus.IN_TREATMENT) {
                for (int i = 0; i < this.containers.length; i++) {
                    if (this.containers[i] != null) {

                        counter++;
                    }
                }
                if (counter > 0) {
                    validate();
                } else if (counter == 0) {

                    throw new ContException("Container ERROR NO Containers FOUND in Arayy: ");
                }
                this.orderStatus = OrderStatus.CLOSED;
            } else if (orderStatus == OrderStatus.SHIPPED && this.orderStatus == OrderStatus.CLOSED) {
                this.orderStatus = OrderStatus.SHIPPED;

            } else {
                throw new OrdeException("Order Status ERROR, current OrderStatus: " + this.orderStatus);
            }

        }
    }

    /**
     * Retorna Shipping Order ID
     * @return
     */
    @Override
    public int getId() {
        return this.orderId;
    }

    /**
     * Gera um novo array de Containers Sem posicoes null
     * @return Container Array
     */
    @Override
    public IContainer[] getContainers() {

        int counter = 0;
        for (int i = 0; i < this.containers.length; i++) {
            if (this.containers[i] != null) {
                counter++;
            }
        }
        IContainer[] iContainers = new IContainer[counter];
        for (int i = 0; i < iContainers.length; i++) {
            iContainers[i] = containers[i];
        }
        return iContainers;
    }

    /**
     * Valida todas as Posicoes e diminui o tamanho do array inical de containers
     * para que nao tenha posicoes null
     * @throws ContainerException
     * @throws PositionException
     */
    @Override
    public void validate() throws ContainerException, PositionException {

        for (int i = 0; i < containers.length; i++) {
            if (containers[i] != null) {
                containers[i].validate();
            }
        }
        this.containers = getContainers();
    }

    /**
     * Pequeno sumario do interior da ShippingOrder
     * @return String
     */
    @Override
    public String summary() {
        return "ShippingOrder{" +
                "id=" + orderId +
                ", customer=" + customer +
                ", destination=" + destination +
                ", containers=" + Arrays.toString(containers) +
                ", orderStatus=" + orderStatus +
                '}';
    }

    /**
     * Metodo que verifica se algum campo de container esta null
     *
     * @param container
     * @return
     */
    public boolean checkNull(IContainer container) {
        boolean check = false;
        for (int i = 0; i < container.getPackedItems().length; i++) {
            if (container.getPackedItems()[i] == null) {
                check = true;

                break;
            }
            if (container.getPackedItems()[i].getItem() == null) {
                check = true;
                break;
            }
            if (container.getPackedItems()[i].getPosition() == null) {
                check = true;
                break;
            }

        }
        return check;
    }

}
