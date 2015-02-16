package compleate;

import java.util.*;

/**
 * Created by Zveriki on 15.02.2015.
 */
public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        List<Integer> numberDeleting = new ArrayList<Integer>();
        while (a > 0) {
            String inputString = in.nextLine();
            numberDeleting.add(inputString.length() - inputString.replaceAll("([A-Z])\\1+", "$1").length());
            a--;
        }
        for (Integer del : numberDeleting) {
            System.out.println(del);
        }
    }
}
