package compleate;

import java.util.*;

/**
 * Created by Zveriki on 13.02.2015.
 */
public class GemStones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        List<Set<String>> strings = new ArrayList<Set<String>>();
        while (a >= 0) {
            strings.add(new HashSet<String>(Arrays.asList(in.nextLine().split(""))));
            a--;
        }
        strings.remove(0);
        Set<String> current = strings.remove(0);
        while (!strings.isEmpty()) {
            Set<String> next = strings.remove(0);
            next.retainAll(current);
            current = next;
        }
        System.out.println(current.size() - 1);
    }
}
