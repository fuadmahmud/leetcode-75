package dev.fuadmahmud.leetcode;

import junit.framework.TestCase;

public class FindPositiveSmallestTest extends TestCase {
    public void testFindPositiveSmallest() {
        FindPositiveSmallest findPositiveSmallest = new FindPositiveSmallest();

        int[] param1 = {1,2,3,4,6,1};
        int[] param2 = {-1,-2};
        int[] param3 = {1,2,3,4,5,6,7,8,9,10,14,15};

        assertEquals(5, findPositiveSmallest.solution(param1));
        assertEquals(1, findPositiveSmallest.solution(param2));
        assertEquals(11, findPositiveSmallest.solution(param3));
    }

}
