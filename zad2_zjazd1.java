import java.util.Scanner;

public class zad2_zjazd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("podaj C: ");
        double c = sc.nextDouble();

        double f = 1.8 * c + 32;

        System.out.println("Stopnie " + f + " F = " + c + " C ");

        sc.close();
    }
}
