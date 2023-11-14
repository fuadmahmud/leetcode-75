package dev.fuadmahmud.leetcode;

import junit.framework.TestCase;

public class StringOccurrenceTest extends TestCase {

    public void testStringOccurrence() {
        StringOccurrence stringOccurrence = new StringOccurrence();

        String param1 = "aaaabbbb";
        String param2 = "ccaaffddecee";
        String param3 = "eeee";
        String param4 = "example";

        // should become either aaaabbb or aaabbbb which one of them is less
        // and the operation is 1
        assertEquals(1, stringOccurrence.solution(param1));
        // should become word ccaadc which contain c 3 times, a 2 times and d one time
        assertEquals(6, stringOccurrence.solution(param2));
        assertEquals(0, stringOccurrence.solution(param3));
        // should become exe
        assertEquals(4, stringOccurrence.solution(param4));
    }

}
