package Arcade.Intro.EruptionOfLight;

public class BuildPalindrome
{
    String buildPalindrome(String st)
    {
        StringBuilder rs = new StringBuilder(st);
        int i = 0;
        while(!rs.toString().equals(rs.reverse().toString()))
        {
            rs = rs.reverse();
            rs.insert(rs.length() - i, rs.charAt(i));
            st = rs.toString();
            i++;
        }
        return st;
    }
}
