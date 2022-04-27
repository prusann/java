import java.util.Scanner;

public class area_and_peremeter {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("podaj dane kwadratu. ");
            System.out.print("podaj bok a: ");
            int s_a = sc.nextInt();
            double s_area = s_a * s_a;
            int s_perimeter = 4 * s_a;
            System.out.println("Pole kwadratu: " + s_area + ". Obwód kwadratu: " + s_perimeter + " dla boku " + s_a);

            System.out.println("Podaj dane prostokąta. ");
            System.out.print("podaj bok a: ");
            int r_a = sc.nextInt();
            System.out.print("podaj bok b: ");
            int r_b = sc.nextInt();
            int r_area = r_a * r_b;
            int r_perimeter = 2 * r_a + 2 * r_b;
            System.out.println("Pole prostokąta: " + r_area + ", obwód prostokąta: " + r_perimeter + ", dla boków " + r_a + " oraz b: " + r_b);


            System.out.println("Podaj dane trójkąta. ");
            System.out.print("podaj bok a: ");
            int t_a = sc.nextInt();
            double t_area = (((t_a * t_a) * Math.sqrt(3)) / 4);
            int t_perimeter = 3 * t_a;
            System.out.println("Pole trójkąta: " + t_area + ". Obwód trójkąta: " + t_perimeter + " dla boku " + t_a);


            System.out.println("Podaj dane rąbu. ");
            System.out.print("podaj bok a: ");
            int rh_a = sc.nextInt();
            System.out.print("podaj wysokość: ");
            int rh_h = sc.nextInt();
            int rh_area = rh_a * rh_h;
            int rh_perimeter = 4 * rh_a;
            System.out.println("Pole rąbu: " + rh_area + ", obwód rąbu: " + rh_perimeter + ", dla boku " + rh_a + " oraz wysokości: " + rh_h);
            sc.close();

        }
    }
