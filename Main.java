import java.util.Scanner;

import Dto.Customer;
import Dto.Reservation;

// ================Main class=================
class Main {

    static Scanner sc = new Scanner(System.in);

    // ================Instances of classes=======================
    static CustomerRegistration customerRegistration = CustomerRegistration.getInstance();

    static SeatReservation seatReservation = SeatReservation.getInstance();

    static BusRegistraion busRegistration = BusRegistraion.getInstance();
    // ================End of instances of classes=================

    public static void main(String[] args) {
        try {
            // =================Main Menu==================================================
            System.out.println("=============Welcome to Bus Reservation System=============");
            System.out.println("Enter 1 to Register a Bus");
            System.out.println("Enter 2 to View All Buses");
            System.out.println("Enter 3 to Add a Customer");
            System.out.println("Enter 4 to View All Customers");
            System.out.println("Enter 5 to Search Buses");
            System.out.println("Enter 6 to Make a Reservation");
            System.out.println("Enter 7 to View All reservations");
            System.out.println("Enter 8 to Change Seat");
            System.out.println("Enter 9 to Cancel Reservation");
            System.out.println("Enter 10 to Exit\n");
            System.out.print("Enter your choice : ");
            while (true) {
                int choice = sc.nextInt();
                // =====================Navigate user based on choice=====================
                switch (choice) {
                    case 1:
                        // ========Register a bus=========
                        busRegistration.register();
                        returnToMainMenu();
                        break;
                    case 2:
                        // ========View all buses=========
                        busRegistration.showBuses();
                        returnToMainMenu();
                        break;
                    case 3:
                        // ========Register a customer=========
                        if (CustomerRegistration()) {
                            System.out.println("=============Customer added successfully=============\n");
                            returnToMainMenu();
                        }
                        break;
                    case 4:
                        // ========View all customers=========
                        customerRegistration.display();
                        returnToMainMenu();
                        break;
                    case 5:
                        // ========Search buses=========
                        busRegistration.searchBus();
                        returnToMainMenu();
                        break;
                    case 6:
                        // ========Make a reservation=========
                        if (MakeReservation()) {
                            System.out.println("=============Reservation made successfully=============\n");
                            returnToMainMenu();
                        }
                        break;
                    case 7:
                        // ========View all reservations=========
                        seatReservation.display();
                        returnToMainMenu();
                        break;
                    case 8:
                        // ========Change seat=========
                        seatReservation.changeSeat();
                        returnToMainMenu();
                        break;
                    case 9:
                        // ========Cancel reservation=========
                        if (cancelReservation()) {
                            System.out.println("=====================================");
                            System.out.println("Reservation cancelled successfully. Seat is now available for new reservation");
                            System.out.println("=====================================");
                        } else {
                            System.out.println("=====================================");
                            System.out.println("Reservation not found");
                            System.out.println("=====================================");
                        }
                        returnToMainMenu();
                        break;
                    case 10:
                        System.out.println("=============Thank you for using Bus Reservation System=============");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("==============================================");
                        System.out.println("Invalid Input! Please try again.");
                        System.out.println("==============================================\n");
                        break;
                }
                // =====================End of Navigate user based on
                // choice=====================
            }
            // ==================End of Main Menu======================
            // ==================Exception Handling====================
        } catch (Exception e) {
            System.out.println("===============================");
            System.out.println("Invalid Input");
            System.out.println(e);
            System.out.println("===============================");
        }
        // ==================End of Exception Handling==================
    }

    // ===========Register a Customer method============================
    public static boolean CustomerRegistration() {
        try {
            System.out.println("=============Register a Customer=============");
            System.out.println("Enter Customer Name");
            String customerName = sc.next();
            System.out.println("Enter Customer Age");
            int customerAge = sc.nextInt();
            System.out.println("Enter Customer Phone Number");
            String customerPhoneNumber = sc.next();
            System.out.println("Enter Customer Email");
            String customerEmail = sc.next();
            System.out.println("Enter Customer City");
            String customerCity = sc.next();
            // ===========Register customer===================================
            Customer customer = new Customer();
            customer.setName(customerName);
            customer.setAge(customerAge);
            customer.setMobile(customerPhoneNumber);
            customer.setEmail(customerEmail);
            customer.setCity(customerCity);
            customerRegistration.push(customer);
            return true;
            // ===========End of Register customer============================
        } catch (Exception e) {
            System.out.println("===============================");
            System.out.println("Invalid Input");
            System.out.println(e);
            System.out.println("===============================");
            return false;
        }
        // ===========End of Register customer============================
    }
    // ===========End of Register a Customer method=======================

    // ===========Make a reservation method===============================
    public static boolean MakeReservation() {
        try {
            System.out.println("=============Make a Reservation=============");
            System.out.println("Enter Customer Email");
            String customerEmail = sc.next();
            System.out.println("Enter Bus Number");
            int busNumber = sc.nextInt();
            System.out.println("Enter Seat Number");
            int seatNumber = sc.nextInt();

            // ===========Check if customer is registered=====================
            if (customerRegistration.search(customerEmail) == null) {
                System.out.println("=====================================");
                System.out.println("Customer not found. Please register first");
                System.out.println("=====================================");
                return false;
            }
            // ===========Make a reservation==================================
            Reservation reservation = new Reservation();
            reservation.setEmail(customerEmail);
            reservation.setBusNumber(busNumber);
            reservation.setSeatNumbers(seatNumber);
            seatReservation.enqueue(reservation);
            return true;
            // ===========End of Make a reservation===========================
        } catch (Exception e) {
            System.out.println("===============================");
            System.out.println("Invalid Input");
            System.out.println(e);
            System.out.println("===============================");
            return false;
        }
    }
    // ===========End of Make a reservation method========================

    // ==================Return to Main Menu method=========================
    public static void returnToMainMenu() {
        System.out.println("Return to Main Menu? (Y/N)");
        while (true) {
            String choice1 = sc.next();
            if (choice1.equalsIgnoreCase("Y")) {
                Main.main(null);
            } else if (choice1.equalsIgnoreCase("N")) {
                System.out.println("=============Thank you for using Bus Reservation System=============");
                System.exit(0);
            } else {
                System.out.println("==============================================");
                System.out.println("Invalid Input! Please try again.");
                System.out.println("==============================================\n");
            }
        }
    }
    // ==================End of Return to Main Menu method==================

    // ================Cancel Reservation method===========================
    public static boolean cancelReservation() {
        System.out.println("=============Cancel Reservation=============");
        System.out.println("Enter your email");
        String email = sc.next();
        for (int i = 0; i < seatReservation.queue.size(); i++) {
            if (seatReservation.queue.get(i).getEmail().equals(email)) {
                seatReservation.queue.remove(i);
                return true;
            }
        }
        return false;
    }
    // ================End of Cancel Reservation method====================
}
// ================End of Main class======================================