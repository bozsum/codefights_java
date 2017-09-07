package Arcade.Intro.ExploringTheWaters;

import java.util.Arrays;

public class AreSimilar
{
    boolean areSimilar(int[] a, int[] b)
    {
        int[] tempA = new int[a.length];
        int[] tempB = new int[b.length];
        for (int i = 0 ; i < a.length; i++)
        {
            tempA[i] = a[i];
            tempB[i] = b[i];
        }
        int count = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
        {
            for (int i = 0; i < tempA.length; i++)
            {
                if(tempA[i] != tempB[i])
                    count++;
            }
            if(count <= 2)
                return true;
        }
        return false;
    }

}
