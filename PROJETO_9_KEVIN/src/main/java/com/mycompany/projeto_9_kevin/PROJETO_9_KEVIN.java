/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_9_kevin;

import java.util.Random;

/**
 *
 * @author kevin
 */
public class PROJETO_9_KEVIN {
    static int sinal_verde = 30; static int sinal_amarelo = 5; static int sinal_vermelho = 45;
    static int tempo_total = 600;
    
    
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        // primeira interseção
        int carros_passaram1 = 0; int fila1 = aleatorio.nextInt(1, 5); int tempo_medio1 = 0; int congestionado1 = 0;
        
        // segunda interseção
        int carros_passaram2 = 0; int fila2 = aleatorio.nextInt(1, 5); int tempo_medio2 = 0; int congestionado2 = 0;
        
        // terceira interseção
        int carros_passaram3 = 0; int fila3 = aleatorio.nextInt(1, 5); int tempo_medio3 = 0; int congestionado3 = 0;
        
        for (int i = 1; i <= tempo_total; i++) {
            
            // primeira interseção
            String semaforo1 = Estado_semaforo(i);
            System.out.println("segundos: " + i + "; intersecao 1: " + semaforo1 + "; fila 1: " + fila1);
            
            if (semaforo1.equals("verde")) {
                int passa_ou_nao = aleatorio.nextInt(1, 8);
                if (passa_ou_nao == 1) {
                    while (fila1 > 0) {
                        carros_passaram1++;
                        fila1--;
                        break;
                    }
                }
            }
            else {
                tempo_medio1 += 1;
            }
            
            if (fila1 < 10) {
                if (i % 15 == 0) {
                    fila1++;
                }
            }
            else {
                congestionado1++;
            }
            
            
            
            String semaforo2 = Estado_semaforo(i);
            System.out.println("segundos: " + i + "; intersecao 2: " + semaforo2 + "; fila 2: " + fila2);
            
            if (semaforo2.equals("verde")) {
                int passa_ou_nao = aleatorio.nextInt(1, 8);
                if (passa_ou_nao == 1) {
                    while (fila2 > 0) {
                        carros_passaram2++;
                        fila2--;
                        break;
                    }
                }
            }
            else {
                tempo_medio2 += 1;
            }
            
            if (fila2 < 10) {
                if (i % 15 == 0) {
                    fila2++;
                }
            }
            else {
                congestionado2++;
            }
            
            String semaforo3 = Estado_semaforo(i);
            System.out.println("segundos: " + i + "; intersecao 3: " + semaforo3 + "; fila 3: " + fila3);
            
            if (semaforo3.equals("verde")) {
                int passa_ou_nao = aleatorio.nextInt(1, 8);
                if (passa_ou_nao == 1) {
                    while (fila3 > 0) {
                        carros_passaram3++;
                        fila3--;
                        break;
                    }
                }
            }
            else {
                tempo_medio3 += 1;
            }
            
            if (fila3 < 10) {
                if (i % 15 == 0) {
                    fila3++;
                }
            }
            else {
                congestionado3++;
            }
            
        }
        
        tempo_medio1 = tempo_medio1 / (600/80);
        tempo_medio2 = tempo_medio2 / (600/80);
        tempo_medio3 = tempo_medio3 / (600/80);
        
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("O total de carros que passaram na primeira intersecao: " + carros_passaram1);
        System.out.println("Com um tempo medio de " + tempo_medio1 + ". A quantidade de carros que ficaram no congestionamento foram de " + congestionado1 + ".");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("O total de carros que passaram na segunda intersecao: " + carros_passaram2);
        System.out.println("Com um tempo medio de " + tempo_medio2 + ". A quantidade de carros que ficaram no congestionamento foram de " + congestionado2 + ".");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("O total de carros que passaram na terceira intersecao: " + carros_passaram3);
        System.out.println("Com um tempo medio de " + tempo_medio3 + ". A quantidade de carros que ficaram no congestionamento foram de " + congestionado3 + ".");
    }
    
    public static String Estado_semaforo(int segundos) {
        int tempo_ciclo = segundos % (sinal_verde + sinal_amarelo + sinal_vermelho);
        if ((tempo_ciclo <= sinal_verde) && tempo_ciclo != 0) {
            return "verde";
        }
        else if ((tempo_ciclo <= sinal_verde + sinal_amarelo) && tempo_ciclo != 0)
        {
            return "amarelo";
        }
        else {
            return "vermelho";
        }
    }
}
