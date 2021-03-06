package flightDetails;

public class Source {

    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("AZMF12245", "Hyderabad",
                "Chennai", "13th March 2021 5:00 PM", "13th March 2021 8:00 PM",
                "3D", 3500, false,new Flight("1000","AirIndia",222,1), null, "lunch");

        Ticket touristTicket = new TouristTicket("HTL145889Z", "India", "Malaysia",
                "18th March 2021 12:00 PM", "18th March 2021 6:00 PM",
                "8F", 7900, false, null, null,
                "Malaysia Hotel", new String[]{""});
        Traveller travellerDetails = new Traveller("Anath Nagar","Bangalore","Karnataka",
                "Rajani","9554771315555","testing@gmail.com");

        getTicketDetails(regularTicket);
        getTicketDetails(touristTicket);
        getTravllerDetails(travellerDetails);
    }

    public static void getTicketDetails(Ticket ticket) {
        System.out.println("Pnr No: "+ ticket.getPnrNo());
        System.out.println("Departure Time: "+ticket.getDepartureTime());
        System.out.println("Arraival Time: "+ticket.getArrivalTime());
    }

    public static void getTravllerDetails(Traveller traveller) {
        System.out.println("traveller Address Details"+ traveller.getAddressDetails());
    }


}
