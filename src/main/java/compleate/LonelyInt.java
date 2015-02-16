package compleate;

import java.util.Scanner;

/**
 * Created by Zveriki on 13.02.2015.
 */
public class LonelyInt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] numbersString = in.nextLine().split(" ");
        int s = Integer.parseInt(numbersString[0]);
        for (int i = 1; i < numbersString.length; i++) {
            s = s ^ Integer.parseInt(numbersString[i]);
        }
        System.out.println(s);
    }
}
