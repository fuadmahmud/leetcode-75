package dev.fuadmahmud.leetcode;

import junit.framework.TestCase;

public class EqualRowAndColumnTest extends TestCase {

    public void testEqualPairs() {
        EqualRowAndColumn equalRowAndColumn = new EqualRowAndColumn();
        int[][] params1 = {{3,2,1}, {1,7,6}, {2,7,7}};
        int[][] params2 = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};

//        assertEquals(1, equalRowAndColumn.equalPairs(params1));
        assertEquals(3, equalRowAndColumn.equalPairs(params2));
    }
}
