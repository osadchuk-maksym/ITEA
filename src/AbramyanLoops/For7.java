package AbramyanLoops;

import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++)
                sum += i;
            System.out.println(sum);
        }
    }
}
