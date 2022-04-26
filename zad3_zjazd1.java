package pl.edu.wit;

import java.util.Scanner;

public class zad3_zjazd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your weight(kg): ");
        double weight = sc.nextDouble();

        System.out.print("Your height(cm): ");
        double height = (double)sc.nextDouble()/100.0;

        double bmi = weight/(height*height);

        System.out.println("Your body mass index is " + bmi);

    }
}
