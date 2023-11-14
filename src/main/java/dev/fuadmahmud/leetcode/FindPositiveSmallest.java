package dev.fuadmahmud.leetcode;

import java.util.HashMap;

public class FindPositiveSmallest {
    public int solution(int[] arr) {
        int sm = 1;
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int a: arr) {
            if (a > 0) {
                if (mp.containsKey(a)) {
                    mp.put(a, mp.get(a) + 1);
                } else {
                    mp.put(a, 1);
                }
            }
        }

        while (true) {
            if (mp.containsKey(sm)) {
                sm++;
            } else {
                return sm;
            }
        }
    }
}
