package problems;

import java.util.ArrayList;
import java.util.List;

public class PermutationString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ao", "eidbaooo"));
    }


    public static boolean checkInclusion(String s1, String s2) {

        int k = s1.length();

        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for(int i = 0; i<k; i++){
            list1.add(s2.charAt(i));
            list2.add(s2.charAt(i));
        }
        boolean flag = false;
        for(int i = k; i<s2.length(); i++){
            if(list1.equals(list2)) return true;
            list2.add(s2.charAt(i));
            list2.remove(s2.charAt(0));

        }
        return false;
    }
}
