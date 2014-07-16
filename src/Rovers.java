import java.util.ArrayList;
import java.util.List;

/**
 * Created by nilajapatankar on 6/20/14.
 */
public class Rovers {
    private List<Rover> _rovers;

    public Rovers(){
        _rovers = new ArrayList<Rover>();
    }

    public Rover GetRoverAtIndex(int index)
    {
        return _rovers.get(index);
    }

    public void Add(Rover rover) {
        _rovers.add(rover);
    }

    public int GetSize() {
        return _rovers.size();
    }
}
