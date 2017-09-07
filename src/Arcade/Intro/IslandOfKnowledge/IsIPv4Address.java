package Arcade.Intro.IslandOfKnowledge;

public class IsIPv4Address
{
    boolean isIPv4Address(String inputString)
    {
        if(inputString.split("\\.").length == 4)
        {
            try
            {
                for(String ip : inputString.split("\\."))
                {
                    if(Integer.valueOf(ip) < 0 || Integer.valueOf(ip) > 255)
                        return false;
                }

                return true;
            }
            catch (Exception e)
            {
                return false;
            }

        }
        return false;
    }

}
