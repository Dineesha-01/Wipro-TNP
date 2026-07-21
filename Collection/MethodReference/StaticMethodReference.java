// Functional Interface
interface DigitCount {
    int count(int n);
}

// Class with static method
class NumberUtil {

    public static int digitCount(int n) {
        n = Math.abs(n); // Handle negative numbers

        if (n == 0) {
            return 1;
        }

        int count = 0;

        while (n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }
}

// Main Class
public class StaticMethodReference {

    public static void main(String[] args) {

        // Static Method Reference
        DigitCount dc = NumberUtil::digitCount;

        int number = 123456;

        System.out.println("Number = " + number);
        System.out.println("Number of Digits = " + dc.count(number));
    }
}