/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_12_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Jogador um
        String nomeJogadorUm;
        String pistas[] = new String[5];
        String filmeJogadorUm;
        
        //Jogador dois
        String nomeJogadorDois;
      
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
        System.out.println("VAMOS AS TENTATIVAS, " + nomeJogadorDois.toUpperCase() + "!");
        System.out.println("---------------------------");
        
        Jogo(filmeJogadorUm, pistas);
    }
    
    
    public static void Jogo(String filme, String[] pistas) {
        Scanner ler = new Scanner(System.in); 
        String tentativaJogadorDois;
        int tentativas = 1;
        
        for (int i = 0; i <= 4; i++) {
            System.out.println("Dica: " + pistas[i]);
            System.out.print("Seu tentativa: ");
            tentativaJogadorDois = ler.next();
            tentativaJogadorDois.toLowerCase();
            
            if (filme.equals(tentativaJogadorDois)) {
                System.out.println("PARABENS! Voce conseguiu acertar o filme com " + tentativas + " tentativas.");
                System.out.println("---------------------------");
                break;
            }
            else {
                tentativas++;
            }
            System.out.println("---------------------------");
        }
    }
}