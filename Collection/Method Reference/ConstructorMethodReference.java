// Functional Interface
interface PrimeCheck {
    void check(int n);
}

// Class with Parameterized Constructor
class Prime {

    public Prime(int n) {
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }
}

// Main Class
public class ConstructorMethodReference {

    public static void main(String[] args) {

        // Constructor Method Reference
        PrimeCheck pc = Prime::new;

        int number = 17;

        // Invoke constructor through method reference
        pc.check(number);
    }
}
