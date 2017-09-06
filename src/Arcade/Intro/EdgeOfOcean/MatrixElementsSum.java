package Arcade.Intro.EdgeOfOcean;

public class MatrixElementsSum
{
    int matrixElementsSum(int[][] matrix)
    {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[row].length; col++)
            {
                if (matrix[row][col] == 0)
                {
                    for (int x = row; x < matrix.length; x++)
                    {
                        matrix[x][col] = 0;
                    }
                }
                sum = sum + matrix[row][col];
            }
        }
        return sum;

    }
}
