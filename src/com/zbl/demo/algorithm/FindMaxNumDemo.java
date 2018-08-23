package com.zbl.demo.algorithm;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class FindMaxNumDemo {



    public int findMaxNum(int[] arr){
        int result = 0;
        int maxIndex=0;
        if(arr!=null&&arr.length>0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>result){
                    result = arr[i];
                    maxIndex = i+1;
                }
            }
        }
        System.out.println("最大值为："+result);
        System.out.println("位于数组第："+maxIndex);
        return result;
    }

    public static void main(String[] args) {
        FindMaxNumDemo findMaxNumDemo = new FindMaxNumDemo();
        int[] arr = {1,6,2,5,8};
        findMaxNumDemo.findMaxNum(arr);
    }
}
