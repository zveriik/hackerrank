package compleate;

import java.util.*;

/**
 * Created by Zveriki on 16.02.2015.
 */
public class CountingSortNext {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(in.nextLine().replaceAll("[^0-9]+", "")));
        }

        Map<Integer, Integer> numbersRepeat = new HashMap<Integer, Integer>();
        for (int digit : list) {
            int count = numbersRepeat.get(digit) == null ? 0 : numbersRepeat.get(digit);
            numbersRepeat.put(digit, count + 1);
        }
        List<Integer> output = new ArrayList<Integer>();
        for (int limit = 0; limit < 99; limit++) {
            int count = 0;
            for (int check = 0; check < limit; check++) {
                if (numbersRepeat.containsKey(check)) count += numbersRepeat.get(check);
            }
            if (count>0) output.add(count);
        }
        StringBuilder outputString = new StringBuilder(output.get(0));
        for (int i=1; i<output.size()-1;i++) {
            outputString.append(" ").append(i);
        }
        System.out.println(outputString.toString());
    }
}
