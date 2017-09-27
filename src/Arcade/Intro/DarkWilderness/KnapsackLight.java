package Arcade.Intro.DarkWilderness;

public class KnapsackLight
{
    int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW)
    {
        if(weight1 > maxW && weight2 > maxW)
            return 0;
        else if(weight1 + weight2 <= maxW)
            return value1 + value2;
        else if( value1 >= value2)
            return weight1 <= maxW ? value1 : value2;
        else
            return weight2 <= maxW ? value2 : value1;
    }
}
