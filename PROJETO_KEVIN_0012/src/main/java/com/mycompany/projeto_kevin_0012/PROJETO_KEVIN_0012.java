/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_kevin_0012;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_KEVIN_0012 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Jogador um
        String nomeJogadorUm;
        String pistas[] = new String[5];
        String filmeJogadorUm;
        
        //Jogador dois
        String nomeJogadorDois;
        String tentativaJogadorDois;
        int tentativas = 1;
        
        
        //Perguntas jogador um
        System.out.print("Digite seu nome jogador um: ");
        nomeJogadorUm = ler.next();
        
        System.out.println("---------------------------");
        
        System.out.print("Digite o nome do filme a ser adivinhado: ");
        filmeJogadorUm = ler.next();
        filmeJogadorUm.toLowerCase();
        
        System.out.println("---------------------------");
        System.out.println("DIGITE AS PISTAS SOBRE O SEU FILME, " + nomeJogadorUm.toUpperCase() + "!");
        System.out.println("---------------------------");
        
        for (int i = 0; i <= 4; i++) {
            System.out.print("Digite a " + (i + 1) + " pista: ");
            pistas[i] = ler.next();
        }
        
        //Perguntas jogador dois
        
        System.out.println("---------------------------");
        System.out.print("Digite seu nome jogador dois: ");
        nomeJogadorDois = ler.next();
        
        System.out.println("---------------------------");
        System.out.println("VAMOS AS PISTAS, " + nomeJogadorDois.toUpperCase() + "!");
        System.out.println("---------------------------");
        
        for (int i = 0; i <= 4; i++) {
            System.out.println("Dica: " + pistas[i]);
            System.out.print("Seu chute: ");
            tentativaJogadorDois = ler.next();
            tentativaJogadorDois.toLowerCase();
            
            if (filmeJogadorUm.equals(tentativaJogadorDois)) {
                System.out.println("PARABENS! Voce conseguiu acertar o filme com " + tentativas + "tentativas.");
                break;
            }
            else {
                tentativas++;
            }
            System.out.println("---------------------------");
        }
    }
}
