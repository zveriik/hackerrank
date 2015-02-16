package compleate;

import java.util.*;

/**
 * Created by Zveriki on 13.02.2015.
 */
public class MakeItAnagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a, b;
        a = in.nextLine();
        b = in.nextLine();
        List<String> al = new ArrayList<String>(Arrays.asList(a.split("")));
        List<String> bl = new ArrayList<String>(Arrays.asList(b.split("")));
        int count = 0;
        for (String s : al) {
            if (bl.contains(s)) {
                bl.remove(s);
                count++;
            }
        }
        System.out.println(al.size() + bl.size() - count);
    }
}
