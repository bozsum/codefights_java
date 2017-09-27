package Arcade.Intro.LandOfLogic;

public class SumUpNumbers
{
    int sumUpNumbers(String inputString)
    {
        int result = 0;
        String val = "";
        boolean isNum = false;
        for (int i = 0; i < inputString.length(); i++)
        {
            if(inputString.charAt(i) >= '0' && inputString.charAt(i) <= '9')
            {
                val+=inputString.charAt(i);
                isNum = true;
                if (i == inputString.length() - 1)
                    result+=Integer.parseInt(val);
            }
            else
            {
                if(isNum)
                {
                    result+=Integer.parseInt(val);
                    isNum = false;
                }
                val = "";
            }
        }
        return result;
    }
}
