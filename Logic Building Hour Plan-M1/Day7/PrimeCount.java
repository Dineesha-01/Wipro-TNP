import java.io.*;
import java.util.*;
class UserMainCode
{
    public int countPrimesInRange(int input1, int input2)
    {
        int count = 0;
        for (int i = input1; i <= input2; i++) {
            if (i < 2)
                continue;
            boolean prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                count++;
        }

        return count;
    }
}
