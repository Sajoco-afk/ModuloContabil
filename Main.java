/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulocontabil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome da empresa: ");
        String nomeEmpresa = scanner.nextLine();
        Pagamentos pagamentos = new Pagamentos(nomeEmpresa);
        
        while (true) {
            System.out.print("\nTipo de imposto (PIS, IPI) ou 'pare' para encerrar: ");
            String tipo = scanner.nextLine().trim();
            
            if (tipo.equalsIgnoreCase("pare")) {
                break;
            }
            
            if (tipo.equalsIgnoreCase("PIS")) {
                System.out.println("Valor de débito: ");
                double debito = Double.parseDouble(scanner.nextLine());
                System.out.print("Valor do crédito: ");
                double credito = Double.parseDouble(scanner.nextLine());
                pagamentos.adicionarImposto(new PIS(debito, credito));
                
            } 
            
            else if (tipo.equalsIgnoreCase("IPI")) {
                System.out.print("Alíquota (%): ");
                double aliquota = Double.parseDouble(scanner.nextLine());
                System.out.print("Valor do produto: ");
                double valorProduto = Double.parseDouble(scanner.nextLine());
                System.out.print("Valor do frete: ");
                double frete = Double.parseDouble(scanner.nextLine());
                System.out.print("Valor do seguro: ");
                double seguro = Double.parseDouble(scanner.nextLine());
                System.out.print("Outras despesas: ");
                double outrasDespesas = Double.parseDouble(scanner.nextLine());
                pagamentos.adicionarImposto(new IPI(aliquota, valorProduto, frete, seguro, outrasDespesas));
            } 
            
            else { 
                System.out.println("Tipo inválido. Digite PIS, IPI ou pare. ");
            }
    }
    
    System.out.println("\n===Impostos de " + pagamentos.getNomeEmpresa() + "===");
    for (Imposto imposto : pagamentos.getImpostos()) {
        System.out.printf("%s: R$ %.2f%n", imposto.getDescricao(), imposto.calcular());
        }
    
    scanner.close();
    
    }
}
