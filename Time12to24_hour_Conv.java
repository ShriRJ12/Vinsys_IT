package DateandTimeAPITest_11Jan;
 import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time12to24_hour_Conv {
   
    public static void main(String[] args) {
        // Given time in 12-hour format
        String time12Hour = "05:45:30 PM";

        // Convert to military time (24-hour format)
        String time24Hour = convertToMilitaryTime(time12Hour);

        // Print the result
        System.out.println("Original 12-hour time: " + time12Hour);
        System.out.println("Converted to 24-hour time: " + time24Hour);
    }

    private static String convertToMilitaryTime(String time12Hour) {
        try {
            // Parse the input time using SimpleDateFormat
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss a");
            Date date = inputFormat.parse(time12Hour);

            // Format the date using a SimpleDateFormat with 24-hour format
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace(); // Handle parsing exception as needed
            return null;
        }
    }
}
