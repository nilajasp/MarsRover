/**
 * Created by nilajapatankar on 6/18/14.
 */
public class EastFacingPosition implements IPositionOfRover {
    private CoordinatePositionOfRover _coordinatePositionOfRover;

    public EastFacingPosition(CoordinatePositionOfRover position) {
        _coordinatePositionOfRover = position;
    }

    @Override
    public IPositionOfRover TurnLeft() {
        IPositionOfRover newPositionOfRover = new NorthFacingPosition(_coordinatePositionOfRover);
        return newPositionOfRover;
    }

    @Override
    public IPositionOfRover TurnRight() {
        IPositionOfRover newPositionOfRover = new SouthFacingPosition(_coordinatePositionOfRover);
        return newPositionOfRover;
    }

    @Override
    public String GetCurrentValue() {
        return _coordinatePositionOfRover.GetXcoordinate()+" "+ _coordinatePositionOfRover.GetYcoordinate()+" "+"E";
    }

    @Override
    public IPositionOfRover Move(Plateau plateau) throws Exception{
        try {
            _coordinatePositionOfRover.IncrementXCoordinate(plateau);
        }
        catch(Exception e){
            throw e;
        }
        return this;
    }
}
