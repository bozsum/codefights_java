package Arcade.Intro.RainbowOfClarity;

import java.util.Arrays;

public class DeleteDigit
{
    int deleteDigit(int n)
    {
        int[] value = new int[(n+"").length()];
        for(int i = 0; i < value.length; i++)
            value[i] = Integer.parseInt(new StringBuilder(n+"").deleteCharAt(i).toString());
        Arrays.sort(value);
        return value[value.length-1];
    }
}
