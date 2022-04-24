import java.util.Scanner;

public class zad1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Podaj imię i nazwisko: ");
            String name = sc.nextLine();

            System.out.print("podaj liczbę: ");
            int i = sc.nextInt();

            System.out.print("podaj Liczbę znienne-aczecinkona: ");
            double d = sc.nextDouble();

            System.out.println("Imię i nazwisko:" + name);
            System.out.println("Liczba: " + i);
            System.out.println("Liczba zmienno-przecinkowa: " + d);
        }
}
