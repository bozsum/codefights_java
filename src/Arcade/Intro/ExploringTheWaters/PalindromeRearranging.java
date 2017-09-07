package Arcade.Intro.ExploringTheWaters;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class PalindromeRearranging
{
    boolean palindromeRearranging(String inputString)
    {
        StringBuilder init = new StringBuilder(inputString);
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        Collection<String> collection = new HashSet<>();
        int count = 0;
        for(String s : inputString.split(""))
            collection.add(s);
        for(String s : collection)
        {
            map.put(s,0);
            while(init.indexOf(s) > -1)
            {
                map.replace(s,map.get(s)+1);
                init.deleteCharAt(init.indexOf(s));
            }
            if(map.get(s) % 2 != 0)
                count++;
            if (count > 1)
                return false;
        }
        return true;
    }

}
