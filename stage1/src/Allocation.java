import java.util.*;

/**
 * Write a description of class Allocation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Allocation

    //TODO decide a proper data-structure to store the allocation

{
    private WorldAndRides routes;
    
    public Allocation(String allocationFileName, WorldAndRides worldAndRides) throws FileFormatException {
        //TODO read an allocation from allocationFileName and stores the content in
        //an appropriate datastructure inside this class
        routes = worldAndRides;
    }
    
    public void readFile(String allocationFileName) throws FileFormatException
    {
        int count = 1;
        Scanner myReader = new Scanner(allocationFileName);
        try  {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (count == 1)
                {
                    String[]worldData = data.split("\\s");
                    setWorld(worldData);
                    count++;
                }
                else
                {
                    rideData = data.split("\\s");
                    setRide(rideData);
                }
            }
            myReader.close();
        } 
        finally
        {
            myReader.close();
        }
    }
    
    public void getRides ()
    {
        
    }
    //TODO define appropriate methods for this class (e.g. accessor methods)
}