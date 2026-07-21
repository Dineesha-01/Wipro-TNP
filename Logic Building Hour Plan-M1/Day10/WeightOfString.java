import java.io.*;
import java.util.*;

class UserMainCode
{
    public int weightOfString(String input1, int input2)
    {
        int sum = 0;

        input1 = input1.toLowerCase();

        for(int i = 0; i < input1.length(); i++)
        {
            char ch = input1.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                boolean vowel = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');

                if(input2==0 && vowel)
                    continue;

                sum += (ch-'a'+1);
            }
        }

        return sum;
    }
}
