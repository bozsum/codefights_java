package Arcade.Intro.EdgeOfOcean;

public class MakeArrayConsecutive2
{
    int makeArrayConsecutive2(int[] statues)
    {
        bubSort(statues);
        return (statues[statues.length-1] - statues[0] + 1) - statues.length;
    }

    int[] bubSort(int[] arrToSort)
    {
        for(int i = arrToSort.length-2; i >= 0; i--)
        {
            for(int j = 0; j <= i; j++)
            {
                if(arrToSort[j] > arrToSort[j+1])
                {
                    int temp = arrToSort[j+1];
                    arrToSort[j+1] = arrToSort[j];
                    arrToSort[j] = temp;
                }
            }
        }
        return arrToSort;
    }
}
