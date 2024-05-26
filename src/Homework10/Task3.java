package Homework10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        String[] words = input.split(" ");
        System.out.println("Введите номер слова, которое нужно проверить: ");
        int number = scan.nextInt();
        if (number > words.length) {
            System.out.println("Номер слова превышает реальное количество.");
        } else {
            String selectedWord = words[number - 1];
            String reversedWord1 = new StringBuilder(selectedWord).reverse().toString();

            if (selectedWord.equalsIgnoreCase(reversedWord1)) {
                System.out.println("Слово является палиндромом.");
            } else {
                System.out.println("Слово не является палиндромом.");
            }
        }
    }
}

