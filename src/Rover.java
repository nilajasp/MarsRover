import java.util.*;

/**
 * Created by nilajapatankar on 6/15/14.
 */
public class Rover {
    IPositionOfRover _position;
    List<ICommandForRover> _commands;
    Plateau _plateau;

    public Rover(String positionInput, String plateauSize) {
        _commands = new ArrayList<ICommandForRover>();
        String[] positionDetails = positionInput.split(" ");
        Map<String, IPositionOfRover> directionMapper = new HashMap<String, IPositionOfRover>();
        CoordinatePositionOfRover coordinatePositionOfRover = new CoordinatePositionOfRover();
        coordinatePositionOfRover.setPositionOfRover(positionDetails[0], positionDetails[1]);
        directionMapper.put("N",new NorthFacingPosition(coordinatePositionOfRover));
        directionMapper.put("E",new EastFacingPosition(coordinatePositionOfRover));
        directionMapper.put("S",new SouthFacingPosition(coordinatePositionOfRover));
        directionMapper.put("W",new WestFacingPosition(coordinatePositionOfRover));
        _position = directionMapper.get(positionDetails[2]);
        _plateau = new Plateau(plateauSize);
    }

    public void Move() {
        try {
            for (int loopCounter = 0; loopCounter < _commands.size(); loopCounter++) {
                ICommandForRover currentCommand = _commands.get(loopCounter);
                IPositionOfRover newPosition = currentCommand.ExecuteCommand(_position,_plateau);
                _position = newPosition;
            }
        }
        catch(Exception e)
        {
            System.out.println("Rover moved out of the plateau.");
        }
    }

    public void DisplayFinalPosition() {
        System.out.println("Final position of rover:\n" + _position.GetCurrentValue());
    }

    public void SetCommandForRover(String commands)
    {
        Map<Character, ICommandForRover> commandMapper = new HashMap<Character, ICommandForRover>();
        commandMapper.put('M', new MoveCommand());
        commandMapper.put('L', new TurnLeftCommand());
        commandMapper.put('R', new TurnRightCommand());
        for (int loopCounter = 0; loopCounter < commands.length(); loopCounter++) {
            Character commandInput = commands.charAt(loopCounter);
            ICommandForRover command = commandMapper.get(commandInput);
            _commands.add(command);
        }
    }
}
