package Arcade.Intro.IslandOfKnowledge;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayMaximalAdjacentDifference
{
    int arrayMaximalAdjacentDifference(int[] inputArray)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 1; i < inputArray.length; i++)
            result.add(Math.abs(inputArray[i]-inputArray[i-1]));
        Collections.sort(result);
        return result.get(result.size()-1);
    }

}
