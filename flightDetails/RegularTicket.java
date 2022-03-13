package flightDetails;

import java.time.LocalDateTime;

public class RegularTicket extends Ticket {
    private String specialServices;

    public RegularTicket(String pnrNo, String from, String to, String departureTime,
                         String arrivalTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Traveller traveller, String specialServices) {
        super(pnrNo, from, to, departureTime, arrivalTime, seatNo, price, cancelled,
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
