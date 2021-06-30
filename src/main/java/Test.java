import DataBase.CarDAO;
import DataBase.CarDB;
import Parking.Car;

import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Time t1 = Time.valueOf(LocalTime.now());
        Time t2 = Time.valueOf(LocalTime.of(1,2));
System.out.println(new Time(t1.getTime()- t2.getTime()));

    }
}
