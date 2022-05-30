package com.company;
import java.util.Scanner;

public class fourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Погодитись/Відмовитись: ");
        String p = scanner.nextLine();
        switch (p) {
            case "Так":
                System.out.println("Я погоджуюсь!");
                break;
            case "ОК":
                System.out.println("Я погоджуюсь!");
                break;
            case "Yes":
                System.out.println("Я погоджуюсь!");
                break;
            case "Y":
                System.out.println("Я погоджуюсь!");
                break;
            case "+":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
                System.out.println("Я відмовляюcь!");
                break;
            case "No":
                System.out.println("Я відмовляюcь!");
                break;
            case "N":
                System.out.println("Я відмовляюcь!");
                break;
            case "-":
                System.out.println("Я відмовляюcь!");
                break;
            case "NO":
                System.out.println("Я відмовляюcь!");
                break;
        }
    }
}