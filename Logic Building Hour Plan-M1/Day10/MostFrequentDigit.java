import java.io.*;
import java.util.*;

class UserMainCode
{
    public int MostFrequentDigit(int input1, int input2, int input3, int input4)
    {
        int[] freq = new int[10];

        int[] nums = {input1, input2, input3, input4};

        for(int n : nums)
        {
            if(n == 0)
            {
                freq[0]++;
            }

            while(n > 0)
            {
                freq[n % 10]++;
                n /= 10;
            }
        }

        int max = -1;
        int ans = 0;

        for(int i = 0; i <= 9; i++)
        {
            if(freq[i] > max || (freq[i] == max && i > ans))
            {
                max = freq[i];
                ans = i;
            }
        }

        return ans;
    }
}
