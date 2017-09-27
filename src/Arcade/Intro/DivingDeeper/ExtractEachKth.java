package Arcade.Intro.DivingDeeper;

import java.util.ArrayList;

public class ExtractEachKth
{
    int[] extractEachKth(int[] inputArray, int k)
    {
        ArrayList<Integer> list = withOutEle(k,inputArray.length);
        ArrayList<Integer> resultList = new ArrayList<>();

        for(int i = 0; i < inputArray.length; i++)
        {
            if(!list.contains(i))
                resultList.add(inputArray[i]);
        }

        int[] result = new int[resultList.size()];
        for (int  i =0; i < resultList.size(); i++)
            result[i] = resultList.get(i);
        return result;

    }

    ArrayList<Integer> withOutEle(int k, int size)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 1;
        while (i * k - 1 < size)
        {
            result.add(i * k - 1);
            i++;
        }
        return  result;
    }

}
