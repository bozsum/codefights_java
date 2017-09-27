package Arcade.Intro.RainbowOfClarity;

public class LineEncoding
{
    String lineEncoding(String s)
    {
        String result = "";
        StringBuilder st = new StringBuilder(s);
        char prv = 'p';
        while(st.length() > 0)
        {
            int sum = 0;

            for(int i = 0;i < st.length();i++)
            {
                if (i == 0)
                    prv = st.charAt(i);

                if(st.charAt(i) == prv)
                    sum++;
                else
                {
                    if(sum > 1)
                        result+=sum;
                    result+=prv;
                    prv = st.charAt(i);
                    st.delete(0,i);
                    break;
                }

                if(i == st.length()-1)
                {
                    if(sum > 1)
                        result+=sum;
                    result+=prv;
                    prv = st.charAt(i);
                    st.delete(0,i+1);
                    break;
                }
            }
        }
        return  result;

    }
}
