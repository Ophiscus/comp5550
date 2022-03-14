import java.util.ArrayList;
/**
 * Write a description of class RideData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RideData
{
    // instance variables - replace the example below with your own
    int carNumber;
    ArrayList<Integer>ride;
    /**
     * Constructor for objects of class RideData
     */
    public RideData()
    {
        // initialise instance variables
        int carNumber =0;
        ride=new ArrayList<>();
    }

    public void addData(int value)
    {
        ride.add(value);
    }
    
    public void setCar(int value)
    {
        carNumber= value;
    }
    
    public int getCar()
    {
        return carNumber;
    }
    
    public ArrayList getRideData()
    {
        return ride;
    }
}
