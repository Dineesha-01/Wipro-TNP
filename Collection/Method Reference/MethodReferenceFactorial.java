// Functional Interface
interface Factorial {
    int factorial(int n);
}

// Class with instance method
class FactorialClass {
    public int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}

// Main Class
public class MethodReferenceFactorial {
    public static void main(String[] args) {

        FactorialClass obj = new FactorialClass();

        // Method Reference to instance method
        Factorial f = obj::factorial;

        int number = 5;

        System.out.println("Factorial of " + number + " = " + f.factorial(number));
    }
}
