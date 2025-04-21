import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int i = scan.nextInt();
        int c = scan.nextInt();
        int f = 0;
        if (i == 0 && r != 0) {
            f = 3;
        } else if ((i == 0) ^ (i == 1)) {
            f = c;
        } else if (i == 4 && r != 0) {
            f = 3;
        } else if (i == 7) {
            f = 1;
        } else f = i == 6 ? 0 : i;
        System.out.println(f);
    }
}
