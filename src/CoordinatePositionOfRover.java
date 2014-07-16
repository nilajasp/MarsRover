/**
 * Created by nilajapatankar on 6/13/14.
 */
public class CoordinatePositionOfRover {
    private int xCoordinateOfRover;
    private int yCoordinateOfRover;

    public void setPositionOfRover(String x_position, String y_position) {
        xCoordinateOfRover = Integer.parseInt(x_position);
        yCoordinateOfRover = Integer.parseInt(y_position);
    }

    public void IncrementYCoordinate(Plateau plateau) throws Exception{
        if(yCoordinateOfRover==plateau.GetGridSizeY())
        {
            System.out.println("You are moving out of the plateau");
            throw new Exception();
        }
        yCoordinateOfRover++;
    }

    public void DecrementYCoordinate(Plateau plateau) throws Exception{
        if(yCoordinateOfRover==0)
        {
            System.out.println("You are moving out of the plateau");
            throw new Exception();
        }
        yCoordinateOfRover--;
    }

    public void IncrementXCoordinate(Plateau plateau) throws Exception{
        if(xCoordinateOfRover==plateau.GetGridSizeX())
        {
            System.out.println("You are moving out of the plateau");
            throw new Exception();
        }
        xCoordinateOfRover++;
    }

    public void DecrementXCoordinate(Plateau plateau) throws Exception {
        if(xCoordinateOfRover==0)
        {
            System.out.println("You are moving out of the plateau");
            throw new Exception();
        }
        xCoordinateOfRover--;
    }

    public int GetXcoordinate() {
        return xCoordinateOfRover;
    }

    public int GetYcoordinate() {
        return yCoordinateOfRover;
    }
}
