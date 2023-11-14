package dev.fuadmahmud.leetcode;

import junit.framework.TestCase;

public class DecodeStringTest extends TestCase {
    public void testDecodeString() {
        DecodeString decodeString = new DecodeString();

        String param1 = "3[a]2[bc]";
        String param2 = "3[a2[c]]";
        String param3 = "2[abc]3[cd]ef";

        assertEquals("aaabcbc", decodeString.solution(param1));
        assertEquals("accaccacc", decodeString.solution(param2));
        assertEquals("abcabccdcdcdef", decodeString.solution(param3));
    }
}
