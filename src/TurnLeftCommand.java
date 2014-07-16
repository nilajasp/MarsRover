/**
 * Created by nilajapatankar on 6/19/14.
 */
public class TurnLeftCommand implements ICommandForRover {
    @Override
    public IPositionOfRover ExecuteCommand(IPositionOfRover positionOfRover,Plateau plateau) throws Exception{
        IPositionOfRover newPositionOfRover;
        try{   newPositionOfRover = positionOfRover.TurnLeft();
        }
        catch(Exception e){
            throw e;
        }
        return newPositionOfRover;
    }
}
