package pl.edu.wit;

import java.util.Scanner;
/** Komentarz dokumentujacy do klasy zad1zjazd1*/
public class zad1_zjazd1 {
         /* komentarz
        wielolinijkowy
        do metody main
        */
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Podaj imię i nazwisko: ");

            String name = sc.nextLine();
            // komentarz do zmiennej name //

            System.out.print("podaj liczbę: ");
            // komentarz do zmiennej i //
            int i = sc.nextInt();

            System.out.print("podaj liczbę zmienno-przecinkoną: ");
            // komentarz do zmiennej d //
            double d = sc.nextDouble();

            System.out.println("Imię i nazwisko:" + name);
            System.out.println("Liczba: " + i);
            System.out.println("Liczba zmienno-przecinkowa: " + d);
        }
}
