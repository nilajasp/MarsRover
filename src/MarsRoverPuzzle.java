import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nilajapatankar on 6/13/14.
 */
public class MarsRoverPuzzle {

    Scanner scanner;
    private Rovers _rovers;

    public MarsRoverPuzzle() {
        scanner = new Scanner(System.in);
        _rovers = new Rovers();
    }

    public void StartPuzzle() {
        GetRoversDetailsForPuzzle();
        SolvePuzzle();
    }

    private void SolvePuzzle() {
        for (int loopCounter = 0; loopCounter < _rovers.GetSize(); loopCounter++) {
            Rover rover = _rovers.GetRoverAtIndex(loopCounter);
            rover.Move();
            rover.DisplayFinalPosition();
        }
    }

    private void GetRoversDetailsForPuzzle() {
        try {
            String plateauSize = GetInputForPlateauSize();
            String roverPosition = null;
            System.out.println("Enter details for puzzle:");
            while (roverPosition == null || roverPosition.compareToIgnoreCase("q") != 0) {
                System.out.println("Rover position and command for rover:(Enter 'q' to quit)");
                System.out.println("Enter rover position:");
                roverPosition = scanner.nextLine();
                GetCommandsForRoverIfRoverIsEntered(roverPosition, plateauSize);
            }
        }
        catch (Exception e)
        {
            System.out.println("Your input is not correct.");
        }
    }

    private void GetCommandsForRoverIfRoverIsEntered(String currentInputLine,String plateauSize) {
        if (currentInputLine.compareToIgnoreCase("q") != 0) {
            Rover currentRover = new Rover(currentInputLine,plateauSize);
            System.out.println("Enter command for rover:");
            currentInputLine = scanner.nextLine();
            currentRover.SetCommandForRover(currentInputLine);
            _rovers.Add(currentRover);
        }
    }

    private String GetInputForPlateauSize() {
        System.out.println("Enter the upper-right coordinates of the plateau");
        String inputForUpperRightCoordinatesOfPlateau = scanner.nextLine();
        return inputForUpperRightCoordinatesOfPlateau;
    }
}
