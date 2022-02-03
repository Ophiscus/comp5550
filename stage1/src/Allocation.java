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
    int[] location;
    int[] destination;
    int start;
    int finish;
    int rideCount;
    int allocation;
    int exactRide;
    public Allocation(String allocationFileName, WorldAndRides worldAndRides) throws FileFormatException {
        //TODO read an allocation from allocationFileName and stores the content in
        //an appropriate datastructure inside this class
        routes = worldAndRides;
        rideCount = 0;
        makeCars(worldAndRides);
    }
    
    public void readFile(String allocationFileName) throws FileFormatException
    {
        int count = 1;
        Scanner myReader = new Scanner(allocationFileName);
        try  {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[]worldData = data.split("\\s");
                count++;
            }
            myReader.close();
        } 
        finally
        {
            myReader.close();
        }
    }
    
    public void getRides (String [] data)
    {
        location[0]= Integer.parseInt( data[0]);
        location[1]= Integer.parseInt( data[1]);
        destination[0]= Integer.parseInt( data[3]);
        destination[1]=  Integer.parseInt(data[4]);
        start =  Integer.parseInt( data[5]);
        finish =  Integer.parseInt(data[6]);
    }
    
    public void getRoutes(String [] data)
    {
        allocation =Integer.parseInt( data[0]);
        
        for(int i = 1; i< data.length;count++)
        {
            exactRide = data[i];
        }
        //TODO define appropriate methods for this class (e.g. accessor methods)
    }
    
    public void makeCars(WorldAndRides worldAndRides)
    {
        Cars[] car = Car[woldAndRide.getVehicle()];
    }