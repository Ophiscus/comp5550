import java.util.*;
import java.io.*;

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
    ArrayList<RideData> routList = new ArrayList<>();
    String[]allocationData;
    Cars[] car;
    int allocation;
    public Allocation(String allocationFileName, WorldAndRides worldAndRides) throws IOException, FileFormatException {
        //TODO read an allocation from allocationFileName and stores the content in
        //an appropriate datastructure inside this class
        routes = worldAndRides;
        try
        {
            readFile(allocationFileName);
        }
        catch (FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
        makeCars(worldAndRides);
    }
    
    public void readFile(String allocationFileName) throws IOException,FileNotFoundException,FileFormatException
    {
        int count = 1;
        BufferedReader br = new BufferedReader(new FileReader(allocationFileName));
        String line = "";
        try  {
            while ((line = br.readLine()) != null) {
                allocationData = line.split("\\s");
                ride(allocationData);
                count++;
            }
        } 
        catch(FileNotFoundException ioe)
        {
            ioe.printStackTrace();
        }
    }
    
    public void makeCars(WorldAndRides worldAndRides)
    {
        int number = worldAndRides.getVehicles();
        car = new Cars[number];
        int i = 0;
        while( i < number)
        {
            Cars newCar = new Cars();
            car[i] = newCar;
            i++;
        }
    }
    
    public void ride(String[]allocationData)
    {
        RideData data = new RideData();
        data.setCar(Integer.parseInt(allocationData[0]));
        for(int i =1 ; i< allocationData.length; i++)
        {
            data.addData(Integer.parseInt(allocationData[i]));
        }
        routList.add(data);
    }
    
    public Cars[] getCars()
    {
        return car;
    }
    
    public ArrayList getRoutes()
    {
        return routList;
    }
}