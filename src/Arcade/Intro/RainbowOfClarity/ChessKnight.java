package Arcade.Intro.RainbowOfClarity;

public class ChessKnight
{
    int chessKnight(String cell)
    {
        int orgX = cell.charAt(0) - 'a';
        int orgY = cell.charAt(1) - '1';

        int result = 0;
        if(orgX + 1 <= 7 && orgY + 2 <= 7)
            result ++;
        if(orgX - 1 >= 0 && orgY - 2 >= 0)
            result ++;
        if(orgX - 1 >= 0 && orgY + 2 <= 7)
            result ++;
        if(orgX + 1 <= 7 && orgY - 2 >= 0)
            result ++;
        if(orgX - 2 >= 0 && orgY - 1 >= 0)
            result ++;
        if(orgX + 2 <= 7 && orgY + 1 <= 7)
            result ++;
        if(orgX - 2 >= 0 && orgY + 1 <= 7)
            result ++;
        if(orgX + 2 <= 7 && orgY - 1 >= 0)
            result ++;
        return result;
    }
}
