package Week1;

import java.util.*;

public class AutoUnboxing {
    public static void main(String args[]) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            integerList.add(Integer.valueOf(i)); // autoboxing
        }
        int sum = 0;
        for (Integer i : integerList) {
            sum += i; // Integer to int unboxing
        }
        System.out.println(sum);

    }
}
