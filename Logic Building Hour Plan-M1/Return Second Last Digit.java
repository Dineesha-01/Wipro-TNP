public class Solution {
    public static int secondLastDigitOf(int input1) {
        input1 = Math.abs(input1);

        if (input1 < 10)
            return -1;

        return (input1 / 10) % 10;
    }
}
