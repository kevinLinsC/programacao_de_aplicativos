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
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int indice = 0; // Indice do vetor números.
        int i; // Variavel de indece, só para auxilios em for.
        String operacao; // Operação em que o calculo irá ser feito.
        int resultado = 0;
        int esc1;
        int esc2;
        int cont = 0;
        String temp;
        
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
        int[] resultados = new int[indice];
        
        //Pega os numeros e coloca dentro do vetor
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Digite o numero da " + (i + 1) + " posicao: ");
            String num = ler.next();
            try {
                numeros[i] = Integer.parseInt(num);
            } catch (NumberFormatException e) {
                System.out.println("ERRO! Digite somente numeros.");
                i--;
            }
        }
        
        System.out.println("-----------------------------------");

        while (true) {
            esc1 = -1;
            esc2 = -1;
            
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
            //Primeiro numero
            while (esc1 < 0 || esc1 >= numeros.length) {
                System.out.print("Escolha o primeiro indice: ");
                temp = ler.next();
                try {
                    esc1 = Integer.parseInt(temp);
                    esc1--;
                    System.out.println("Indice " + (esc1 + 1) + "; Numero: " + numeros[esc1]);
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
                    System.out.println("Indice " + (esc2 + 1) + "; Numero: " + numeros[esc2]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Escolha um indice valido.");
                } catch (NumberFormatException e) {
                    System.out.println("Digite somente numeros.");
                }
            }
            
            // Faz o calculo.
            switch (operacao) {
                case "+" -> {
                    resultado = numeros[esc1] + numeros[esc2];
                    System.out.println("A soma entre " + numeros[esc1] + " e " + numeros[esc2] + " = " + resultado);
                }
                case "-" -> {
                    resultado = numeros[esc1] - numeros[esc2];
                    System.out.println("A subtracao entre " + numeros[esc1] + " e " + numeros[esc2] + " = " + resultado);
                }
                case "/" -> {
                    try {
                        resultado = numeros[esc1] / numeros[esc2];
                        System.out.println("A divisao entre " + numeros[esc1] + " e " + numeros[esc2] + " = " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println("Erro! Impossivel dividir por zero.");
                        resultado = 0;
                    }
                }
                default -> {
                    resultado = numeros[esc1] * numeros[esc2];
                    System.out.println("A multiplicao entre " + numeros[esc1] + " e " + numeros[esc2] + " = " + resultado);
                }
            }
            
            resultados[cont] = resultado;
            cont++;
            
            if (cont >= numeros.length) {
                break;
            }

            System.out.println("-----------------------------------");
        }
        
        System.out.println(Arrays.toString(resultados));
        
    }
}