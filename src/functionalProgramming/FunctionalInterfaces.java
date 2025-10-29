package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface MathOperation{
    int calculation(int a, int b);
}

interface Greet{
    void greet(String name);
}
public class FunctionalInterfaces {
    public static void main(String[] args) {
        Greet greet = name -> System.out.println("Helo "+ name);
        greet.greet("Ram");
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract =( a, b) ->  a - b;
        MathOperation multiply = (a, b) -> a * b;
        System.out.println("add " + add.calculation(1, 5));
        System.out.println("subtract " + subtract.calculation(1, 5));
        System.out.println("multiply " + multiply.calculation(2, 5));

        // Predicate: return boolean, only have test method
        Predicate<Integer> predicate = (num) -> num > 9;
        System.out.println(predicate.test(5));

        // Function: take 1 argument convert t to r type
        Function<Integer, String> function = (num) ->  String.valueOf(num); // convert int to str
        System.out.println(function.apply(5));

        // Consumer: No return type ment to modify and calculation
        Consumer<String> supplier = str -> System.out.println("Namaste " + str);
        supplier.accept("Ram");

        //Supplier: return the value no argument
        Supplier<String> randomSupplier = () -> "Ram Ram Ji";
        System.out.println(randomSupplier.get());

        List<String> list = Arrays.asList("one", "five", "two");
        list.forEach(str -> System.out.println(str));
        list.forEach(System.out::println); // Method reference ::

        // Check even number
        Predicate<Integer> checkEven = (num) -> num % 2 == 0;
        System.out.println(checkEven.test(5));

        // Convert to uppercase
        Function<String, String> convertToUpperCase  = str -> str.toUpperCase();
        System.out.println(convertToUpperCase.apply("Ram"));

//        Use Supplier to generate random OTPs.
        Supplier<String> otpGenerator = () -> {
            Random random = new Random();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<4; i++){
                sb.append(random.nextInt(10)); // generates a digit from 0 to 9
            }
            return sb.toString();
        };
        System.out.println("Otp " + otpGenerator.get());
    }
}
// https://chatgpt.com/c/684128d8-ae34-8001-b0cc-710c904b8f4a

/***
 1. What is Functional Programming (FP)?
Functional Programming is a declarative style of coding where:

Functions are treated as first-class citizens
Avoid mutability
        Focus on what to do, not how to do it
Java added FP concepts in Java 8 using:
        ✅ Lambda Expressions
✅ Functional Interfaces
✅ Stream API

🔹 2. What is a Lambda Expression?
Lambda = Anonymous function (no name, no modifier, no return type)
 (parameter) -> { body }

 Q1. What is a functional interface?

 Answer: An interface with only one abstract method, used in lambda expressions.

 Q2. Why were lambda expressions introduced in Java 8?

 Answer: To support functional programming, make code shorter, readable, and improve parallel processing.

 Q3. Can lambda be used with normal interfaces?

 Answer: Only if they are functional interfaces (one abstract method).

 Q4. Difference between lambda expression and anonymous class?

 Feature	Lambda Expression	Anonymous Class
 Syntax	Concise	Verbose
 Use case	Functional interfaces	Multiple methods/fields
 Memory overhead	LessMore
 Q5. What is method reference?

 Answer: It's a shorthand for lambda calling a method — written as ClassName::methodName.


 ***/