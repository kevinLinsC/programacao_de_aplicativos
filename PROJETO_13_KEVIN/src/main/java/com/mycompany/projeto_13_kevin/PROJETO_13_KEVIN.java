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
        
        int indice;
        int i;
        int cont_resultados = 0;
        String operacao;
        int resultado = 0;
        int num1;
        int num2;
        
        cont_resultados++;
        int[] resultados = new int[cont_resultados];
        
        //Tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        indice = ler.nextInt();
        
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
        
        //Primeiro numero
        System.out.print("Escolha o primeiro indice: ");
        num1 = ler.nextInt();
        num1 = numeros[num1 - 1];
        
        //Segundo numero
        System.out.print("Escolha o segundo indice: ");
        num2 = ler.nextInt();
        num2 = numeros[num2 - 1];
        
        switch (operacao) {
            case "+" -> resultado = num1 + num2;
            case "-" -> resultado = num1 - num2;
            case "/" -> resultado = num1 / num2;
            case "*" -> resultado = num1 * num2;
        }
        
        resultados[cont_resultados] = resultado;
        
        System.out.println("A soma entre " + num1 + " e " + num2 + " = " + resultado);
        
        System.out.print(Arrays.toString(numeros));
    }
}
