package Arcade.Intro.ThroughTheFog;

public class DepositProfit
{
    int depositProfit(int deposit, int rate, int threshold)
    {
        int i = 0;
        double balance = deposit;
        while(balance < threshold)
        {
            i++;
            balance *= (100.00 + rate) / 100;
        }
        return i;
    }
}
