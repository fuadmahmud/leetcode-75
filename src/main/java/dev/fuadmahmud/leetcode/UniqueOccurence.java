package dev.fuadmahmud.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueOccurence {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int n: arr) {
            if (mp.containsKey(n)) {
                mp.put(n, mp.get(n)+1);
            } else {
                mp.put(n, 1);
            }
        }

        for (int v: mp.values()) {
            if (set.contains(v)) {
                return false;
            } else {
                set.add(v);
            }
        }

        return true;
    }
}
