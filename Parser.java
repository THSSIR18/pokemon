package pokemon;
import java.util.Scanner;
class Parser 
{
    private CommandWords commands;  
    public Parser() 
    {
        commands = new CommandWords();
    }
    public Command getCommand() 
    {
        String inputLine = "";   
        String word1;
        String word2;

        System.out.print("> ");   
        
         Scanner reader = new Scanner(System.in);
        
            inputLine = reader.nextLine();
        String[] myCommands = inputLine.split(" ");
        if (myCommands.length==1)
        {
        	word1=myCommands[0];
        	word2=null;
        }
        else
        {
        	word1=myCommands[0];
        	word2=myCommands[1];
		}
      
        if(commands.isCommand(word1))
            return new Command(word1, word2);
        else
            return new Command(null, word2);
            
    }
    public void showCommands()
    {
        commands.showAll();
    }
}