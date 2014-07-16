/**
 * Created by nilajapatankar on 6/18/14.
 */
public class SouthFacingPosition implements IPositionOfRover {

    private CoordinatePositionOfRover _coordinatePositionOfRover;

    public SouthFacingPosition(CoordinatePositionOfRover position){
        _coordinatePositionOfRover = position;
    }

    @Override
    public IPositionOfRover TurnLeft() {
        IPositionOfRover newPositionOfRover = new EastFacingPosition(_coordinatePositionOfRover);
        return newPositionOfRover;
    }

    @Override
    public IPositionOfRover TurnRight() {
        IPositionOfRover newPositionOfRover = new WestFacingPosition(_coordinatePositionOfRover);
        return newPositionOfRover;
    }

    @Override
    public String GetCurrentValue() {
        return _coordinatePositionOfRover.GetXcoordinate()+" "+ _coordinatePositionOfRover.GetYcoordinate()+" "+"S";
    }

    @Override
    public IPositionOfRover Move(Plateau plateau) throws Exception{
     try{
        _coordinatePositionOfRover.DecrementYCoordinate(plateau);
    }
    catch(Exception e){
        throw e;
    }
        return this;
    }
}
