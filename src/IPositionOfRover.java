/**
 * Created by nilajapatankar on 6/18/14.
 */
public interface IPositionOfRover {
    IPositionOfRover Move(Plateau plateau) throws Exception;
    IPositionOfRover TurnLeft();
    IPositionOfRover TurnRight();
    String GetCurrentValue();
}
