package org.ucodeit.second;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String userInput = scanner.next();

        if (userInput.length() != 1 || !Character.isLetter(userInput.charAt(0))) {
            System.out.println("Error: Please enter a single character.");
        } else {
            char inputChar = userInput.charAt(0);
            inputChar = Character.toLowerCase(inputChar);

            if (isVowel(inputChar)) {
                System.out.println(inputChar + " is a vowel.");
            } else {
                System.out.println(inputChar + " is a consonant.");
            }
        }

        scanner.close();
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

