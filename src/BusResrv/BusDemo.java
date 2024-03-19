package BusResrv;
import java.util.*;
public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,55));

        for(Bus b:buses) {
            b.displayBusInfo();
        }

        Scanner sc = new Scanner(System.in);

        int UserOption = 1;
        while(UserOption == 1){
            System.out.println("Enter 1 to Book or 2 to Exit");
            UserOption = sc.nextInt();
            if(UserOption == 1){
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your Booking is confirmed");
                }
                else
                    System.out.println("Sorry. Bus is full. Try another bus or date ");
            }
        }
    }
}
