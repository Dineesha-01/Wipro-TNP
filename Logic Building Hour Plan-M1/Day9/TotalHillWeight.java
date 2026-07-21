import java.io.*;
import java.util.*;

class UserMainCode
{
    public int totalHillWeight(int input1, int input2, int input3)
    {
        int total = 0;
        int weight = input2;

        for(int level = 1; level <= input1; level++)
        {
            total += level * weight;
            weight += input3;
        }

        return total;
    }
}
