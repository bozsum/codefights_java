package Arcade.Intro.DivingDeeper;

public class ArrayMaxConsecutiveSum
{
    int arrayMaxConsecutiveSum(int[] inputArray, int k)
    {
        int prvSum = Integer.MIN_VALUE;
        for(int col = 0; col < inputArray.length  - k + 1; col++)
        {
            int sum = 0;
            for(int n  = col; n < k+col; n++)
            {
                sum+=inputArray[n];
            }
            if(sum > prvSum)
                prvSum = sum;

        }
        return prvSum;
    }
}
