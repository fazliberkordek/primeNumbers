/**
 * @author fazliberkordek
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("This program prints the prime numbers in a range of 0-100");
        for (int i = 0; i < 100; i++) {
            //create a boolean variable to check if the number is prime or not
            boolean isPrime = true;
            //check if the number is prime or not
            for (int j = 2; j < i; j++) {
                //if the number is divisible by any number other than 1 and itself, it is not prime
                if (i % j == 0 && i==0 && i==1) {
                    isPrime = false;
                    break;
                }
            }
            //print the number if it is prime
            if (isPrime) {
                System.out.println(i);
            }

        }


    }
}