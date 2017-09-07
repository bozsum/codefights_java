package Arcade.Intro.IslandOfKnowledge;

import java.util.Arrays;

public class AvoidObstacles
{
    int avoidObstacles(int[] inputArray)
    {
        Arrays.sort(inputArray);
        int i = 2;
        while(true)
        {
            int count = 0;
            boolean isErr = false;
            int prv = 0;
            for (int  j = i; count <= inputArray.length; j+=i)
            {
                for(int k = prv; k < inputArray.length; k++)
                {
                    if(inputArray[k] < j)
                        count++;
                    if(inputArray[k] == j)
                    {
                        isErr = true;
                        break;
                    }
                    if(inputArray[k] > j)
                    {
                        prv = k;
                        break;
                    }
                    if(count == inputArray.length)
                        return i;
                }
                if (isErr)
                    break;
            }
            i++;
        }
    }

}
