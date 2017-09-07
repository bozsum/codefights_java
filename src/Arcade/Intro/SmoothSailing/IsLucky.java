package Arcade.Intro.SmoothSailing;

public class IsLucky
{
    boolean isLucky(int n)
    {
        if(String.valueOf(n).length() % 2 == 0)
        {
            String a = String.valueOf(n).substring(0,String.valueOf(n).length()/2);
            String b = String.valueOf(n).substring(String.valueOf(n).length()/2);
            int sumA = 0;
            int sumB = 0;

            for (int i = 0; i < a.length(); i++)
            {
                sumA+=Integer.parseInt(a.substring(i,i+1));
                sumB+=Integer.parseInt(b.substring(i,i+1));
            }

            if(sumA == sumB)
                return true;
        }
        return false;

    }

}
