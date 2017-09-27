package Arcade.Intro.DarkWilderness;

public class DigitDegree
{
    int digitDegree(int n)
    {
        if(n < 10)
            return 0;
        else
        {
            String val = n + "";
            int sum = 0;
            for (char ch : val.toCharArray())
                sum += (ch - 48);
            if(sum < 10)
                return 1;
            else
                return 1+digitDegree(sum);
        }
    }
}
