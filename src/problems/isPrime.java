package problems;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(findPrime(2));
        printPrime();
        System.out.println(Math.sqrt(2)%2);
    }

//    print all the prime number till 100
    private static void printPrime(){
        for(int i = 2; i != 101; i++){
            if(findPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean findPrime(int num) {
        if(num <= 1){
            return false;
        }

        for(int i = 2; i<= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
