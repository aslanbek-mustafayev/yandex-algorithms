import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int readNum = num / 2 + 1;
        int position = 0;
        for (int i = 1; i <= readNum; i++) {
            position = scanner.nextInt();
        }
        System.out.println(position);
    }
}
