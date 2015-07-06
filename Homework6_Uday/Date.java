
/**
 * Determines horoscope of a date.
 * 
 * @author Uday
 * @version 1.0
 */
public class Date
{
    int mon;
    int day;
    String fort = "";
    /**
     * Creates a date.
     * @param x Month
     * @param y Day
     */
    public Date(int x, int y){
        mon = x;
        day =  y;
    }
    /**
     * Returns horoscope for date.
     */
    public String getFortune(){
        
        if((mon==3&&day>=21&&day<=30)||(mon==4&&day>=1&&day<19)){
            fort= "Aries/ You are active, determined and ambitious.";
        
        }
        else if((mon==4&&day>=20&&day<=30)||(mon==5&&day>=1&&day<20)){
            fort= "Taurus/ You are instructive, patient, and you have a subtle strength.";
        
        }
        else if((mon==5&&day>=21&&day<=30)||(mon==6&&day>=1&&day<20)){
            fort= "Gemini/ You are intelligent, indecisive, and open to change.";
        
        }
        else if((mon==6&&day>=21&&day<=30)||(mon==7&&day>=1&&day<22)){
            fort= "Cancer/ You are emotional, diplomatic, and impulsive.";
        
        }
        else if((mon==7&&day>=23&&day<=30)||(mon==8&&day>=1&&day<22)){
            fort= "Leo/ You are warm, generous and faithful.";
        
        }
        else if((mon==8&&day>=23&&day<=30)||(mon==9&&day>=1&&day<22)){
            fort= "Virgo/ You are analytical, practical, and thoughtful.";
        
        }
        else if((mon==9&&day>=23&&day<=30)||(mon==10&&day>=1&&day<22)){
            fort= "Libra/ You are balanced, honest, and beautiful.";
        
        }
        else if((mon==10&&day>=23&&day<=30)||(mon==11&&day>=1&&day<21)){
            fort= "Scorpio/ You are purposeful, couraged, and transient..";
        
        }
        else if((mon==11&&day>=22&&day<=30)||(mon==12&&day>=1&&day<21)){
            fort= "Sagittarius/ You are philosophical, experimental, and optimistic.";
        
        }
        else if((mon==12&&day>=22&&day<=30)||(mon==1&&day>=1&&day<19)){
            fort= "Capricorn/ You are determined, dominant, and willful.";
        
        }
        else if((mon==1&&day>=20&&day<=30)||(mon==2&&day>=1&&day<18)){
            fort= "Aquarius/ You are wise, serious, and inciteful.";
        
        }
        else if((mon==2&&day>=19&&day<=30)||(mon==3&&day>=1&&day<20)){
            fort= "Pisces/ You are imaginative, indepth, and reactive.";
        
        }
        return fort;
    
    }
}
