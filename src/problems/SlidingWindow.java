package problems;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {

    public static void main(String[] args) {
        int[] arr = {3,2,5,9,2,5,6,2,6,9,5,7,4};
        int k = 3;
        int output = findMaxSum(arr,k);
//        System.out.println(output);
        System.out.println(longestStr("abbccabcbb"));
    }

    // fixed size
    public static int findMaxSum(int[] arr, int k){
        int sum = 0, maxSum = 0;
        for(int i = 0; i<k; i++){
            sum += arr[i];
        }

        maxSum = sum;
        for(int i = k;i<arr.length; i++){
            sum += arr[i];
            sum -= arr[i-k];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    // dynamic size
    public static int longestStr(String str){
        int maxLen = 0, left = 0, right = 0;
        Set<Character> set = new HashSet<>();

        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            while(set.contains(c)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}
