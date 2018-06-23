import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        //1
        Date now = new Date();
        //2
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        //3
        int day = c.get(Calendar.DAY_OF_MONTH);
        //4
        day =+ 100;
        c.set(Calendar.DAY_OF_MONTH, day);
        //5
        Date future = c.getTime();
        //6
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(f.format(future));
    }
        
}