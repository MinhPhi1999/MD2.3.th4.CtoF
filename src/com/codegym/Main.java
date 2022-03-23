package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // khai báo biến độ C F
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        System.out.println("1: FtoC");
        System.out.println("2: CtoF");
        System.out.println("enter your choice");
        choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("nhập độ F vào đây bạn ơi: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("kết quả độ C = " + fromFtoC(fahrenheit));
                    break;
                }
                case 2:{
                    System.out.println("nhập độ C vào đây bạn ơi: ");
                    celsius = scanner.nextDouble();
                    System.out.println("kết quả độ F = " + fromCtoF(celsius));
                    break;
                }
                default:
                    System.out.println("chọn 2 cái kia thôi bro!!!");
            }
    }
    public static double fromCtoF (double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fromFtoC (double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
