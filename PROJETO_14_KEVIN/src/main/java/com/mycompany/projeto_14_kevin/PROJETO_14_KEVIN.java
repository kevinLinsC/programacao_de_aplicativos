/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_14_kevin;

import java.io.DataInputStream;
import java.util.Random;

/**
 *
 * @author k.andrade
 */
public class PROJETO_14_KEVIN {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        String s;
        DataInputStream dado;
        int[][] num = new int[5][5];
        int l;
        int c;
        int[] soma_coluna = new int[5];
        int[] soma_linha = new int[5];
        int soma_diag_prin = 0;
        int soma_diag_seg = 0;
        int soma;
        
        // Recebe os valores e mostra a matriz original
        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                num[l][c] = aleatorio.nextInt(0, 10);
                System.out.print(num[l][c] + " ");
                if (num[l][c] < 10) {
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
        
        System.out.println("----------------------------------");
        
        // Ordena a matriz de forma crescente
        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                
            }
        }
        
        System.out.println("----------------------------------");
        
        // Soma de todas as linhas
        for (l = 0; l < 5; l++) {
            soma = 0;
            for (c = 0; c < 5; c++) {
                soma += num[l][c]; 
            }
            soma_coluna[l] = soma;
            System.out.println("A soma da " + (l + 1) + " linha e: " + soma_coluna[l]);
        }
        
        // Soma de todas as colunas
        for (l = 0; l < 5; l++) {
            soma = 0;
            for (c = 0; c < 5; c++) {
                soma += num[c][l]; 
            }
            soma_linha[l] = soma;
            System.out.println("A soma da " + (l + 1) + " coluna e: " + soma_linha[l]);
        }
        
        // Soma da diagonal principal
        for (l = 0; l < 5; l++) {
            int a = num.length - 1;
            for (c = 0; c < 5; c++) {
                soma_diag_prin += num[a][c];
                a--;
            }
        }
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisiveis++;
                if (divisiveis > 2) {
                    break;
                }
            }
        }
        
        System.out.println("A soma da diagonal principal e: " + soma_diag_prin);
    }
}
