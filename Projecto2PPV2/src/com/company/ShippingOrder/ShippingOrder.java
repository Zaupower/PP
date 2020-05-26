package com.company.ShippingOrder;

import com.company.Exceptions.ContException;
import com.company.Exceptions.OrdeException;
import com.company.Packing.PackedItem;
import com.company.base.Destination;
import order.base.ICustomer;
import order.base.IPerson;
import order.base.OrderStatus;
import order.exceptions.ContainerException;
import order.exceptions.OrderException;
import order.exceptions.PositionException;
import order.packing.IContainer;
import order.packing.IItem;
import shippingorder.IShippingOrder;

import java.util.Arrays;

public class ShippingOrder implements IShippingOrder {
    IContainer container;
    IPerson person;
    ICustomer customer;
    IPerson destination;
    IContainer[] containers = new IContainer[2];
    OrderStatus orderStatus = OrderStatus.AWAITS_TREATMENT;

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
            if (checkNull(iContainer) || findOne >= 0) {

                if (findOne >= 0) {
                    System.out.println("Container ja existente na posicao: " + findOne);
                }

                throw new ContException();
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
        System.out.println(Arrays.toString(containers));
        return test;
    }

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
                        System.out.println("rmIndex: " + rmIndex + " Reference: " + containers[i].getReference());
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

                System.out.println(Arrays.toString(containers));

            } else {
                throw new ContException("Item nao encontrado");
            }
        }
        return test;
    }

    @Override
    public boolean existsContainer(IContainer iContainer) {
        boolean test = false;
        if (iContainer instanceof IContainer) {
            for (int i = 0; i < containers.length; i++) {
                if (containers[i] != null && containers[i].getReference().equals(iContainer.getReference())) {

                    System.out.println(" Reference found : " + containers[i].getReference());
                    test = true;
                }
            }
        }
        if (true == false) {
            System.out.println(" No Reference found : ");
        }
        return test;
    }

    @Override
    public int findContainer(String s) {
        int test = (-1);
        for (int i = 0; i < containers.length; i++) {
            if (containers[i] != null && containers[i].getReference().equals(s)) {

                System.out.println(" Reference found : " + containers[i].getReference());
                test = i;
            }
        }
        return test;
    }

    @Override
    public IPerson getDestination() {
        return this.destination;
    }

    @Override
    public void setDestination(IPerson iPerson) {
        this.destination = iPerson;

    }

    @Override
    public ICustomer getCustomer() {
        return this.customer;
    }

    @Override
    public OrderStatus getStatus() {
        System.out.println(this.orderStatus.name());
        return this.orderStatus;
    }

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
                        System.out.println("Counter de Array de Containers"+ counter);
                    }
                }
                if (counter > 0) {
                    for (int i = 0; i < containers.length; i++) {
                        if (containers[i] != null) {

                            containers[i].validate();
                        }
                    }
                } else if (counter == 0){

                    throw new  ContException("Container ERROR NO Containers FOUND in Arayy: ");
                }
                this.orderStatus = OrderStatus.CLOSED;
            }else if(orderStatus == OrderStatus.SHIPPED && this.orderStatus == OrderStatus.CLOSED) {
                this.orderStatus = OrderStatus.SHIPPED;

            }else {
                throw new  OrdeException("Order Status ERROR, current OrderStatus: "+this.orderStatus);
            }

        }
    }


    @Override
    public int getId() {
        return 0;
    }

    @Override
    public IContainer[] getContainers() {
        return new IContainer[0];
    }

    @Override
    public void validate() throws ContainerException, PositionException {

    }

    @Override
    public String summary() {
        return null;
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
                System.out.println("Item " + i + " Contem posicoes null");
                break;
            }
            if (container.getPackedItems()[i].getItem() == null) {
                check = true;
                System.out.println("Item " + i + " getItem Contem posicoes null");
                break;
            }
            if (container.getPackedItems()[i].getPosition() == null) {
                check = true;
                System.out.println("Item " + i + " getPosition Contem posicoes null");
                break;
            }

        }


        return check;
    }
}
