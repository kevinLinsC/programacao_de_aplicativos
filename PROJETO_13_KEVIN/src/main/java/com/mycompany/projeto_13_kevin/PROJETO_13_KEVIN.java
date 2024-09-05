/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_kevin;

import java.util.Arrays;
import java.util.InputMismatchException;
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
        int cont_resultados = 1;
        String operacao; // Operação em que o calculo irá ser feito.
        int resultado = 0;
        int num1 = 0;
        int num2 = 0;
        String temp;
        
        int[] A = new int[1];
        
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
        
        //Usuario escolhe a operacao que será feito
        while (true) {
            System.out.print("Escolha a operacao (+ | - | * | /): ");
            operacao = ler.next();
            if (operacao.equals("/") || operacao.equals("*") || operacao.equals("+") || operacao.equals("-")) {
                break;
            }
        }
        
        //Escreve a posicao de cada numero
        for (i = 0; i < numeros.length; i++) {
            System.out.println("posicao " + (i + 1) + ": " + numeros[i]);
        }
        
        while (true) {
            //Primeiro numero
            num1 = 0;
            num2 = 0;
            while (num1 < 1 && num1 > numeros.length) {
                System.out.print("Escolha o primeiro indice: ");
                temp = ler.next();
                try {
                    num1 = Integer.parseInt(temp);
                    num1 = numeros[num1 - 1];
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Escolha um indice valido.");
                } catch (NumberFormatException e) {
                    System.out.println("Digite somente numeros.");
                }
            }
            
        
            //Segundo numero
            while (num2 <= 0) {
                System.out.print("Escolha o segundo indice: ");
                temp = ler.next();
                try {
                    num2 = Integer.parseInt(temp);
                    num2 = numeros[num2 - 1];
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Escolha um indice valido.");
                } catch (NumberFormatException e) {
                    System.out.println("Digite somente numeros.");
                }
            }
        
            switch (operacao) {
                case "+" -> resultado = num1 + num2;
                case "-" -> resultado = num1 - num2;
                case "/" -> resultado = num1 / num2;
                case "*" -> resultado = num1 * num2;
            }
            
        
            A[cont_resultados - 1] = resultado;
            cont_resultados++;
            
            int[] B = new int[cont_resultados];
            B[cont_resultados - 1] = resultado;
            A = B;
        
            System.out.println("A soma entre " + num1 + " e " + num2 + " = " + resultado);
        
            System.out.println(Arrays.toString(numeros));
            System.out.println(Arrays.toString(A));
            System.out.println(Arrays.toString(B));
        }
        
        
    }
}