/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_kevin;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class PROJETO_13_KEVIN {
    
    public static int[] B;
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int indice = 0; // Indice do vetor números.
        int i; // Variavel de indece, só para auxilios em for.
        String operacao; // Operação em que o calculo irá ser feito.
        int resultado = 0;
        int esc1;
        int esc2;
        String temp;
        int cont_resultados = 1;
        
        int[] A = new int[1];
        //int[] B = new int[cont_resultados];
        
        //Tamanho do vetor.
        while (indice <= 0) {
            System.out.print("Digite o tamanho do vetor: ");
            temp = ler.next();
            try {
                indice = Integer.parseInt(temp);
            } catch (NumberFormatException e) {
                System.out.println("Digite somente numeros.");
            }
        }
        
        System.out.println("-----------------------------------");
        
        //Cria o vetor com o tamanho que o usuario indicou
        int[] numeros = new int[indice];
        
        //Pega os numeros e coloca dentro do vetor
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero da " + (i + 1) + " posicao: ");
            String num = ler.next();
            try {
                numeros[i] = Integer.parseInt(num);
            } catch (NumberFormatException e) {
                System.out.println("ERRO");
                i--;
            }
            
        }
        
        System.out.println("-----------------------------------");
        
        //Usuario escolhe a operacao que será feito
        while (true) {
            System.out.print("Escolha a operacao (+ | - | * | /): ");
            operacao = ler.next();
            if (operacao.equals("/") || operacao.equals("*") || operacao.equals("+") || operacao.equals("-")) {
                break;
            }
        }
        
        System.out.println("-----------------------------------");
        
        //Escreve a posicao de cada numero
        for (i = 0; i < numeros.length; i++) {
            System.out.println((i + 1) + " Posicao: " + numeros[i]);
        }
        
        System.out.println("-----------------------------------");
        
        while (true) {
            esc1 = -1;
            esc2 = -1;
            //Primeiro numero
            while (esc1 < 0 || esc1 >= numeros.length) {
                System.out.print("Escolha o primeiro indice: ");
                temp = ler.next();
                try {
                    esc1 = Integer.parseInt(temp);
                    esc1--;
                    System.out.println("Indice " + esc1 + "; Numero: " + numeros[esc1]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Escolha um indice valido.");
                } catch (NumberFormatException e) {
                    System.out.println("Digite somente numeros.");
                }
            }        
            
            System.out.println("-----------------------------------");
        
            //Segundo numero
            while (esc2 < 0 || esc2 >= numeros.length) {
                System.out.print("Escolha o segundo indice: ");
                temp = ler.next();
                try {
                    esc2 = Integer.parseInt(temp);
                    esc2--;
                    System.out.println("Indice " + esc2 + "; Numero: " + numeros[esc2]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Escolha um indice valido.");
                } catch (NumberFormatException e) {
                    System.out.println("Digite somente numeros.");
                }
            }
        
            switch (operacao) {
                case "+" -> resultado = numeros[esc1] + numeros[esc2];
                case "-" -> resultado = numeros[esc1] - numeros[esc2];
                case "/" -> resultado = numeros[esc1] / numeros[esc2];
                case "*" -> resultado = numeros[esc1] * numeros[esc2];
            }
            
        
            A[cont_resultados - 1] = resultado;
            cont_resultados++;
            
            
            B[cont_resultados - 1] = resultado;
            
            
            A = B;
            
            System.out.println("-----------------------------------");
        
            System.out.println("A soma entre " + numeros[esc1] + " e " + numeros[esc2] + " = " + resultado);
        
            System.out.println(Arrays.toString(A));
            System.out.println(Arrays.toString(B));
        }
        
        
    }
    
    public static void AdicionaVetor(int valor) {
        
    }
}