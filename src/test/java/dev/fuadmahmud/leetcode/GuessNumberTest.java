package dev.fuadmahmud.leetcode;

import junit.framework.TestCase;
import org.junit.Before;

public class GuessNumberTest extends TestCase {

    public void testResult() {
        GuessNumber guessNumber = new GuessNumber(333);
        assertEquals(333, guessNumber.guessNumber(100000));
    }

}
