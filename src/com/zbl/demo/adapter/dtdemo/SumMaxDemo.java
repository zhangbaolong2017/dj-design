package com.zbl.demo.adapter.dtdemo;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class SumMaxDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8,-1,10};
        System.out.println(""+getMaxSum(arr));
    }

    public static Integer getMaxSum(int[] arr) {

        int curr = 0;
        int maxNum = 0;

        if (arr == null || arr.length == 0) {
            return maxNum;
        }

        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            if (curr < 0) {
                curr = 0;
            }
            if(curr>maxNum){
                maxNum = curr;
            }
        }
        return maxNum;
    }
}
