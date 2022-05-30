package com.company;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("На якому поверсі ви знаходетесь(1-9): ");
        int p = scanner.nextInt();
        if (p > 1 & p < 9){
            Scanner scan = new Scanner(System.in);
            System.out.print("Куди їдемо?(вверх/вниз): ");
            String a = scan.nextLine();
            if(a.equals("вверх")){
                Scanner scan1 = new Scanner(System.in);
                System.out.print("Виберіть поверх від "+ p +" до 9: ");
                int b = scan1.nextInt();
                if(b == 2){
                    System.out.print("Ви піднялися на 3 поверх!");
                }else {
                    System.out.print("Ви піднялися на " + b + " поверх!");
                }
            }else if(a.equals("вниз")){
                Scanner scan2 = new Scanner(System.in);
                System.out.print("Виберіть поверх від "+ p +" до 1: ");
                int d = scan2.nextInt();
                if(d == 2){
                    System.out.print("Ви спустилися на 1 поверх!");
                }else {
                    System.out.print("Ви спустилися на "+ d +" поверх!");
                }
            }
        }else if (p == 1){
            System.out.println("Їдемо вверх!");
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Виберіть поверх(2-9): ");
            int up = scanner1.nextInt();
            if(up == 2){
                System.out.print("Ви піднялися на 3 поверх!");
            }else {
                System.out.print("Ви піднялися на " + up + " поверх!");
            }
        }else if (p == 9){
            System.out.println("Їдемо вниз!");
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Виберіть поверх(8-1): ");
            int dow = scanner2.nextInt();
            if(dow ==2){
                System.out.print("Ви спустилися на 1 поверх!");
            }else {
                System.out.print("Ви спустилися на "+ dow +" поверх!");
            }
        }
    }
}
