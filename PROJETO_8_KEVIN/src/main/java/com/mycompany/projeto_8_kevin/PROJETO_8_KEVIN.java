/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_8_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_8_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de medalhas de ouro obtidas: ");
        int medalha_ouro = ler.nextInt();
        
        System.out.println("Digite a quantidade de medalhas de prata obtidas: ");
        int medalha_prata = ler.nextInt();
        
        System.out.println("Digite a quantidade de medalhas de bronze obtidas: ");
        int medalha_bronze = ler.nextInt();
        
        int total_medalha = medalha_ouro + medalha_prata + medalha_bronze;
        
        
        if ((medalha_ouro > 5) && (total_medalha) > 30) {
            System.out.println("Desempenho extraordinario.");
        }
        else if (medalha_ouro > 10) {
            System.out.println("Otimo desempenho.");
        }
        else if (medalha_ouro >= 5 && medalha_ouro <= 10) {
            System.out.println("Bom desempenho.");
        }
        else if ((total_medalha) > 20) {
            System.out.println("Desempenho regular.");
        }
        else if ((total_medalha) < 20) {
            System.out.println("Desempenho fraco.");
        }
    }
}
