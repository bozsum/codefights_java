package Arcade.Intro.ExploringTheWaters;

public class ArrayChange
{
    int arrayChange(int[] inputArray)
    {
        int result = 0;
        int prv = inputArray[0];
        for(int i = 1; i < inputArray.length; i++)
        {
            while(prv >= inputArray[i])
            {
                inputArray[i] = inputArray[i]+1;
                result++;
            }
            prv = inputArray[i];
        }
        return result;
    }

}
