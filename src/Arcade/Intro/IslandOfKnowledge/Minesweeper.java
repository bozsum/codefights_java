package Arcade.Intro.IslandOfKnowledge;

public class Minesweeper
{
    int[][] minesweeper(boolean[][] matrix)
    {

        int r = matrix.length;
        int c = matrix[0].length;
        int[][] res = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(matrix[i][j])
                {
                    updateCell(res, i, j);
                }
            }
        }
        return res;
    }

    void updateCell(int[][] res, int i, int j)
    {
        if(i > 0)
        {
            if(j > 0)
                res[i - 1][j - 1]++;
            res[i - 1][j]++;
            if(j < res[0].length - 1)
                res[i - 1][j + 1]++;
        }

        if(j > 0) res[i][j - 1]++;
        //res[i][j]++;
        if(j < res[0].length - 1)
            res[i][j + 1]++;

        if(i < res.length - 1)
        {
            if(j > 0)
                res[i + 1][j - 1]++;
            res[i + 1][j]++;
            if(j < res[0].length - 1)
                res[i + 1][j + 1]++;
        }
    }





}
