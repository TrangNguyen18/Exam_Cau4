import intities.Ticket;

import java.text.ParseException;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws ParseException {
        Ticket tk1 = new Ticket();
        tk1.inputTicketInfor();
        System.out.println(tk1.toString());
    }
}
