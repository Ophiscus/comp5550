import  java.util.*;
public class Cars
{
     int time;
     int[] destination;
     int[] location;
     int[] position;
     int calculation;
     int start;
     boolean verdict;
    public Cars()
    {
        time = 0;
        start = 0;
        location = new int[2];
        destination = new int[2];
        position = new int[2];
        position[0] = 0;
        position[1] = 0;
    }
    
    public void setTime(int number)
    {
        time = number;
    }
    
    public void setDestination(int [] number)
    {
        destination = number;
    }
    
    public void setLocation(int[] number)
    {
        location = number;
    }
    
    public int getTime()
    {
        return time;
    }
    
    public boolean getVerdict()
    {
        return verdict;
    }
    
    public int[] getLocation()
    {
        return location;
    }
    
    public int getStart()
    {
        return start;
    }
    
    public int getCalculation()
    {
        return calculation;
    }
    
    public void isearly(int value)
    {
        if(position == location && start <= value )
        {
            verdict = true;
        }
        else if(position == location && start > value)
        {
            verdict = false;
        }
        else
        {
            int i = position[0]- location[0];
            int j = position[1]- location[1];
            int incase= i + j + time;
            if(incase <= value )
            {
                time = value;
                verdict = true;
            }
            else
            {
                verdict = false;
            }
        }
    }
    
    public void calculate(int value)
    {
          isearly(value);  
          start = time;
          int x =Math.abs(location[0]- destination[0]);
          int y = Math.abs(location[1]- destination[1]);
          calculation = x + y ;
          position = destination;
          time = time + calculation;
    }
}
