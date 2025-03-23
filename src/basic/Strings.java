package basic;

public class Strings {
    public static void main(String[] args) {
        String str = "Ram";
        String str1 = new String("Ram"); // slow, immutable
        StringBuilder sb = new StringBuilder("Ram"); // non synchronized, fast, mutable
        StringBuffer stringBuffer = new StringBuffer("Ram"); // synchronized, slower, mutable
    }
}
