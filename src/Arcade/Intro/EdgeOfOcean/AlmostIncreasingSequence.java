package Arcade.Intro.EdgeOfOcean;

public class AlmostIncreasingSequence
{
    boolean almostIncreasingSequence(int[] sequence)
    {
        // ============================================ Not My Code ======================================================
        int[] newSequence = new int[sequence.length -1];
        boolean good = false;
        int badIndex = -1;
        int count = 0;
        System.out.println(sequence.length);

        for (int i = 0; i < sequence.length-1; i++)
        {
            if (sequence[i] < sequence[i+1])
            {
                good = true;
            }
            else
            {
                count++;
                if (count > 1)
                {
                    return false;
                }

                good = false;

                if (i != 0)
                {
                    if (sequence[i-1] < sequence[i+1])
                    {
                        badIndex = i;
                    }
                    else
                        badIndex = i+1;
                }
                else
                    badIndex = i;
            }
        }


        if (badIndex != -1)
        {
            int j=0;
            for (int i = 0; i < sequence.length; i++ )
            {
                if (i != badIndex)
                {
                    newSequence[j] = sequence[i];
                    j++;
                }
            }

            if (badIndex != -1)
            {
                good = false;
            }
        }
        else
            return true;

        if (good == false)
        {
            good = true;
            for (int i = 0; i < newSequence.length-1; i++)
            {
                if (newSequence[i] < newSequence[i+1])
                {
                    good = true;
                }
                else
                    return false;
            }
        }

        return good;
    }

}
