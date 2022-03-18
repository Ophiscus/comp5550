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
   String allocationFileName; 
   int score; 
   int bonus;
   public Simulation(String worldAndRidesFileName, String allocationFileName) {
       this.worldAndRidesFileName = worldAndRidesFileName;
       this.allocationFileName = allocationFileName;
       score = 0;
   }
    
    
   public void run()  throws IOException{
       score = 0;
       try {
           WorldAndRides worldAndRides = new WorldAndRides(worldAndRidesFileName);
           ArrayList<Rides> list = worldAndRides.getList();
           bonus = worldAndRides.getBonus();
           
           Allocation allocation = new Allocation(allocationFileName, worldAndRides);
           ArrayList<RideData> routList = allocation.getRoutes();
           Cars[]car = allocation.getCars();
           
           for(int i = 0 ; i <= routList.size() -1; i++)
           {
               RideData data = routList.get(i);
               int carNumber = data.getCar();
               Cars currentCar = car[carNumber - 1];
               ArrayList<Integer>routes = data.getRideData();
               for(int j = 0 ; j <= routes.size() -1; j++)
               {
                   int currentRide = routes.get(j);
                   Rides ride = list.get(currentRide - 1);
                   currentCar.setLocation(ride.getLocation());
                   currentCar.setDestination(ride.getDestination());
                   currentCar.calculate(ride.getStart());
                   if(currentCar.getVerdict() == true)
                   {
                       if(ride.getFinish() >= currentCar.getTime())
                       {
                            score = score + currentCar.getCalculation() + bonus;
                        }
                        else
                        {
                            score = score + 0;
                        }
                    }
                    else
                    {
                        if(ride.getFinish() >= currentCar.getTime())
                       {
                            score =score + currentCar.getTime();
                        }
                        else
                        {
                            score = score + 0;
                        }
                    }
                }
            }
           //compute score of allocation
           //....
           System.out.println(score);
       } catch (FileFormatException e) {
           System.out.println ("ERROR "+ e.description());
       }
       
   }
   
}
