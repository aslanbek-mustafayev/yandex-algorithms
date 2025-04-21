import static java.lang.Math.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x >= 0 && y >= 0 && y <= d - x) {
            System.out.println(0);
        } else {
            double toB = sqrt(pow(x - d, 2) + pow(y, 2));
            double toC = sqrt(pow(x, 2) + pow(y - d, 2));
            double toA = sqrt(pow(x, 2) + pow(y, 2));
            double minimal = min(toA, min(toB, toC));
            if (minimal == toA) {
                System.out.println(1);
            } else if (minimal == toB) {
                System.out.println(2);
            } else if (minimal == toC) {
                System.out.println(3);
            }
        }
    }
}
