import java.util.*;
import java.io.*;

/**
 * Write a description of class WorldAndRides here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WorldAndRides{
    String[] rideData;
    int worldRow;
    int worldColumns;
    int vehicles;
    int rides;
    int bonus;
    int steps;
    int[] location;
    int[] destination;
    int start;
    int finish;
    //TODO decide a proper data-structure to store the information about the world
    //and the requested rides.


    public WorldAndRides(String worldAndRidesFileName) throws FileFormatException {
        //TODO read the world information from worldAndRidesFileName
        //and store the information in this class
        
        //TODO read the information about the requested rides and store the
        //information in this class
    }

    public void readFile(String worldAndRidesFileName) throws FileFormatException
    {
        int count = 1;
        Scanner myReader = new Scanner(worldAndRidesFileName);
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
    //TODO define appropriate methods for this class.

    public void setWorld(String[] worldData)
        {
            worldRow = Integer.parseInt( worldData[0]);
            worldColumns = Integer.parseInt( worldData[1]);
            vehicles = Integer.parseInt( worldData[2]);
            rides =  Integer.parseInt(worldData[3]);
            bonus = Integer.parseInt( worldData[4]);
            steps = Integer.parseInt( worldData[5]);
        }

    public void setRide (String[] rideData)
        {
            location[0]= Integer.parseInt( rideData[0]);
            location[1]= Integer.parseInt( rideData[1]);
            destination[0]= Integer.parseInt( rideData[3]);
            destination[1]=  Integer.parseInt(rideData[4]);
            start =  Integer.parseInt( rideData[5]);
            finish =  Integer.parseInt(rideData[6]);
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
    
    public int getVehicles()
    {
        return vehicles;
    }
    
    public int getFinish()
    {
        return finish;
    }
}
