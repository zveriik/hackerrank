package compleate;

import javafx.util.Pair;

import java.util.*;

/**
 * Created by Zveriki on 16.02.2015.
 */
public class ClosestNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] numbersString = in.nextLine().split(" ");
        Integer[] integers = new Integer[numbersString.length];
        for (int i = 0; i < numbersString.length; i++) {
            integers[i] = Integer.parseInt(numbersString[i]);
        }
        Arrays.sort(integers);
        TreeMap<Integer, List<Integer>> outputMap = new TreeMap<Integer, List<Integer>>();
        for (int i = 0; i < integers.length - 1; i++) {
            int difference = integers[i+1]-integers[i];
            if (outputMap.get(difference)==null){
                outputMap.put(difference, new ArrayList<Integer>());
            }
            outputMap.get(difference).add(integers[i]);
            outputMap.get(difference).add(integers[i+1]);
        }
        Integer key = outputMap.firstKey();
        List<Integer> outputList = outputMap.get(key);
        StringBuilder outputString = new StringBuilder(outputList.get(0).toString());
        for (int i=1; i<outputList.size(); i++) {
            outputString.append(" ").append(outputList.get(i).toString());
        }
        System.out.println(outputString.toString());
    }
}
