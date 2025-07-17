package Bus_Booking;

import java.util.Scanner;

class Bus {
    String number;
    static Passanger[] seats = new Passanger[20];

    public String bookSeat(int seatNo, Passanger passanger) {
        if (seatNo < 1 || seatNo > seats.length) {
            return "Please Select Valid Seat Number From 1-20.";
        }
        if (seats[seatNo] == null) {
            seats[seatNo] = passanger;
            passanger.number = "MH 13 BY 1111";
            return "Your details:\nName: " + passanger.getName() + "\nMobile: " + passanger.getMobile()
                    + "\nDestination: " + passanger.getDestination() + "\nBus Number: " + passanger.number
                    + "\nSeat Number: " + seatNo
                    + " Booked Successfully!";
        } else {
            return "Seat: " + seatNo + " is already booked by someone else";
        }
    }

    public String showSeats() {
        System.out.println("Seat Status:");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == null) {
                System.out.println("Seat: " + i + " Available.");
            } else {
                System.out.println("Seat: " + i + " Not Available.");
            }
        }
        return null;
    }
}

class Passanger extends Bus {
    private String name;
    private String mobile;
    private String destination;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Your registration completed.\nName: " + name + ", Mobile: " + mobile;
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Bus Booking System");
        Scanner sc = new Scanner(System.in);
        Bus bus = new Bus();
        Passanger currentPassanger = null;

        while (true) {
            System.out
                    .println("1.Register\n2.Book Seat For Group\n3.Book Seat For Single Person\n4.Show Seats\n5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    currentPassanger = new Passanger();
                    System.out.println("Enter Your Name: ");
                    String name = sc.next();
                    System.out.println("Enter Your Mobile Number: ");
                    String mobile = sc.next();
                    currentPassanger.setName(name);
                    currentPassanger.setMobile(mobile);
                    System.out.println(currentPassanger);
                    break;
                case 2:
                    System.out.println("Enter Number People: ");
                    int people = sc.nextInt();
                    System.out.println("Enter Destination: ");
                    String dest = sc.next();
                    for (int i = 0; i < people; i++) {
                        currentPassanger = new Passanger();
                        System.out.println("Enter Person " + (i + 1) + " Name: ");
                        String name1 = sc.next();
                        System.out.println("Enter Person " + (i + 1) + " Mobile Number: ");
                        String mobile1 = sc.next();
                        currentPassanger.setName(name1);
                        currentPassanger.setMobile(mobile1);
                        System.out.println("Enter Seat Number For Person: " + (i + 1));
                        int seatNo = sc.nextInt();
                        currentPassanger.setDestination(dest);
                        String status = bus.bookSeat(seatNo, currentPassanger);
                        System.out.println(status);
                    }
                    break;
                case 3:
                    if (currentPassanger == null) {
                        System.out.println("Please register first.");
                        break;
                    }
                    System.out.println("Enter Destination: ");
                    String dest1 = sc.next();
                    System.out.println("Enter Seat Number You Want To Book:");
                    int seatNo = sc.nextInt();
                    currentPassanger.setDestination(dest1);
                    String status = bus.bookSeat(seatNo, currentPassanger);
                    System.out.println(status);
                    break;
                case 4:
                    bus.showSeats();
                    break;
                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    return;
                default:
                    System.out.println("Please Enter Correct Option From List.");
                    break;
            }
        }

    }
}