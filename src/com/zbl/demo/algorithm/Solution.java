package com.zbl.demo.algorithm;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num - 1; j++) {
                if ((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;

    }


    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                if (allUnique(s, i, j)) {
                    maxLen = Math.max(maxLen, j - i);
                }
            }
        }
        return maxLen;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double resultNum = 0.0;
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        int[] result = new int[nums1Len + nums2Len];
        for (int i = 0; i < nums1Len; i++) {
            result[i] = nums1[i];
        }
        for (int i = 0; i < nums2Len; i++) {
            result[i + nums1Len] = nums2[i];
        }
        quickSort(result, 0, nums1Len + nums2Len - 1);
        if ((nums1Len + nums2Len) % 2 == 1) {
            int middleIndex = ((int) (Math.ceil((nums1Len + nums2Len) / 2)));
            resultNum = result[middleIndex];
        } else {
            int fenzi1 = result[((nums1Len + nums2Len) / 2) - 1];
            int fenzi2 = result[(nums1Len + nums2Len) / 2];
            resultNum = (fenzi1 + fenzi2) / 2;
        }
        return resultNum;

    }

    public static void quickSort(int[] array, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        //进行第一轮排序获取分割点
        int index = partition(array, lo, hi);
        //排序前半部分
        quickSort(array, lo, index - 1);
        //排序后半部分
        quickSort(array, index + 1, hi);
    }

    public static int partition(int[] array, int lo, int hi) {
        /** 固定的切分方式 */
        int key = array[lo];//选取了基准点
        while (lo < hi) {
            //从后半部分向前扫描
            while (array[hi] >= key && hi > lo) {
                hi--;
            }
            array[lo] = array[hi];
            //从前半部分向后扫描
            while (array[lo] <= key && hi > lo) {
                lo++;
            }
            array[hi] = array[lo];
        }
        array[hi] = key;//最后把基准存入
        return hi;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    public static class ListNode {
        private int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;

        Integer resultNum = 0;
        String resultStr = "";
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 != null && l2 == null) {
            result = l1;
        } else if (l1 == null && l2 != null) {
            result = l2;
        } else {
            StringBuffer l1Str = new StringBuffer();
            StringBuffer l2Str = new StringBuffer();
            //真正开始排序
            while (l1 != null) {
                l1Str.append(l1.val);
                l1 = l1.next;
            }
            while (l2 != null) {
                l2Str.append(l2.val);
                l2 = l2.next;
            }
            resultNum = Integer.parseInt(reverseIt(l1Str.toString())) + Integer.parseInt(reverseIt(l2Str.toString()));
            resultStr = resultNum + "";
            result = setResult(resultStr.toCharArray(), resultStr.length() - 1);

        }
        return result;
    }

    public static ListNode setResult(char[] resultStr, int index) {
        ListNode result = new ListNode(Character.getNumericValue(resultStr[index]));
        if (index > 0) {
            result.next = setResult(resultStr, index - 1);
        }

        return result;
    }

    public static String reverseIt(String str) {
        int i;
        int len = str.length();
        StringBuffer sb = new StringBuffer(len);
        for (i = (len - 1); i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    /**
     * 回文字符串
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        String result = "";
        int maxLen = 0;

        //字符串倒转方法
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                String temp = s.substring(i, j);
                if (temp == reverseIt(s) && temp.length() > maxLen) {
                    maxLen = temp.length();
                    result = temp;
                }
            }
        }
        return result;
    }

    public String reverStr(String source) {
        String target = "";
        char[] array = source.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            target += array[i];
        }
        return target;
    }

    public static int reverse(int x) {
        int result = 0;
        boolean flag = false;
        String sourceStr = x + "";
        String targetStr = "";
        String maxIntStr = Integer.MAX_VALUE + "";
        String minIntStr = Integer.MIN_VALUE + "";
        int len = sourceStr.length();
        if ((sourceStr.charAt(0) + "").equals("-")) {
            sourceStr = sourceStr.substring(1);
            flag = true;
        }
        if (flag) {
            for (int i = len - 2; i >= 0; i--) {
                targetStr += sourceStr.charAt(i);
            }
            targetStr = "-" + targetStr;
        } else {
            for (int i = len - 1; i >= 0; i--) {
                targetStr += sourceStr.charAt(i);
            }
        }
        if ((targetStr.length() >= maxIntStr.length() && targetStr.compareTo(maxIntStr) > 0) ||
                (targetStr.length() >= minIntStr.length() && targetStr.compareTo(minIntStr) < 0)) {
            return result;
        }
        result = Integer.parseInt(targetStr);
        return result;

    }

    public static int myAtoi(String str) {
        str = str.trim();
        int result = 0;
        int len = str.length();
        int start = 0;
        int end = 0;
        boolean flag = true;
        String numStr = "1234567890- ";
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                end = i;
            }
            if (!numStr.contains(str.charAt(i) + "")) {
                end = i - 1;
                break;
            } else {
                if (str.charAt(i) + "" != "-" && flag) {
                    start = i;
                    flag = false;
                }
            }
        }
        String resultStr = "";
        if (!flag) {
            resultStr = str.substring(start, end + 1);
        }
        result = Integer.parseInt(resultStr);

        return result;
    }


    public static boolean isPalindrome(int x) {
        boolean flag = false;
        long target = 0;
        int tmp = Math.abs(x);
        if (x < 0) {
            return flag;
        }
        while (tmp > 0) {
            target *= 10;
            target += tmp % 10;
            if (target > Integer.MAX_VALUE) {
                return flag;
            }
            tmp /= 10;
        }
        if (x == target) {
            flag = true;
        }

        return flag;
    }

    public boolean isMatch(String text, String pattern) {
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        dp[text.length()][pattern.length()] = true;
        for (int i = text.length(); i >= 0; i--) {
            for (int j = pattern.length() - 1; j >= 0; j--) {
                boolean first_match = (i < text.length() &&
                        (pattern.charAt(j) == text.charAt(i) ||
                                pattern.charAt(j) == '.'));
                if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
                    dp[i][j] = dp[i][j + 2] || first_match && dp[i + 1][j];
                } else {
                    dp[i][j] = first_match && dp[i + 1][j + 1];
                }
            }
        }
        return dp[0][0];
    }


    public boolean isPalindrome(ListNode head) {
        return false;
    }

    /**
     * 求最长递增字串的长度
     *
     * @param A
     * @return
     */
    public int LIS(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        //到该下标时的最长字串长度
        int[] b = new int[A.length];
        b[0] = 1;
        //最长字串长度
        int result = 1;
        for (int i = 1; i < A.length; i++) {
            int max = -1;
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i] && b[j] > max) {
                    max = b[j];
                }
            }
            b[i] = max + 1;
            result = Math.max(result, b[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        /*char[] l1CharArray = {'2', '4', '3'};
        char[] l2CharArray = {'5', '6', '4'};
        ListNode l1 = setResult(l1CharArray, 2);

        ListNode l2 = setResult(l2CharArray, 2);

        ListNode result = addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }*/
        /*int[] num1={1,3};
        int[] num2={2,4};
        double  result = findMedianSortedArrays(num1,num2);
        System.out.println(result);*/
        /*int result = reverse(-2147483648);
        System.out.println(result);*/
        //int result = myAtoi("4193 ");
        LinkedList linkedList = new LinkedList();
        HashSet<String> sa=new HashSet<>();
        boolean flag = isPalindrome(100);
        System.out.println(flag);
    }
}
