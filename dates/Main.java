import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if ((a == b) ^ (a > 12) ^ (b > 12)) {
            System.out.println(1);
        } else System.out.println(0);
    }
}
