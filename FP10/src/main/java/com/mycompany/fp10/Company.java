/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fp10;

/**
 *
 * @author marce
 * Classe geral de varias companhias
 */

/**
 * 
 * Classe Geral de copmpanhia
 */
public class Company {
    protected String name;
    protected int vatNumber;

    /**
     * Construtor
     * @param name varialvel nome
     * @param vatNumber  vat number de cada empresa
     */
    public Company(String name, int vatNumber) {
        this.name = name;
        this.vatNumber = vatNumber;
    }
    
    
/**
 * 
 * @return nome da empresa
 */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name nome da empresa a ser adicionad
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return retorna o vat da empresa
     */
    public int getVatNumber() {
        return vatNumber;
    }

    /**
     * 
     * @param vatNumber  vat da empresa a ser adicionado
     */
    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }

    /**
     * 
     * @return metodso toString 
     */
    @Override
    public String toString() {
        return "Company{" + "name=" + name + ", vatNumber=" + vatNumber + '}';
    }
    
    
    
}
