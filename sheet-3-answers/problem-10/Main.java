import java.util.*;

class Main {
    public static void main(String[] Args) {
        /*
        example input:
        10:40:am
        1:0:pm
        do not copy and paste
        output :
        2:20
        */
        time x = new time();
        time y = new time();
        time res = new time(0,0,"");
        res.duration(x,y);
        System.out.println("duration is ");
        res.display();
    }
}
class time
{
    Scanner sc = new Scanner(System.in);
    public double hours;
    public double minutes;
    String time_of_day;
    public time(double h , double m , String w) // constructor to initialize manually
    {
        hours = h ;
        minutes = m;
        time_of_day = w;
    }
    public time() // overloaded constructor to take input
    {
        nextTime();
    }
    public void display()
    {
        System.out.print((int)hours + ":" +(int) minutes + " "+ time_of_day);
    }
    public time to_24() // convert to 24 hour system
    {
        time res = new time(hours , minutes , time_of_day);
        if(time_of_day.equals("pm"))
        {
            res.hours = hours + 12;
            res.time_of_day = "";
        }
        return res;
    }
    public void duration(time x , time y) // duration from x to y
    {
        double tempx = x.to_24().hours + (x.to_24().minutes)/60.0;
        double tempy = y.to_24().hours + (y.to_24().minutes)/60.0;
        if(tempy < tempx)
        {
            tempy += 24;
        }
        double res = tempy - tempx;
        double resm = res - Math.floor(res);
        time r = new time(Math.floor(res),Math.round(resm * 60),"");
        hours = r.hours;
        if(r.minutes == 60)
        {
            hours+= 1;
            minutes = 0;
        }
        else
        minutes = r.minutes;
        time_of_day = "";
    }
    public void nextTime() // take input in format hh:mm:am/pm
    {
        String []hhmm = sc.nextLine().split(":"); // split a string with certain regex ":" and return an array
        hours = Double.parseDouble(hhmm[0]); // hhmm[0] = hh
        minutes = Double.parseDouble(hhmm[1]);// hhmm[1] = mm
        time_of_day = hhmm[2]; // hhmm[2] = am/pm
    }
}