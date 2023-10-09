package dev.fuadmahmud.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FindDifferenceTest extends TestCase {
    public void testTestCase1() {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();
        ans1.add(1);
        ans1.add(3);
        ans2.add(4);
        ans2.add(6);
        res.add(ans1);
        res.add(ans2);

        FindDifference findDifference = new FindDifference();
        assertEquals(res, findDifference.findDifference(nums1, nums2));
    }

}
