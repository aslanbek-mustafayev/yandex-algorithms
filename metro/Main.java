import static java.lang.Math.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int answer = min((n - max(a, b) + min(a, b)), abs(a - b)) - 1;
        System.out.println(answer);
    }
}
