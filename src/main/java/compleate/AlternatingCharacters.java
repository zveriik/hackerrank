package compleate;

import java.util.*;

/**
 * Created by Zveriki on 15.02.2015.
 */
public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        List<Integer> numberDeleting = new ArrayList<Integer>();
        while (a >= 0) {
            String inputString = in.nextLine();
            numberDeleting.add(inputString.length() - inputString.replaceAll("([a-z])\\1+", "$1").length());
            a--;
        }
        for (Integer del : numberDeleting) {
            System.out.println(del);
        }
    }
}
