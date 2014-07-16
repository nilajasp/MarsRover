/**
 * Created by nilajapatankar on 6/19/14.
 */
public interface ICommandForRover {
    IPositionOfRover ExecuteCommand(IPositionOfRover positionOfRover,Plateau plateau) throws Exception;
}
