package Arcade.Intro.EdgeOfOcean;

public class AdjacentElementsProduct
{
    int adjacentElementsProduct(int[] inputArray)
    {
        int maxProduct =  -1000000;
        if(inputArray.length >= 2 && inputArray.length <= 10)
        {
            for(int i = 0; i < inputArray.length - 1; i++)
            {
                if(inputArray[i] >= -1000 && inputArray[i] <= 1000 && inputArray[i+1] >= -1000 && inputArray[i+1] <= 1000)
                {
                    int currentProduct = inputArray[i]*inputArray[i+1];
                    if(currentProduct > maxProduct)
                        maxProduct = currentProduct;
                }
                else
                {
                    return 0;
                }
            }
        }
        return maxProduct;

    }
}
