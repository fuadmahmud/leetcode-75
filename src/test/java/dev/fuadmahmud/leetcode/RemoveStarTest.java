package dev.fuadmahmud.leetcode;

import junit.framework.TestCase;

public class RemoveStarTest extends TestCase {
    public void testRemoveStar() {
        RemoveStar removeStar = new RemoveStar();

        String params1 = "leet**cod*e";
        String params2 = "erase*****";
        String params3 = "abb*cdfg*****x*";
        assertEquals("lecoe", removeStar.removeStars(params1));
        assertEquals("", removeStar.removeStars(params2));
        long start = System.currentTimeMillis();
        assertEquals("a", removeStar.removeStars(params3));
        long end = System.currentTimeMillis();
        long diff = end - start;
        System.out.println(diff);
    }

}
