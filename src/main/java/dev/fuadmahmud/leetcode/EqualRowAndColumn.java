package dev.fuadmahmud.leetcode;

import java.util.Arrays;
import java.util.HashMap;

// Problem number 2352
public class EqualRowAndColumn {
    public int equalPairs(int[][] grid) {
        int res = 0;
        HashMap<String, Integer> cell = new HashMap<>();

        for (int[] row: grid) {
            String n = Arrays.toString(row);
            if (cell.containsKey(n)) {
                cell.put(n, cell.get(n)+1);
            } else {
                cell.put(n, 1);
            }
        }

        for (int i = 0; i < grid.length; i++) {
            int[] col = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                col[j] = grid[j][i];
            }
            String key = Arrays.toString(col);
            if (cell.containsKey(key)) {
                int n = cell.get(key);
                if (n > 1) {
                    res += cell.get(key);
                } else {
                    res++;
                }
            }
        }

        return res;
    }
}
