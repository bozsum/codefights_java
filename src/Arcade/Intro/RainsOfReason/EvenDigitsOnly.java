package Arcade.Intro.RainsOfReason;

public class EvenDigitsOnly
{
    boolean evenDigitsOnly(int n)
    {
        for(String s : String.valueOf(n).split(""))
            if(Integer.valueOf(s) % 2 != 0)
                return false;
        return true;
    }
}
