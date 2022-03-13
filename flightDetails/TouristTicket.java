package flightDetails;

import java.time.LocalDateTime;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] selectedTouristLocation;

    public TouristTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Traveller traveller, String hotelAddress,
                         String[] selectedTouristLocation) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, traveller);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public void removeTouristLocation(String location) {
        int index=-1;
        for (int i=0; i<selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i].equals(location)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return;
        }
        for (int i=index; i< selectedTouristLocation.length-1; i++) {
            selectedTouristLocation[i] = selectedTouristLocation[i+1];
        }
        selectedTouristLocation[selectedTouristLocation.length-1] = null;
    }

    public void addTouristLocation(String location) {
        int index = -1;
        int i = 0;
        int len = selectedTouristLocation.length;
        while(i< len){
            if (selectedTouristLocation[i] == null) {
                index = i;
                break;
            }
            i++;
        }
//        for (int i=0; i< selectedTouristLocation.length; i++) {
//            if (selectedTouristLocation[i] == null) {
//                index = i;
//                break;
//            }
//        }
        if (index != -1) {
            selectedTouristLocation[index] = location;
        }
    }
}
