package dsa.problems;


import java.sql.SQLOutput;
import java.util.*;

public class ArrayOperation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 5, 4, 5, 0, 1, 16, 7, 15};
        System.out.println("Original Array " + arr);
//        reverse(arr);
//        sort(arr);
//        search(arr, 3);
//        findMax(arr);
//        findSecondMax(arr);
//        isSorted(arr);
//        removeDuplicate(arr);
        moveZeroToEnd(arr);
    }

    public static void moveZeroToEnd(int[]arr){
        int zeroInd = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
               int temp = arr[i];
               arr[i] = arr[zeroInd];
               arr[zeroInd] = temp;
               zeroInd++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void removeDuplicate(int[]arr){
        // via list
//        List<Integer> list = new ArrayList<>();
//        for(int num : arr){
//            if(!list.contains(num)){
//                list.add(num);
//            }
//        }
//
//        using hasSet
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        System.out.println(set);
    }
    public static void isSorted(int[] arr) {
        boolean output = true;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i+1] < arr[i]) output = false;
        }
        System.out.println(output);
    }
        public static void findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(max < arr[i]){
                secondMax = max;
                max = arr[i];
            }

        }

        System.out.println(secondMax);
    }
    public static int findMax(int[] arr){
        int max = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    public static void sort(int[] arr) {
//            Arrays.sort(arr);

//        bubble sort // 1, 2, 4, 5, 6, 7, 5
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] arr) {

        // for loop
//        for(int i = arr.length-1; i>=0; i--){
//            System.out.print(arr[i] + " ");
//        }

        // while loop
//        int length = arr.length-1;
//        while(length >= 0){
//            System.out.print(arr[length] + " ");
//            length--;
//        }

//        swap in-place
        int start = 0, end = arr.length - 1;
        while (start < end) {
            swap(start, end, arr);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int start, int end, int[] arr) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void bubbleSort(int[] arr) {
        // 1, 2, 4, 5, 6, 7, 5
        for (int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1, arr);
                    isSwapped = true;
                }
            }

            if (!isSwapped) break;
        }
    }

    public static void search(int[] arr, int num) {
        boolean output = false;

        // linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) output = true;
        }

//        binary search
        output = binary_search(arr, 0, arr.length - 1, num);
        System.out.println(output);
    }

    public static boolean binary_search(int[] arr, int s, int e, int num) {

        while (s <= e) {
            // find mid
            int mid = e - s / 2;

            if (num == arr[mid]) {
                return true;
            } else if (num < arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    }
}
