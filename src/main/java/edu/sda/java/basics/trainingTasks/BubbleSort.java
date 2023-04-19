package edu.sda.java.basics.trainingTasks;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {3,4,5,6,7,7,8,3,3,4,5};
        System.out.println("Array before sorting: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("Array after bubble sort:" + Arrays.toString(numbers));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}