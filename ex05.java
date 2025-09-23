
import java.util.Scanner;

public class ex05 {
    static Scanner sc = new Scanner(System.in);

    public static double delta(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static void main(String[] args) {

        System.out.println("Digite o valor de a: ");
        double a = sc.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();

        System.out.println(delta(a, b, c));

        if (a == 0) {
            System.out.print("A solução não exite.");
            return;
        } else {
            if (delta(a, b, c) >= 0) {

            } else {
            }
        }
    }
}
