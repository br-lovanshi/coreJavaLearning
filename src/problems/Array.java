package problems;

import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 3;
        System.out.println(Arrays.toString(nums));
        int a = 30;
        int b = 20;
        System.out.println(a + " " + b);
       int[] swappedArr =  swap(a, b);
        System.out.println(swappedArr[0] + " " + swappedArr[1]);
        System.out.println(findIndexOfEleFromList(Arrays.asList("ram", "shyam", "hari", "krishna"),  "hari"));
    }
    public static int[] swap(int a, int b){
        int temp = a;
        a  = b;
        b = temp;
        int[] output = {a, b};
        return new int[]{a, b};
    }

    public static int findIndexOfEleFromList(List<String> list, String name){
        for(String ele : list){
            if(ele.equals(name)){
               return list.indexOf(name);
            }
        }
        return -1;
    }
}
