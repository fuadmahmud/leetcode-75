package dev.fuadmahmud.leetcode;

import java.util.*;

// 394
public class DecodeString {
    public String solution(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            // push every element expect closing bracket to the stack
            if (!c.equals("]")) {
                stack.add(c);
            } else {
                StringBuilder substr = new StringBuilder();
                // add every element to its correspondent opening bracket
                while (!Objects.equals(stack.lastElement(), "[")) {
                    substr.insert(0, stack.pop());
                }
                // pop the opening bracket
                stack.pop();
                StringBuilder k = new StringBuilder();
                // counting the number behind the stack
                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    k.insert(0, stack.pop());
                }
                // creating the string inside the current bracket
                String z = substr.toString().repeat(Integer.parseInt(k.toString()));
                stack.add(z);
            }

        }

        // converting stack into string
        return String.join("", stack);
    }
}
