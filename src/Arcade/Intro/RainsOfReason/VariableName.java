package Arcade.Intro.RainsOfReason;

public class VariableName
{
    boolean variableName(String name)
    {
        if(!((name.charAt(0) == '_') || (name.charAt(0) >= 'a' && name.charAt(0) <= 'z') || (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') ))
        {
            return false;
        }
        else
        {
            for(int i = 1; i < name.length(); i++)
            {
                if(!((name.charAt(i) == '_') || (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) >= '0' && name.charAt(i) <= '9')))
                {
                    return false;
                }
            }

        }
        return true;
    }
}
