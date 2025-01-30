package basic;

public class TypeCasting {
    public static void main(String[] args) {

        // implicit type casting -> converting lower data to higher byt -> short -> int -> float -> double
        short shortNum = 4;
        int num = shortNum;
        long longNum = num;
        float floatNum = longNum;
        System.out.println(floatNum);
        // explicit type casting converting higher value to lower. needs to do manually. double -> int
        double doubleVale = 5.5;
        int doubleToInt = (int) doubleVale;
        System.out.println(doubleToInt);

        // String to integer
        String strVal = "100";
        int strToInt = Integer.parseInt(strVal);

        // Integer to string
        String StringToInt = Integer.toString(strToInt);
        String intToString = String.valueOf(40);

/*       need to do
        - Loops
        - Debugger
        - Condition
        - Function/methods
        - Projects: temperature converter, Calculator
            */
    }
}
