/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_15_kevin;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author k.andrade
 */
public class PROJETO_15_KEVIN {

    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String s;
        int[] num = new int[5];
        int i;
        
        for (i = 0; i < num.length; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            try {
                num[i] = Integer.parseInt(s);
            }
            catch (NumberFormatException e) {
                System.out.println("ERRO! Digite somente numeros inteiros.");
                i--;
            }
        }
        
        for (i = 0; i < num.length; i++) {
            FileWriter arquivo = new FileWriter("C:\\Users\\k.andrade\\Desktop\\tabuada " + (i + 1) + " num " + num[i] + ".txt");
            PrintWriter gravar = new PrintWriter(arquivo);
            gravar.printf("Tabuada de " + num[i]);
            gravar.printf("\n------------------------------");
            for (int j = 1; j <= 10; j++) {
                gravar.printf("\n" + num[i] + " x " + j + " = " + (num[i] * j));
            }
            gravar.printf("\n------------------------------");
            arquivo.close();
        }
    }
}
