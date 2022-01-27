import  java.util.*;
public class Cars
{
     int time;
     int distanceVerticle;
     int distanceHorizontal;
     int[] location;
     
    public Cars()
    {
        time = 0;
        distanceVerticle = 0;
        distanceHorizontal =0;
        location =new int[2];
    }
    
    public void setTime(int number)
    {
        time = number;
    }
    
    public void setVerticle(int number)
    {
        distanceVerticle = number;
    }
    
     public void setHorizontal(int number)
    {
        distanceHorizontal = number;
    }
    
    public void setlocation(int[] number)
    {
        location = number;
    }
    
    public int getTime()
    {
        return time;
    }
    
    public int getVerticle()
    {
        return distanceVerticle;
    }
    
    public int getHorizontal()
    {
        return distanceHorizontal;
    }
    
    public int[] getLocation()
    {
        return location;
    }
}
