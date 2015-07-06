
/**
 * Determines which of two times is first.
 * 
 * @author Uday
 * @version 1.0
 */
public class Time
{
    int x;
    int y;
    /**
     * Creates a time.
     * @param hour Hour of time.
     * @param min Minutes of time.
     */
 public Time(int hour, int min){
    x=hour;
    y=min;
    
    }
    /**
     * Compares two times
     * @return Returns the order value of the time.
     * @param hour2 Compared hour.
     * @param min2 Compared minute.
     */
 public int compareTo(int hour2, int min2){
     int returnValue = -1;
     
    if (x<hour2){
     returnValue = -1;
    }
    else if(x==hour2){
        if(y<min2){
            returnValue = -1;    
        }
        else if(y==min2){
            returnValue = 0;
        }
      else{
        returnValue = 1;
        }
    }
    
    return returnValue;
    }
}
