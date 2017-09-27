package Arcade.Intro.DivingDeeper;

public class FirstDigit
{
    char firstDigit(String inputString)
    {
        for(char c : inputString.toCharArray())
        {
            if(c >= '0' && c <= '9')
                return c;
        }
        return 0;
    }
}
