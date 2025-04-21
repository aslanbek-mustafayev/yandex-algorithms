import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int curMax = 0;
        int curMaxCount = 0;
        int curNum;
        do {
            curNum = scanner.nextInt();
            if (curNum > curMax) {
                curMax = curNum;
                curMaxCount = 1;
            } else if (curNum == curMax) {
                curMaxCount += 1;
            }
        } while (curNum != 0);
        System.out.println(curMaxCount);
}
