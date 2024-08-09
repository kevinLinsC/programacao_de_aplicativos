/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_7_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_7_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu peso em kg: ");
        float peso = ler.nextFloat();
        
        System.out.println("Digite sua altura em metros: ");
        float altura = ler.nextFloat();
        
        float imc = peso / (altura * altura);
        System.out.println("Seu imc: " + imc);
        
        if (imc < 18.5) {
            System.out.println("Abaixo do peso normal.");
        }
        else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal.");
        }
        else if (imc >= 25 && imc < 30) {
            System.out.println("Excesso de peso.");
        }
        else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade classe I");
        }
        else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade classe II");
        }
        else if (imc >= 40) {
            System.out.println("Obesidade classe III");
        }
        
    }
}
