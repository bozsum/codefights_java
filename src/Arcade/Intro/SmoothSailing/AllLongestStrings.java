package Arcade.Intro.SmoothSailing;

import java.util.ArrayList;

public class AllLongestStrings
{
    String[] allLongestStrings(String[] inputArray)
    {
        ArrayList<String> outputArrayList = new ArrayList<>();
        String[] outputArray = {""};
        int maxLength = inputArray[0].length();
        for (String str : inputArray)
        {
            if(str.length() == maxLength)
            {
                outputArrayList.add(str);
            }
            else if(str.length() > maxLength)
            {
                maxLength = str.length();
                outputArrayList.clear();
                outputArrayList.add(str);
            }
        }
        outputArray = outputArrayList.toArray(outputArray);
        return outputArray;
    }

}
