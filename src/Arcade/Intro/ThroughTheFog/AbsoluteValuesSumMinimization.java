package Arcade.Intro.ThroughTheFog;

import java.util.Arrays;

public class AbsoluteValuesSumMinimization
{
    static int absoluteValuesSumMinimization(int[] a)
    {
        Arrays.sort(a); // for hidden test
        int prvX = a[0]-1;
        double prvSum = Double.MAX_VALUE;
        for (int n = 0; n < a.length; n++)
        {
            int x = a[n];

            if(prvX == a[n] && n != 0)
                continue;

            int sum = 0;
            for (int val : a)
                sum += Math.abs(val - x);

            if(sum < prvSum)
            {
                prvSum = sum;
                prvX = x;
            }
            else
                break;
        }
        return prvX;
    }
}
