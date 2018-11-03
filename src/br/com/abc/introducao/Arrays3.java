/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.abc.introducao;

/**
 *
 * @author Fernando
 */
public class Arrays3 {

    public static void main(String[] args) {

        // Existem 3 formas de iniciar um Array.
        int[] numeros = new int[5];                 // Forma 1
        int[] numeros2 = {1, 2, 3, 4, 5};           // Forma 2
        int[] numeros3 = new int[]{6, 7, 8, 9, 10};  // Forma 3
        
        // Existem 2 formas de percorrer um Array.
        System.out.println("Forma 1 ---------------------------------");
        for(int i = 0; i < numeros2.length; i++) {  // Forma 1
            System.out.println(numeros2[i]);
        }
        
        System.out.println("Forma 2 ---------------------------------");
        for(int aux : numeros3) {                   // Forma 2 (Foreach)
            System.out.println(aux);
        }
    }
}