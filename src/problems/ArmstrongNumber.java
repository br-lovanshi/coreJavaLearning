package problems;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;

       boolean output =  isArmStrongNumber(num);
        System.out.println(output);
    }

    private static boolean isArmStrongNumber(int num) {
        int original = num;
        int sum = 0;

        while(num != 0){
            int mod = num % 10;
            sum += mod * mod* mod ;
//                    Math.sqrt(mod);
            num = num/10;
        }
        return original == sum;
    }
}
