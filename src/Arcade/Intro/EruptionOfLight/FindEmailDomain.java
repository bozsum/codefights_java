package Arcade.Intro.EruptionOfLight;

public class FindEmailDomain
{
    String findEmailDomain(String address)
    {
        return address.substring(address.lastIndexOf('@')+1);
    }
}
