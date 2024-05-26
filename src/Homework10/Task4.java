package Homework10;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scan.nextLine();
        StringBuilder duplicate = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char newString = input.charAt(i);
            duplicate.append(newString).append(newString);
        }
        System.out.println(duplicate);
    }
}