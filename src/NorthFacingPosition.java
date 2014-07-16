/**
 * Created by nilajapatankar on 6/18/14.
 */
public class NorthFacingPosition implements IPositionOfRover {

    private CoordinatePositionOfRover _coordinatePositionOfRover;
    public NorthFacingPosition(CoordinatePositionOfRover position) {
        _coordinatePositionOfRover = position;
    }

    @Override
    public IPositionOfRover Move(Plateau plateau) throws Exception{
     try{   _coordinatePositionOfRover.IncrementYCoordinate(plateau);
    }
    catch(Exception e){
        throw e;
    }
        return this;
    }

    @Override
    public IPositionOfRover TurnLeft() {
        IPositionOfRover newPositionOfRover = new WestFacingPosition(_coordinatePositionOfRover);
        return newPositionOfRover;
    }

    @Override
    public IPositionOfRover TurnRight() {
        IPositionOfRover newPositionOfRover = new EastFacingPosition(_coordinatePositionOfRover);
        return newPositionOfRover;
    }

    @Override
    public String GetCurrentValue() {
        return _coordinatePositionOfRover.GetXcoordinate()+" "+ _coordinatePositionOfRover.GetYcoordinate()+" "+"N";
    }
}
