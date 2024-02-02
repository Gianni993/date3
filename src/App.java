import java.time.OffsetDateTime;

public class App {
    public static void main(String[] args) throws Exception {

       OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
       int year = dateTime.getYear();
       int month = dateTime.getMonthValue();
       int day = dateTime.getDayOfMonth();
       String dayOfWeek = dateTime.getDayOfWeek().toString();

        System.out.println("Anno: " + year);
        System.out.println("Mese: " + month);
        System.out.println("Giorno: " + day);
        System.out.println("Giorno della settimana: " + dayOfWeek);
    }
}
