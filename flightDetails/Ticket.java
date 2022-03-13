package flightDetails;
import java.time.LocalDateTime;

public abstract class Ticket {
    private String pnrNo;
    private String from;
    private String to;
    private String departureTime;
    private String arrivalTime;
    private String seatNo;
    private float price;
    private boolean cancelled;
    private Flight flight;
    private Traveller traveller;

    public Ticket(String pnrNo, String from, String to, String departureTime,
                  String arrivalTime, String seatNo, float price, boolean cancelled,
                  Flight flight, Traveller traveller) {
        this.pnrNo = pnrNo;
        this.from = from;
        this.to = to;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.flight = flight;
        this.traveller = traveller;
    }

    public String checkStatus() {
        return cancelled ? "Cancelled" : "Confirmed";
    }

    public int getFlightDuration() {
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureTime);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalTime);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
                (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }

    public void cancel() {
        cancelled = true;
    }

    public String getPnrNo() {
        return pnrNo;
    }

    public void setPnrNo(String pnr) {
        this.pnrNo = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Traveller getTraveller() {
        return traveller;
    }

    public void setTraveller(Traveller traveller) {
        this.traveller = traveller;
    }
}
