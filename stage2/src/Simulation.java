import java.util.*;
import java.io.*;

/**
 * Write a description of class Simulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Simulation
{
   String worldAndRidesFileName;
   WorldAndRides worldAndRide;
   ArrayList <Rides> rides = new ArrayList();
   ArrayList <Cars> cars = new ArrayList();
   int score; 
   int bonus;
   public Simulation(String worldAndRidesFileName) throws IOException {
       this.worldAndRidesFileName = worldAndRidesFileName;
       score = 0;
       try{
           worldAndRide = new WorldAndRides(worldAndRidesFileName);
        }catch(FileNotFoundException e)
       {
           e.printStackTrace();
        }
   }
    
    
   public void run()  throws IOException
   {
        rides = worldAndRide.getList();
        cars = worldAndRide.getVehicles();
        int count = 0;
        for (int i = 0 ; i <= rides.size() -1; i++)
        {
            Cars car = cars.get(count);
            car.addRide(rides.get(i));
            count++;
            if(count >= cars.size())
            {
                count = 0;
            }
        }
        for(int j = 0; j <= cars.size() -1; j++)
        {
            printAllocation(j);
        }
   }
   
   public void printAllocation(int number)
   {
       Cars car = cars.get(number);
       int carNumber = number + 1;
       ArrayList <Rides> currentRides = car.getRides();
       System.out.print( carNumber + " " );
        for(int i = 0; i <= currentRides.size() - 1; i++)
        {
            Rides instance = currentRides.get(i);
            System.out.print(instance.getRideNumber() + " ");
        }
        System.out.print("\n");
    }
}