package dev.fuadmahmud.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

// 2390
public class RemoveStar {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                res.deleteCharAt(res.length() - 1);
            } else {
                res.append(s.charAt(i));
            }
        }

        return res.toString();
    }
}
