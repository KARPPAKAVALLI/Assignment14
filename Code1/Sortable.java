package com.assignment14.Code1;

public interface Sortable {
    //1. Define an interface named Sortable with a method sort().
    // Implement this interface in classes representing different sorting algorithms such as
    // bubble sort, quicksort, and merge sort. Allow the user to input an array, select a sorting algorithm,
    // and display the sorted array.

    void sort(int arr[]);
    default void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
