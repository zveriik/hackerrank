package compleate;

import java.util.*;

public class Pangram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        a = in.nextLine().toLowerCase().replaceAll(" ", "");
        Set<String> set = new HashSet<String>(Arrays.asList(a.split("")));
        System.out.println(set.size() > 27 ? "pangram" : "not pangram");
    }
}