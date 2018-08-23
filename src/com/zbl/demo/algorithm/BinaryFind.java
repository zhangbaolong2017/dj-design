package com.zbl.demo.algorithm;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class BinaryFind {

    public int findKeyNumIndex(int[] arr,int key){
         int startIndex = 0;
         int endIndex = arr.length-1;
         int mid = 0;
         while(startIndex<endIndex){
             mid=(endIndex+startIndex)/2;
             if(arr[mid]==key){
                 System.out.println("找到关键字在数组"+mid);
                 return mid;
             }else if (arr[mid]>key){
                 endIndex=mid-1;
                 System.out.println("调整末尾坐标到："+ endIndex);
             }else if (arr[mid]<key){
                 startIndex=mid+1;
                 System.out.println("调整开始坐标到："+ startIndex);
             }
         }
        return mid;
    }

    public static void main(String[] args) {
        int[] arr={1,2,6,9,11};
        int key =11;
        BinaryFind binaryFind = new BinaryFind();
        binaryFind.findKeyNumIndex(arr,key);
    }
}
