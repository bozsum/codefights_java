package Arcade.Intro.DarkWilderness;

public class LongestDigitsPrefix
{
    String longestDigitsPrefix(String inputString)
    {
        StringBuilder result = new StringBuilder();
        result.append("");
        int i = 0;
        while(i < inputString.length() && (inputString.charAt(i) >= '0') && (inputString.charAt(i) <= '9'))
        {
            result.append(inputString.charAt(i));
            i++;
        }
        return result.toString();
    }
}
