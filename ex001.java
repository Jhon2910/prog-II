import java.util.Scanner;

public class ex001 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int x;

        System.out.print("x: ");
        if (!sc.hasNextInt()){
            System.out.print("Erro!");
            return;
        }
        x = sc.nextInt();

        if (x < 1 || x > 12){
            System.out.print("Erro!");
        }
        else {
            if (x == 1){
                System.out.print("Janeiro");
            } else if (x == 2) {
                System.out.print("Fevereiro");
            }
            else if (x == 3) {
                System.out.print("marco");
            }
            else if (x == 4) {
                System.out.print("abril");
            }
            else if (x == 5) {
                System.out.print("maio");
            }
            else if (x == 6) {
                System.out.print("junho");
            }
            else if (x == 7) {
                System.out.print("julho");
            }else if (x == 8) {
                System.out.print("agosto");
            }else if (x == 9) {
                System.out.print("setembro");
            }else if (x == 10) {
                System.out.print("outubro");
            }
            else if (x == 11) {
                System.out.print("novembro");
            }
            else {
                System.out.print("dezembro");
            }
        }
        sc.close;
    }

}
