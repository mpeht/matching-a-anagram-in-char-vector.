/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anagram;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class Anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int j, i = 0, count = 0, num = 0;
        char aux;

        System.out.println("Input number of vector size: ");
        num = sc.nextInt();

        char vector[] = new char[num];
        char vector02[] = new char[num];
        int num02 = (vector.length - 1);

        for (i = 0; i < vector.length; i++) {
            System.out.println("Enter the letter to fill the char vector: ");
            vector[i] = sc.next().charAt(0);
            aux = vector[i];
            vector02[num02] = aux;
            num02--;
        }
        if (Arrays.equals(vector, vector02)) {
            System.out.println(vector);
            System.out.println("This is a anagram.");
        } else {
            System.out.println(vector);
            System.out.println("This is not a anagram.");
        }
    }
}
