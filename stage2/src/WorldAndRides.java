import java.util.*;
import java.io.*;
/**
 * Write a description of class WorldAndRides here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WorldAndRides{
    ArrayList<Rides> list = new ArrayList<>();
    ArrayList<Cars> carList = new ArrayList<>();
    int worldRow;
    int worldColumns;
    int vehicles;
    int rides;
    int bonus;
    int steps;
    //TODO decide a proper data-structure to store the information about the world
    //make an array for the rides to send to allocations.
    public WorldAndRides(String worldAndRidesFileName) throws IOException {
        try
        {
            //TODO read the world information from worldAndRidesFileName
            //and store the information in this class
            readFile(worldAndRidesFileName);
        }
        catch (FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
        //TODO read the information about the requested rides and store the
        //information in this class
    }

    public void readFile(String worldAndRidesFileName) throws IOException,FileNotFoundException
    {
        int count = 1;
        BufferedReader br = new BufferedReader(new FileReader(worldAndRidesFileName));
        String line = "";
        try  {
            while ((line = br.readLine()) != null) {
                if (count == 1)
                {
                    String[]worldData = line.split("\\s");
                    setWorld(worldData);
                    count++;
                }
                else
                {
                    String[]rideData = line.split("\\s");
                    Rides ride = new Rides(rideData);
                    list.add(ride);
                    count++;
                }
            }
        } 
        catch(FileNotFoundException fe)
        {
            fe.printStackTrace();
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
        
        for(int i = 0 ; i <= vehicles; i++)
        {
            Cars car = new Cars();
            carList.add(car);
        }
    } 
    
    public ArrayList getVehicles()
    {
        return carList;
    }
    
    public ArrayList getList()
    {
        return list;
    }
    
    public int getBonus()
     {
         return bonus;
        }
}
