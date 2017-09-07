package Arcade.Intro.SmoothSailing;

import java.util.Arrays;

public class SortByHeight
{
    int[] sortByHeight(int[] a)
    {
        int[][] b = new int[2][a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            if(a[i] == -1)
                continue;

            b[0][count] = i;
            b[1][count] = a[i];
            count++;
            Arrays.sort(b[0],0,count);
            Arrays.sort(b[1],0,count);
        }
        for (int i = 0; i < count; i++)
        {
            a[b[0][i]] = b[1][i];
        }
        return a;
    }

}
