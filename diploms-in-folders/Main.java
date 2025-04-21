import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        int max = 0;
        for (int i = 0, temp = 0; i < num; i++) {
            temp = scan.nextInt();
            sum += temp;
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(sum - max);
    }
}
