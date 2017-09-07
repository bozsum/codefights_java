package Arcade.Intro.ExploringTheWaters;

import java.util.ArrayList;
import java.util.Arrays;

public class AddBorder
{
    String[] addBorder(String[] picture)
    {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(picture));
        String rep = "";
        for (int i = 0; i < picture[0].length() + 2; i++)
            rep+="*";
        for (int i = 0; i < result.size(); i++)
            result.set(i,"*"+result.get(i)+"*");
        result.add(0,rep);
        result.add(rep);
        return result.toArray(picture);
    }

}
