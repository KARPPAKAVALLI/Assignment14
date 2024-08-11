package com.assignment14.Code1;

public class Main {
    public static void main(String[] args) {
        int arr1[]={-2,76,93,-1,10};
        BubbleSort b=new BubbleSort();
        b.sort(arr1);
        System.out.println("Bubble Sort");
        b.display(arr1);

        int arr2[]={-2,76,93,-1,10};
        QuickSort q=new QuickSort();
        q.sort(arr2);
        System.out.println("\nQuick Sort");
        q.display(arr2);

        int arr3[]={-2,76,93,-1,10};
        MergeSort m=new MergeSort();
        m.sort(arr3);
        System.out.println("\nMerge Sort");
        m.display(arr3);
    }
}
