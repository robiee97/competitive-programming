import java.util.*;

public class memoriseMe {

    public static void main(String args[]) {

        int[] arr = { 1, 1, 1, 2, 2, 0 };
        memoriseMeProb(arr, 1);
        memoriseMeProb(arr, 2);
        memoriseMeProb(arr, 1);
        memoriseMeProb(arr, 0);
        memoriseMeProb(arr, 3);
        memoriseMeProb(arr, 4);
    }

    public static void memoriseMeProb(int[] arr, int query) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }
        if (map.containsKey(query)) {
            System.out.println(map.get(query));
        } else {
            System.out.println("NOT PRESENT");
        }
    }
}
