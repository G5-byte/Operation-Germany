class Ticket {

    private int ticket = 5;

    public synchronized void bookTicket(int count) {

        if(count <= ticket) {
            System.out.println(Thread.currentThread().getName() + "Successfully booked " + count + " tickets.");

            ticket -= count;

            System.out.println("Ticket left : " + ticket);
        }else {
            System.out.println(Thread.currentThread().getName() + "only " + ticket + " remaining! So booking fails.");
        }
    }

    public int getTicket() {
        return ticket;
    }
}

class TicketBooking {
    public static void main(String[] args) throws InterruptedException {
        
        Ticket ticket = new Ticket();

        Thread t1 = new Thread(() -> ticket.bookTicket(3), "Person-1 : ");

        Thread t2 = new Thread(() -> ticket.bookTicket(3), "Person-2 : ");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Booking Closed !");
    }
}
