package com.zbl.demo.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class SortDemo {


    public static void fastSort(int[] arr, int low, int high) {
        //递归快速排序
        if (low >= high) {
            return;
        }
        int index = partitionLoc(arr, low, high);
        fastSort(arr, low, index - 1);
        fastSort(arr, index + 1, high);
    }


    private static int partitionLoc(int[] arr, int low, int high) {
        int key = arr[low];
        while (low < high) {
            while (arr[high] >= key && high > low) {
                high--;
            }
            arr[low] = arr[high];
            while (arr[low] <= key && high > low) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[high] = key;
        return high;
    }


    public static void bubbleSort(int[] a) {
        int num = a.length;
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }


    public static void selectSort(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int temp = arr[i];
            int min = arr[i];
            int index = i;
            for (int j = i; j < len; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }

        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void insertSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int temp = arr[i];
            int j;
            for (j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {2, 8, 3, 4, 5};
        //SortDemo.fastSort(arr, 0, 4);
        //SortDemo.bubbleSort(arr);
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        //selectSort(arr);
        //insertSort(Integer);
        List arrList = Arrays.asList(arr);
        //arrList.sort();
    }
}
