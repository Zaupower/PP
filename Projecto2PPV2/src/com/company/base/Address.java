package com.company.base;


import order.base.IAddress;

/**
 * Classe de definicao do Endereco
 */
public class Address implements IAddress {
    private String country;
    private int number;
    private String street;
    private String city;
    private String state;


    public Address() {
    }

    /**
     * Constructor do Endereco
     *
     * @param city
     * @param country
     * @param number
     * @param state
     * @param street
     */
    public Address(String country,int number,String street,  String city,  String state) {
        this.city = city;
        this.country = country;
        this.number = number;
        state = state;
        this.street = street;
    }

    /**
     * Retorna a cidade definida
     *
     * @return
     */
    @Override
    public String getCity() {
        return this.city;
    }

    /**
     * Retona o pais adicionado
     *
     * @return
     */
    @Override
    public String getCountry() {
        return this.country;
    }

    /**
     * Retorna o numero adicionado
     *
     * @return
     */
    @Override
    public int getNumber() {
        return this.number;
    }

    /**
     * Retorna a Regiao adicionada
     *
     * @return
     */
    @Override
    public String getState() {
        return this.state;
    }

    /**
     * Retorna o endereco fisico adicionado
     *
     * @return
     */
    @Override
    public String getStreet() {
        return this.city;
    }

    /**
     * Adiciona uma cidade
     *
     * @param s
     */
    @Override
    public void setCity(String s) {

        this.city = s;
    }

    /**
     * Adiciona o pais
     *
     * @param s
     */
    @Override
    public void setCountry(String s) {

        this.country = s;
    }

    /**
     * Adiciona o numero
     *
     * @param i
     */
    @Override
    public void setNumber(int i) {

        this.number = i;
    }

    /**
     * Adiciona a regiao
     *
     * @param s
     */
    @Override
    public void setState(String s) {

        this.state = s;
    }

    /**
     * Adiciona a Ruas
     *
     * @param s
     */
    @Override
    public void setStreet(String s) {

        this.street = s;
    }

    /**
     * Metodo toString
     *
     * @return
     */
    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", number=" + number +
                ", State='" + state + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
