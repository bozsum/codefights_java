package Arcade.Intro.ThroughTheFog;

public class CircleOfNumbers
{
    int circleOfNumbers(int n, int firstNumber)
    {
        return (firstNumber >= n / 2 ) ? firstNumber - n / 2 : firstNumber + n / 2;
    }
}
