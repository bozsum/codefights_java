package Arcade.Intro.SmoothSailing;

public class ReverseParentheses
{
    String reverseParentheses(String s)
    {
        while (s.contains(")"))
        {
            int startP = s.lastIndexOf("(");
            int endP = s.indexOf(")",s.lastIndexOf("("));
            String found = s.substring(startP,endP+1);
            String rev = new StringBuilder(new String(found)).reverse().toString();
            rev = rev.substring(1,rev.length()-1);
            s = s.replace(found,rev);
        }
        return s;
    }
}
