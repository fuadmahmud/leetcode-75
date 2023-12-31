package dev.fuadmahmud.leetcode;

import java.util.Arrays;
import java.util.Stack;

// 735
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            int asteroid = asteroids[i];
            while (j>0 && asteroids[j-1]>0 && asteroid<0 && asteroids[j-1] < Math.abs(asteroid))
            {j--;}

            if (j==0 || asteroid>0 || asteroids[j-1]<0) {
                System.out.println(j);
                asteroids[j++] = asteroid;
                System.out.println(j);
                System.out.println(Arrays.toString(asteroids));
            }
            else if(asteroids[j-1] == Math.abs(asteroid))
                j--;
        }

        int[] result = new int[j];
        System.arraycopy(asteroids, 0, result, 0, j);

        return result;
    }
}
