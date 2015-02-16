package compleate;

import java.util.Scanner;

/**
 * Created by Zveriki on 15.02.2015.
 */
public class MaxXOR {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int left = in.nextInt();
        int right = in.nextInt();
        int count = 0;
        int maxBit = 0;
        while (left != 0 || right != 0) {
            count++;
            if ((left & 1) != (right & 1)) {
                maxBit = count;
            }
            left >>= 1;
            right >>= 1;
        }
        System.out.println((1 << maxBit) - 1);
    }
}
