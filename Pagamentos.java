/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulocontabil;

import java.util.ArrayList;
import java.util.List;

public class Pagamentos {
    
    private String nomeEmpresa;
    private List<Imposto> impostos;
    
    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.impostos = new ArrayList<>();
    }
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }
    
       public List<Imposto> getImpostos() {
        return impostos;
    }

    public void adicionarImposto(Imposto imposto) {
        impostos.add(imposto);
    }
}
