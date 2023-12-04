import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String args[]){
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time Without Formatting: " + currentDateTime);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        System.out.println("Current Date and Time: " + currentDateTime.format(format1));

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");
        System.out.println("Current Date and Time: " + currentDateTime.format(format2));

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("E, MMM dd yyyy hh:mm a");
        System.out.println("Current Date and Time: " + currentDateTime.format(format3));

        ZonedDateTime currentZoneDateTime = ZonedDateTime.now();
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mma z");
        System.out.println("Current Date,Time and Zone: " + currentZoneDateTime.format(format4));
    }
}
