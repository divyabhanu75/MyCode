package com.company;

import java.util.Scanner;

public class FindVowel {

    public static void main(String[] args) {

        //Program to find whether a character is vowel or consonant
        //Step 1: use scanner and retrieve input charcter
        //Step 2: use a boolen expression in a condition to check whether inpu character is vowel
        //step 3: If vowel print its a vowel else print its a consonat
        int count = 0;

        while (count<5) {
            System.out.println("please enter a alphabet");
            Scanner scan = new Scanner(System.in);
            char inputChar = scan.next().charAt(0);

            if (inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u') {
                System.out.println("Its a vowel");
            } else {
                System.out.println("Its a consonant");
            }
            count++;
        }
        System.out.println("End of the Program");
    }
}
