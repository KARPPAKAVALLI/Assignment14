package com.assignment14.Code1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort implements Sortable{
    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }
    public void sort(int[]a) {
        List<Integer>arr=new ArrayList<>();
        for (int i:a) {
            arr.add(i);
        }
        qs(arr, 0, arr.size() - 1);
        for (int i = 0; i < a.length; i++) {
            a[i]= arr.get(i);
        }
    }
}
