package com.company;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();

        int a = n/100;
        int b = n%100/10;
        int c = n%10;
        int maxmin = Math.max(a,b);
        int maxmax = Math.max(maxmin,c);
        System.out.println("Найбільша цифра числа = " + maxmax);
    }
}
