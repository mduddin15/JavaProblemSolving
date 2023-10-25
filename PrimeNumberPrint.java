public class PrimeNumberPrint {
        public static void main(String[] args) {
            int limit = 100; // Define the limit to find prime numbers up to 100

            System.out.println("Prime numbers up to " + limit + ":");

            // Loop through numbers from 2 to the limit
            for (int i= 2; i<= limit; i++) {
                boolean isPrime = true;

                // Check if the number is prime
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                // If the number is prime, print it
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }

