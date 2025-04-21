import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        Integer left = null;
        Integer right = null;

        for (int i = 0, j = 9; i < 10; i++, j--) {
            if (input[i].equals("2")) {
                if (left == null) {
                    left = i;
                } else if (i >= left) {
                    left = i;
                }
            } else if (input[i].equals("1") && left != null) {
                if (arr[i] == 0 || (i - left) < arr[i]) {
                    arr[i] = i - left;
                }
            }

            if (input[j].equals("2")) {
                if (right == null) {
                    right = j;
                } else if (j <= right) {
                    right = j;
                }
            } else if (input[j].equals("1") && right != null) {
                if (arr[j] == 0 || right - j < arr[j]) {
                    arr[j] = (right - j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[9]);
    }
}
