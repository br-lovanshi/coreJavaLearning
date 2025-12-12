package basic;

import problems.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysLearning {
    public static void main(String[] args) {
        int [] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        int[] arr1 = {1,3,5,6,1,7};
        arr1[3] = 4;
        int a = 4;
//        findMax(arr1);
//        findDuplicates(arr1);

        print(arr1, arr1.length);
    }

    public static int print(int[] arr, int n){

        if(n <0) return 0;
        System.out.print(arr[n] + " ");
        return print(arr, n-1);
    }

    public static void findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
//                max = Math.max(max, arr[i]);
        }
        System.out.println(Arrays.toString(arr) + " max: " + max);
    }

    public static void findDuplicates(int [] arr){
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int num: arr){
            if(set.contains(num)){
                duplicates.add(num);
            }else{
                set.add(num);
            }
        }

        System.out.println("Duplicates " + duplicates);
    }
}

/*
* DSA - 6 months
* System Design - 6 months
* Core Java
* Spring Boot
* DB -- doing
* Unit Testing
* Microservices
* Redis
* Kafka
* Docker
* Kubernates
* Cloud*/