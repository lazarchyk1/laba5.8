package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();
        if (25 < n & n < 100){

            System.out.println("Число " + n + " міститься в проміжку (25; 100)");

        }
        else{

            System.out.println("Число " + n + " не міститься в проміжку (25; 100)");

        }
    }
}