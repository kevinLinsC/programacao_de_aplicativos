/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_14_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PROJETO_14_KEVIN {

    public static void main(String[] args) throws IOException {
        String s;
        DataInputStream dado;
        int[][] num = new int[5][5];
        int l; // Linha
        int c; // Coluna
        
        // Recebe os valores.
        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                System.out.print("Digite o [" + (l + 1) + "][" + (c + 1) + "] numero: ");
                dado = new DataInputStream(System.in);
                s = dado.readLine();
                try {
                    num[l][c] = Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    System.out.println("ERRO! Digite somente numeros.");
                    c--;
                }
            }
        }
        
        System.out.println("");
        Linha();
        System.out.println("Matriz original: ");
        Linha();
        
        // Mostra a matriz original.
         for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                System.out.print(num[l][c] + " ");
                if (num[l][c] < 10) {
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
         
        // Ordena a matriz de forma crescente.
        num = OrdenaCres(num);
        
        
        // Soma linha e coluna.  
        SomaLC(num);
        
        // Encontra os números que apareceram mais de uma vez.
        MaisDeUmaVez(num);

        // Soma da diagonal principal e secundaria.
        somaPS(num);
        
        // Substitui os numeros primos por -1.
        NumerosPrimos(num);
        
        
    }
    
    //Soma de linhas e colunas.
    public static void SomaLC (int[][] num) {
        int soma; // Variavel temporaria de soma.
        int[] soma_coluna = new int[5];
        int[] soma_linha = new int[5];
        int l;
        int c;
        
        System.out.println();
        Linha();
        System.out.println("As somas das linhas sao: ");
        Linha();
        
        // Soma de todas as linhas.
        for (l = 0; l < 5; l++) {
            soma = 0;
            for (c = 0; c < 5; c++) {
                soma += num[l][c]; 
            }
            soma_linha[l] = soma;
            System.out.println("A soma da " + (l + 1) + " linha e: " + soma_linha[l]);
        }
        
        System.out.println();
        Linha();
        System.out.println("As somas das colunas sao: ");
        Linha();
        
        // Soma de todas as colunas.
        for (l = 0; l < 5; l++) {
            soma = 0;
            for (c = 0; c < 5; c++) {
                soma += num[c][l]; 
            }
            soma_coluna[l] = soma;
            System.out.println("A soma da " + (l + 1) + " coluna e: " + soma_coluna[l]);
        }
    }
    
    // Soma da diagonal principal e secundaria.
    public static void somaPS(int[][] num) {
        int l;
        int c;
        int soma_diag_prin = 0;
        int soma_diag_sec = 0;
        
        // Soma da diagonal principal.
        System.out.println();
        Linha();
        System.out.println("Soma da diagonal principal e secundaria: ");
        Linha();
        for (l = 0; l < 5; l++) {
            soma_diag_prin += num[l][l];
        }
        
        // Soma da diagonal secundaria.
        for (l = 0; l < 5; l++) {
            c = num.length - 1 - l; // Pega o tamnho da matriz(5), diminui 1(4) e tira l
            soma_diag_sec += num[l][c];
        }
        
        System.out.println("A soma da diagonal principal e: " + soma_diag_prin);
        System.out.println("A soma da diagonal secundaria e: " + soma_diag_sec);
    }
    
    // Ordena a matriz.
    public static int[][] OrdenaCres(int[][] num) {
        int l;
        int c;
        int i = 0;
        int j;
        int[] num_vetor = new int[num.length * num.length];
        // Ordena a matriz de forma crescente.
        
        // Coloca a matriz em um vetor
        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                num_vetor[i] = num[l][c];
                i++;
            }
        }
        
        // Ordena o vetor
        for (i = 0; i < num_vetor.length - 1; i++) {
            for (j = i + 1; j < num_vetor.length; j++) {
                if (num_vetor[i] > num_vetor[j]) {
                    int temp = num_vetor[i];
                    num_vetor[i] = num_vetor[j];
                    num_vetor[j] = temp;
                }
            }
        }
        
        i = 0;
        
        System.out.println();
        Linha();
        System.out.println("Matriz ordenada de forma crescente: ");
        Linha();
        
        // Coloca em uma matriz
        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                num[l][c] = num_vetor[i];
                i++;
                System.out.print(num[l][c] + " ");
                if (num[l][c] < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        
        return num;
    }
    
    // Encontra e mostra quais numeros apareceram mais de uma vez.
    public static void MaisDeUmaVez(int[][] num) {
        int l;
        int c;
        int i = 0;
        int cont_repet; // Contagem de repetições.
        int numero; // Variavel auxilar que guarda um numero.
        int numero_passado = -1; // Guarda o ultimo numero.
        int[] num_vetor = new int[num.length * num.length];
        
        // Coloca a matriz em um vetor
        for (l = 0; l < 5; l++) {
            for (c = 0; c < 5; c++) {
                num_vetor[i] = num[l][c];
                i++;
            }
        }
        
        System.out.println();
        Linha();
        System.out.println("Os numeros que se repetiram foram: ");
        Linha();
        
        // Verifica se o numero é repetido ou não.
        for (l = 0; l < num.length; l++) {
            for (c = 0; c < num.length; c++) {
                numero = num[l][c];
                cont_repet = 0;
                for (i = 0; i < num_vetor.length; i++) {
                    if (numero == num_vetor[i] && numero != numero_passado) {
                        cont_repet++;
                    }
                }
                if (cont_repet > 1) {
                    System.out.println("O numero " + numero + " se repete " + cont_repet + " vezes.");
                    numero_passado = numero;
                }
            }
        }
    }
    
    public static void NumerosPrimos(int[][] num) {
        int l;
        int c;
        int i;
        int temp_num;
        int divisiveis;
        
        // Verifica se há numeros primos na matriz.
        for (l = 0; l < num.length; l++) {
            for (c = 0; c < num.length; c++) {
                temp_num = num[l][c];
                divisiveis = 0;
                // For para verificar se é primo.
                if (temp_num > 0) {
                    for (i = 1; i <= temp_num; i++) {
                        if (temp_num % i == 0) {
                            divisiveis++;
                        }
                    }
                }
                // Se for primo troca por -1.
                if (divisiveis == 2) {
                    num[l][c] = -1;
                }
            }
        }
        
        System.out.println("");
        Linha();
        System.out.println("A matriz com os primos trocados por -1 sao: ");
        Linha();
        // Escreve a matriz atualizada.
        for (l = 0; l < num.length; l++) {
            for (c = 0; c < num.length; c++) {
                System.out.print(num[l][c] + " ");
                if (num[l][c] < 10 && num[l][c] >= 0) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
    // Escreve uma linha.
    public static void Linha() {
        System.out.println("----------------------------------");
    }
}
