package Arcade.Intro.DarkWilderness;

public class GrowingPlant
{
    int growingPlant(int upSpeed, int downSpeed, int desiredHeight)
    {
        int i = 1;
        int height = 0;
        while(height <= desiredHeight)
        {
            height+=upSpeed;
            if(height >= desiredHeight)
                return i;
            height-=downSpeed;
            i++;
        }
        return --i;
    }
}
