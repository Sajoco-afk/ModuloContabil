/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulocontabil;


public class PIS implements Imposto {
    
    private double debito;
    private double credito;
    
    public PIS(double debitoInit, double creditoInit) {
        debito = debitoInit;
        credito = creditoInit;
    }
    
    public double getDebito() {
        return debito;
    }
    
    public void setDebito(double debito){
        this.debito = debito;
    }
    
    public double getCredito() {
        return credito;
    }
    
    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public double calcular() {
        return (debito - credito) * 0.0165; 
    }

    @Override
    public String getDescricao() {
        return "PIS";
    } 
}
