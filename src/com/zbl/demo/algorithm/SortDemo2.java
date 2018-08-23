package com.zbl.demo.algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class SortDemo2 {


    public static void quickSort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int index = partitions(arr, low, high);
        quickSort(arr, low, index - 1);
        quickSort(arr, index + 1, high);
    }

    public static int partitions(int[] array, int lo, int hi) {
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

    public static void insertSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int j = i;
            int target = arr[i];
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
        }
    }


    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) >> 1;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        mergeSortPartition(arr, start, mid, end);
    }

    public static void mergeSortPartition(int[] result, int start, int mid, int end) {
        int[] tempArr = new int[end + 1];
        int low = start;
        int left = start;

        int center = mid + 1;
        while (start <= mid && center <= end) {
            tempArr[low++] = result[start] < result[center] ? result[start++] : result[center++];
        }

        while (start <= mid) {
            tempArr[low++] = result[start++];
        }

        while (center <= end) {
            tempArr[low++] = result[center++];
        }

        for (int i = left; i <= end; i++) {
            result[i] = tempArr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 12, 7, 8, 3, 4, 65, 22};
        //quickSort(arr, 0, arr.length-1);
        //insertSort(arr);
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
       // ReentrantLock
        //SortDemo.fastSort(arr, 0, 4);
        //SortDemo.bubbleSort(arr);
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        //selectSort(arr);
        //insertSort(Integer);
        //List arrList = Arrays.asList(arr);
        //arrList.sort();
    }
}
