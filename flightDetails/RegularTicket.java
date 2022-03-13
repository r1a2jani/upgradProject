package flightDetails;

import java.time.LocalDateTime;

public class RegularTicket extends Ticket {
    private String specialServices;

    public RegularTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Traveller traveller, String specialServices) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled,
                flight, traveller);
        this.specialServices = specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
