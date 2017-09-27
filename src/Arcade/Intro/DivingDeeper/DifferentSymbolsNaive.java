package Arcade.Intro.DivingDeeper;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class DifferentSymbolsNaive
{
    int differentSymbolsNaive(String s)
    {
        Collection<String> result = new HashSet<>(Arrays.asList(s.split("")));
        return result.size();
    }
}
