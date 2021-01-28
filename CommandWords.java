package pokemon;
class CommandWords
{
    private static final String validCommands[] = {
        "go", "quit", "help", "inventory", "get", "examine", "use", "answer"
    };
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++)
        {
            if(validCommands[i].equals(aString))
                return true;
        }
        return false;
    }
    public void showAll() 
    {
        for(int i = 0; i < validCommands.length; i++)
        {
            System.out.print(validCommands[i] + "  ");
        }
        System.out.println();
    }
}