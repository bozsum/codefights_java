package Arcade.Intro.EruptionOfLight;

public class IsBeautifulString
{
    boolean isBeautifulString(String inputString)
    {
        int[] arr = new int[26];
        for(char c : inputString.toCharArray())
            arr[c-'a']++;
        for(int i = 0; i < arr.length-1;i++)      if(arr[i] < arr[i+1])
            return false;

        return true;
    }
}
