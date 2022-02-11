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
    ArrayList<RideData> routList;
    String[]allocationData;
    Cars[] car;
    int allocation;
    public Allocation(String allocationFileName, WorldAndRides worldAndRides) throws FileFormatException {
        //TODO read an allocation from allocationFileName and stores the content in
        //an appropriate datastructure inside this class
        routes = worldAndRides;
        readFile(allocationFileName);
        makeCars(worldAndRides);
    }
    
    public void readFile(String allocationFileName) throws FileFormatException
    {
        int count = 1;
        Scanner myReader = new Scanner(allocationFileName);
        try  {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                allocationData = data.split("\\s");
                ride(allocationData);
                count++;
            }
            myReader.close();
        } 
        finally
        {
            myReader.close();
        }
    }
    
    public void makeCars(WorldAndRides worldAndRides)
    {
        car = new Cars[worldAndRides.getVehicles()];
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