package Arcade.Intro.SmoothSailing;

public class CommonCharacterCount
{
    int commonCharacterCount(String s1, String s2)
    {
        /*
        Collection<String> list = new HashSet<String>();
        int count = 0;
        if(s1.length() >= 1 && s1.length() <= 15 && s2.length() >= 1 && s2.length() <= 15)
        {
            for(int length = 1; length <= s1.length(); length++)
            {
                for (int startIndex = 0; startIndex < s1.length() + 1 - length; startIndex++)
                {
                    if(length == 1 && (s1.charAt(startIndex) < 97 || s1.charAt(startIndex) > 122))
                        return 0;
                    list.add(s1.substring(startIndex, startIndex + length));
                }
            }
            for(int length = 1; length <= s2.length(); length++)
            {
                for (int startIndex = 0; startIndex < s2.length() + 1 - length; startIndex++)
                {
                    if(length == 1 && (s2.charAt(startIndex) < 97 || s2.charAt(startIndex) > 122))
                        return 0;
                    list.add(s2.substring(startIndex, startIndex + length));
                }
            }
            for (String str : list)
            {
                if(s1.contains(str) && s2.contains(str))
                    count++;
            }
        }
        return count;
        */

        // =============================== Not My Code ====================
        StringBuilder sb2 = new StringBuilder(s2);
        int num = 0;
        for(int i = 0; i < s1.length(); i++ )
        {
            int index = sb2.toString().indexOf(s1.charAt(i));
            if (index > -1)
            {
                num++;
                sb2.deleteCharAt(index);
            }
        }
        return num;
    }

}
