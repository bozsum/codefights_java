package Arcade.Intro.ThroughTheFog;

import java.util.*;

public class StringsRearrangement
{
    boolean stringsRearrangement(String[] inputArray)
    {
//     String[] str = {"abc", "xbc", "xxc", "xbc", "aby", "ayy", "aby"}; must return true

        for (int i = 0; i < inputArray.length; i++)
        {
            ArrayList<String> list = new ArrayList<>(Arrays.asList(inputArray));
            ArrayList<String> prvWord = new ArrayList<String>();
            prvWord.add(inputArray[i]);     // first string
            list.remove(i);

            for(int j = 0; j < inputArray.length - 1; j++)
            {
                for(int word  = 0; word < list.size(); word++)
                {
                    int diffWord = 0;

                    for (int ch = 0; ch < list.get(word).length(); ch++)
                    {
                        if(prvWord.get(prvWord.size()-1).charAt(ch) != list.get(word).charAt(ch))
                            diffWord++;
                    }

                    if(diffWord == 1)
                    {
                        prvWord.add(list.get(word));
                        list.remove(word);
                    }
                    else
                    {
                        diffWord = 0;
                        for (int ch = 0; ch < list.get(word).length(); ch++)
                        {
                            if(prvWord.get(0).charAt(ch) != list.get(word).charAt(ch))
                                diffWord++;
                        }

                        if(diffWord == 1)
                        {
                            prvWord.add(0,list.get(word));
                            list.remove(word);
                        }
                    }

                }
                if (list.size() == 0)
                    return true;
            }
        }
        return false;
    }
}
