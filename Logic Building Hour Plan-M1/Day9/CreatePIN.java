import java.io.*;
import java.util.*;

class UserMainCode
{
    public int createPIN(int input1, int input2, int input3)
    {
        int h1 = input1 / 100;
        int t1 = (input1 / 10) % 10;
        int u1 = input1 % 10;

        int h2 = input2 / 100;
        int t2 = (input2 / 10) % 10;
        int u2 = input2 % 10;

        int h3 = input3 / 100;
        int t3 = (input3 / 10) % 10;
        int u3 = input3 % 10;

        int thousand = Math.max(Math.max(h1, t1), u1);
        thousand = Math.max(thousand, Math.max(Math.max(h2, t2), u2));
        thousand = Math.max(thousand, Math.max(Math.max(h3, t3), u3));

        int hundred = Math.min(h1, Math.min(h2, h3));
        int ten = Math.min(t1, Math.min(t2, t3));
        int one = Math.min(u1, Math.min(u2, u3));

        return thousand * 1000 + hundred * 100 + ten * 10 + one;
    }
}
