package Arcade.Intro.IslandOfKnowledge;

public class AreEquallyStrong
{
    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight)
    {
        return yourLeft+yourRight == friendsLeft+friendsRight && (yourLeft == friendsLeft || yourLeft == friendsRight) && (yourRight == friendsLeft || yourRight == friendsRight) ;
    }

}
