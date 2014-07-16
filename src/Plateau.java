/**
 * Created by nilajapatankar on 6/22/14.
 */
public class Plateau {
    private int _gridSizeX;
    private int _gridSizeY;

    public Plateau(String inputForUpperRightCoordinatesOfPlateau) {
        String[] upperRightCoordinatesOfPlateau = inputForUpperRightCoordinatesOfPlateau.split(" ");
        _gridSizeX = Integer.parseInt(upperRightCoordinatesOfPlateau[0]);
        _gridSizeY = Integer.parseInt(upperRightCoordinatesOfPlateau[1]);
    }

    public int GetGridSizeX()
    {
        return _gridSizeX;
    }

    public int GetGridSizeY()
    {
        return _gridSizeY;
    }
}
