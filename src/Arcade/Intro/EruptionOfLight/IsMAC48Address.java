package Arcade.Intro.EruptionOfLight;

import java.util.Arrays;

public class IsMAC48Address
{
    boolean isMAC48Address(String inputString)
    {
        if(inputString.length() != 17)
            return false;
        for(int i = 0; i < inputString.length(); i++)
        {
            if(Arrays.asList(new String[]{"2","5","8","11","14"}).contains(i+"") && inputString.charAt(i) != '-')
                return false;
            if(!((inputString.charAt(i) >= '0' && inputString.charAt(i) <= '9') || (inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'F')) && !Arrays.asList(new String[]{"2","5","8","11","14"}).contains(i+""))
                return false;
        }
        return true;
    }
}
