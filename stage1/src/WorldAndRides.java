
/**
 * Write a description of class WorldAndRides here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WorldAndRides
    int[] worldData;
    int [] rideData;
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

{
    public WorldAndRides(String worldAndRidesFileName) throws FileFormatException {
        //TODO read the world information from worldAndRidesFileName
        //and store the information in this class
        
        //TODO read the information about the requested rides and store the
        //information in this class
    }

    public void readFile(String worldAndRidesFileName)
    {
        int count = 1;
        try {
            Scanner myReader = new Scanner(worldAndRidesFileName);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (count == 1)
                {
                    worldData = data.split("\\s");
                    setWorld(worldData);
                }
                else
                {
                    rideData = data.split("\\s");
                    setRide(rideData);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    //TODO define appropriate methods for this class.

    public void setWorld(int [] worldData)
        {
            worldRow = worldData[0];
            WorldColumn = worldData[1];
            vehicle = worldData[2];
            rides = worldData[3];
            bonus = worldData[4];
            steps = worldData[5];
        }

    public void setRide (int [] rideData)
        {
            location[0]= rideData[0];
            location[1]= rideData[1];
            destination[0]= rideData[3];
            destination[1]= rideData[4];
            start = rideData[5];
            finish = rideData[6];
        }
}
