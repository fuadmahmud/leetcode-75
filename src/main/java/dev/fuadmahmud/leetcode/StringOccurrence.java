package dev.fuadmahmud.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringOccurrence {
    public int solution(String S) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            char n = S.charAt(i);
            if (mp.containsKey(n)) {
                mp.put(n, mp.get(n)+1);
            } else {
                mp.put(n, 1);
            }
        }

        Set<Integer> set = new HashSet<>(mp.values());
        int max = 0;
        int maxWordPossible = 0;

        for (int s: set) {
            max = Math.max(max, s);
        }

        for (int i = 0; i < mp.size(); i++) {
            maxWordPossible += max;
            max--;
            if (max < 1) {
                break;
            }
        }

        return S.length() - maxWordPossible;
    }
}
