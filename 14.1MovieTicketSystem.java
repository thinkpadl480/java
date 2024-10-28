class TicketBooking {
    private int availableTickets;

    public TicketBooking(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public synchronized void bookTickets(String customerName, int tickets) {
        if (tickets <= availableTickets) {
            System.out.println(customerName + " successfully booked " + tickets + " tickets.");
            availableTickets -= tickets;
            System.out.println("Tickets remaining: " + availableTickets);
        } else {
            System.out.println(customerName + " failed to book tickets. Not enough tickets available.");
        }
    }
}

class Customer extends Thread {
    private TicketBooking ticketBooking;
    private String customerName;
    private int tickets;

    public Customer(TicketBooking ticketBooking, String customerName, int tickets) {
        this.ticketBooking = ticketBooking;
        this.customerName = customerName;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        ticketBooking.bookTickets(customerName, tickets);
    }
}

public class MovieTicketSystem {
    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking(10); // Total 10 tickets

        Customer customer1 = new Customer(ticketBooking, "Customer-1", 5);
        Customer customer2 = new Customer(ticketBooking, "Customer-2", 8);

        customer1.start();
        customer2.start();
    }
}
