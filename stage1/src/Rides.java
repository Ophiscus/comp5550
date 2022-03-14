
/**
 * Write a description of class Rides here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rides
{
    // instance variables - replace the example below with your own
    int[] location = new int[2];
    int[] destination = new int[2];
    int start = 0;
    int finish = 0;

    /**
     * Constructor for objects of class Rides
     */
    public Rides(String [] data)
    {
        // initialise instance variables
       location[0]= Integer.parseInt( data[0]);
        location[1]= Integer.parseInt( data[1]);
        destination[0]= Integer.parseInt( data[2]);
        destination[1]=  Integer.parseInt(data[3]);
        start =  Integer.parseInt( data[4]);
        finish =  Integer.parseInt(data[5]);
    }
    
    public int[] getLocation()
    {
        return location;
    }
    
    public int[] getDestination()
    {
        return destination;
    }
    
    public int getStart()
    {
        return start;
    }
    
    public int getFinish()
    {
        return finish;
    }
}
