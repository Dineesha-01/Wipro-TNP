import java.io.*;
import java.util.*;
class UserMainCode
{
    public int nonRepeatDigitsCount(int input1)
    {
        int[] freq = new int[10];
        int temp = input1;
        while (temp > 0) {
            int digit = temp % 10;
            freq[digit]++;
            temp /= 10;
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] == 1)
                count++;
        }

        return count;
    }
}
