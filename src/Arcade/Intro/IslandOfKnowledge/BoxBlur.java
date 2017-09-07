package Arcade.Intro.IslandOfKnowledge;

public class BoxBlur
{
    int[][] boxBlur(int[][] image)
    {
        int[][] result = new int[image.length - 3 + 1][image[0].length - 3 + 1];
        for(int row = 0; row < result.length; row++)
        {
            for (int col = 0; col < result[row].length; col++)
            {
                int sum = 0;
                for(int rowIm = row; rowIm < row + 3; rowIm++)
                {
                    for (int colIm = col; colIm < col + 3; colIm++)
                    {
                        sum+=image[rowIm][colIm];
                    }
                }
                result[row][col] = sum / 9;
            }
        }
        return result;
    }

}
