import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        int iterNum = in.length() / 2;
        int count = 0;
        for (int i = 0, j = in.length() - 1; i < iterNum; i++, j--) {
            if (in.charAt(i) != in.charAt(j)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
