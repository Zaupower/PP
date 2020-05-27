package com.company.base;


import order.base.IAddress;
import order.base.ICustomer;

/**
 * Classe de definicao dos dados do Cliente
 */
public class Customer implements ICustomer {
    private IAddress address;
    private String name;
    private int costumerId;
    private IAddress billingAddress;

    public Customer(int costumerId) {
        this.costumerId = costumerId;
    }

    /**
     * Constructor do Cliente
     *
     * @param costumerId
     * @param name
     * @param address
     * @param billingAddress
     */
    public Customer(int costumerId, String name, IAddress address, IAddress billingAddress) {
        this.costumerId = costumerId;
        this.name = name;
        this.address = address;
        this.billingAddress = billingAddress;
    }

    public Customer( String name, IAddress address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Retorna o endereco de envio da encomenda
     *
     * @return
     */
    @Override
    public IAddress getBillingAddress() {
        return this.billingAddress;
    }

    /**
     * Retorna o ID do cliente
     *
     * @return
     */
    @Override
    public int getCustomerId() {
        return this.costumerId;
    }

    /**
     * Adicionar morada de cobranca
     *
     * @param iAddress
     */
    @Override
    public void setBillingAddress(IAddress iAddress) {

        this.billingAddress = iAddress;
    }

    /**
     * Retorna Endereco do cliente
     *
     * @return
     */
    @Override
    public IAddress getAddress() {
        return this.address;
    }

    /**
     * Retorna o nome do cliente
     *
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Adicionar endereco
     *
     * @param iAddress
     */
    @Override
    public void setAddress(IAddress iAddress) {
        this.address = iAddress;

    }

    /**
     * Adiciona nome do cliente
     *
     * @param s
     */
    @Override
    public void setName(String s) {

        this.name = s;
    }

    /**
     * Metodo toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "Customer{" +
                "costumerId=" + costumerId +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", billingAddress=" + billingAddress +
                '}';
    }
}
