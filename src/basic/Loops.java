package basic;

public class Loops {
public static void changeName(String name){
    name = "Brajesh";
    System.out.println(name + " Inside changeName method");
}
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 6, 43, 2, 6, 7};
        boolean findValueOutput = findValue(nums, 43);
        System.out.println(findValueOutput);
        String name = "Ram";
        changeName(name);
        System.out.println(name);
//        System.out.println(switchCase(3));
//
//        for (int i = 0; i != 5; i++) {
//            System.out.println(i);
//        }
//
//        int num = 5;
//        while (num != 0) {
//            System.out.println("Num is " + num);
//            num = num - 1;
//        }
//
//        do {
//            System.out.println("Hello");
//            num++;
//        } while (num < 5);
    }

    public static boolean findValue(int[] nums, int val) {
        for (int num : nums) {
            if (val == num) return true;
        }
        return false;
    }

    public static String switchCase(int value) {
        String s;
        switch (value) {
            case 1:
                s = "Present";
                break;
            case 2:
                s = "Two present";
                break;
            case 4:
                s = "Four Present";
                break;
            case 5:
                s = "Five Present";
                break;
            default:
                s = "Not found";
        }
        return s;
    }
}
