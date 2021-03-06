package gangoffour.classic.behavioral.command;
public class RemoteControl {

    CommandBase onCommand, offCommand, undoCommand;

    public void onButtonPressed(CommandBase onCommand) {
        this.onCommand = onCommand;
        onCommand.execute();
        undoCommand = onCommand;
    }

    public void offButtonPressed(CommandBase offCommand) {
        this.offCommand = offCommand;
        offCommand.execute();
        undoCommand = offCommand;
        try{
            System.out.println("" );
        }catch(Exception e){
        }
    }

}
