package dev.fuadmahmud.leetcode;

public class GuessNumber {
    private int pick;

    public GuessNumber(int pick) {
        this.pick = pick;
    }
    public int guessNumber(int n) {
        long s = 1;
        while (s <= n)
        {
            int x = (int)((n + s) / 2);
            int g = guess(x);
            if (g == 0)  return x;
            if (g < 0)   n = x - 1;
            if (g > 0)   s = x + 1;
        }
        return -1;
    }

    public int guess(int n) {
        if (n > pick) return -1;
        else if (n < pick) return 1;
        return 0;
    }

    public void setPick(int n) {
        pick = n;
    }
}
