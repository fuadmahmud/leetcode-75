package dev.fuadmahmud.leetcode;

import junit.framework.TestCase;

import static org.junit.Assert.*;

public class AsteroidCollisionTest extends TestCase {
    public void testAsteroidCollision() {
        AsteroidCollision asteroidCollision = new AsteroidCollision();

        int[] param1 = {5,10,-5};
        int[] param2 = {8,-8};
        int[] param3 = {10,2,-5};
        int[] param4 = {10,2,-5,-18};
        int[] param5 = {-2,-2,1,-2};

        int[] ans1 = {5,10};
        int[] ans2 = {};
        int[] ans3 = {10};
        int[] ans4 = {-18};
        int[] ans5 = {-2,-2,-2};

        assertArrayEquals(ans1, asteroidCollision.asteroidCollision(param1));
        assertArrayEquals(ans5, asteroidCollision.asteroidCollision(param5));
        assertArrayEquals(ans2, asteroidCollision.asteroidCollision(param2));
        assertArrayEquals(ans3, asteroidCollision.asteroidCollision(param3));
        assertArrayEquals(ans4, asteroidCollision.asteroidCollision(param4));
    }
}
