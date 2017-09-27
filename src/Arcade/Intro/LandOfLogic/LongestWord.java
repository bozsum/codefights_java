package Arcade.Intro.LandOfLogic;

public class LongestWord
{
    String longestWord(String text)
    {

        String result = "";
        String prv = "";
        for(int i = 0; i < text.length(); i ++)
        {
            if((text.charAt(i) >= 'a' && text.charAt(i) <= 'z') || ((text.charAt(i) >= 'A' && text.charAt(i) <= 'Z')))
            {
                prv+=text.charAt(i);
            }
            else
            {
                result = prv.length() >= result.length() ? prv : result;
                prv = "";
            }
        }
        return result.equals("") ? prv : result;

    }
}
