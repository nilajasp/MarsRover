/**
 * Created by nilajapatankar on 6/18/14.
 */
public class WestFacingPosition implements IPositionOfRover {

    private CoordinatePositionOfRover _coordinatePositionOfRover;
    public WestFacingPosition(CoordinatePositionOfRover position) {
        _coordinatePositionOfRover = position;
    }

    @Override
    public IPositionOfRover TurnLeft() {
        IPositionOfRover newPositionOfRover = new SouthFacingPosition(_coordinatePositionOfRover);
        return newPositionOfRover;
    }

    @Override
    public IPositionOfRover TurnRight() {
        IPositionOfRover newPositionOfRover = new NorthFacingPosition(_coordinatePositionOfRover);
        return newPositionOfRover;
    }

    @Override
    public String GetCurrentValue() {
        return _coordinatePositionOfRover.GetXcoordinate()+" "+ _coordinatePositionOfRover.GetYcoordinate()+" "+"W";
    }

    @Override
    public IPositionOfRover Move(Plateau plateau) throws Exception{
        try{
        _coordinatePositionOfRover.DecrementXCoordinate(plateau);
    }
    catch(Exception e){
        throw e;
    }
        return this;
    }
}
