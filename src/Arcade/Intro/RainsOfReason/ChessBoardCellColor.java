package Arcade.Intro.RainsOfReason;

public class ChessBoardCellColor
{
    boolean chessBoardCellColor(String cell1, String cell2) {
        String x = "ABCDEFGH";
        String y = "12345678";

        int x1 = x.indexOf(cell1.charAt(0)) % 2;
        int y1 = y.indexOf(cell1.charAt(1)) % 2;
        int x2 = x.indexOf(cell2.charAt(0)) % 2;
        int y2 = y.indexOf(cell2.charAt(1)) % 2;

        // black
        if((x1 == 0 && y1 == 0) || (x1 == 1 && y1 == 1))
        {
            return (x2 == 0 && y2 == 0) || (x2 == 1 && y2 == 1);
        }
        else// white ((x1 == 1 && y1 == 0) || (x1 == 0 && y1 == 1))
        {
            return (x2 == 1 && y2 == 0) || (x2 == 0 && y2 == 1);
        }

    }
}
