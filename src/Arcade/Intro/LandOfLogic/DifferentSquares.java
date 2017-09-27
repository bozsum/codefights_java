package Arcade.Intro.LandOfLogic;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferentSquares
{
    int differentSquares(int[][] matrix)
    {

        ArrayList<Integer[][]> list = new ArrayList<Integer[][]>();

        for(int row = 0; row < matrix.length - 2 + 1; row++)
        {
            for (int col = 0; col < matrix[row].length - 2 + 1; col++)
            {
                Integer[][] arr = new Integer[2][2];
                for(int i = 0; i < 2; i++)
                {
                    for(int j = 0; j < 2; j++)
                    {
                        arr[i][j] = matrix[i+row][j+col];
                    }
                }

                if(list.size() == 0)
                    list.add(arr);
                else
                {
                    boolean isHave = false;
                    for(Integer[][] arrRef : list)
                    {
                        if (Arrays.deepEquals(arr,arrRef))
                            isHave = true;
                    }
                    if (!isHave)
                        list.add(arr);
                }
            }
        }

        return list.size();

    }
}
