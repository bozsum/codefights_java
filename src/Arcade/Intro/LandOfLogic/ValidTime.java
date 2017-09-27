package Arcade.Intro.LandOfLogic;

public class ValidTime
{
    boolean validTime(String time)
    {
        return (Integer.parseInt(time.substring(0,2)) >= 0 && Integer.parseInt(time.substring(0,2)) <= 23) && (time.charAt(2) == ':') && (Integer.parseInt(time.substring(3)) >= 0 && Integer.parseInt(time.substring(3)) <= 59);
    }
}
