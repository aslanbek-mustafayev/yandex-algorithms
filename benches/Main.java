import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int num = scan.nextInt();
        int left = 0;
        int right = len - 1;
        if (len % 2 == 0) {
            int mid = len / 2;
            for (int i = 0, temp; i < num; i++) {
                temp = scan.nextInt();
                if (temp < mid && temp > left) {
                    left = temp;
                } else if (temp >= mid && temp < right) {
                    right = temp;
                }
            }
            System.out.println(left + " " + right);
        } else {
            int mid = len / 2;
            boolean midEl = false;
            for (int i = 0, temp; i < num; i++) {
                temp = scan.nextInt();
                if (mid == temp) {
                    midEl = true;
                } else if (temp < mid && temp > left) {
                    left = temp;
                } else if (temp > mid && temp < right) {} else if (
                    temp > mid && temp < right
                ) {
                    right = temp;
                }
            }
            System.out.println(midEl == true ? mid : left + " " + right);
        }
    }
}
