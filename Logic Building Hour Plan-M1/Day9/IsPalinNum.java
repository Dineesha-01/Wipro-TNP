import java.io.*;
import java.util.*;

class UserMainCode
{
    public int isPalinNum(int input1)
    {
        int num = input1;
        int rev = 0;

        while(num > 0)
        {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        if(rev == input1)
            return 2;
        else
            return 1;
    }
}
