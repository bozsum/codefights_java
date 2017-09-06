package Arcade.Intro.EdgeOfOcean;

public class ShapeArea
{
    int shapeArea(int n)
    {
        if(n >= 1 && n <= Math.pow(10, 4))
        {
            int fullArea = (int)Math.pow(2*n-1,2);
            int deleteArea = 4 * sumVal(n-1) ;
            return fullArea - deleteArea;
        }
        return 0;
    }

    int sumVal(int n)
    {
        int sum = 0;
        for(;n > 0; n--)
        {
            sum+=n;
            System.out.println(sum);
        }
        return sum;
    }

}
