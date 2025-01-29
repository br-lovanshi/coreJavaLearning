package basic;

public class Variables {
    int num = -19;
    float floatingNum = 1f;
    double doubleNumber = 2.2;
    boolean booleanNumber = Boolean.TRUE;
    String name = "Game";
    char ch = 'a';
    char[] charArr = {'a', 'b', 'c', 'd', 'e'};
    String charArrToString = new String(charArr);

    public static void main(String[] args) {
        Variables variables = new Variables();
        System.out.println(variables.num);
    }
}


//Write a logic that will take user information in input and generate the health report/bgmi report