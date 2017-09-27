package Arcade.Intro.EruptionOfLight;

import java.util.Arrays;

public class ElectionsWinners
{
    int electionsWinners(int[] votes, int k)
    {
        int win = 0;
        int dup = 0;
        Arrays.sort(votes);
        for(int i = votes.length - 1; i >= 0; i--)
        {
            if(votes[i]+k > votes[votes.length - 1])
                win++;
            else if(votes[i] == votes[votes.length - 1])
            {
                dup++;
                if(dup > 1 && win < 1)
                    return 0;
            }
        }
        return win+dup;
    }
}
