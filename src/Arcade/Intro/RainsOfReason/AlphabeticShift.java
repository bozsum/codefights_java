package Arcade.Intro.RainsOfReason;

public class AlphabeticShift
{
    String alphabeticShift(String inputString)
    {
        char[] cArr = inputString.toCharArray();
        for(int i = 0; i < cArr.length; i++)
        {
            cArr[i] = cArr[i] == 'z' ? 'a' : ++cArr[i];
        }
        return String.valueOf(cArr);
    }
}
