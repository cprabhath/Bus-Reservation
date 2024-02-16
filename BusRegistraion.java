import java.util.ArrayList;
import java.util.Scanner;

import Dto.Bus;

class BusRegistraion {
    ArrayList<Bus> buses = new ArrayList<Bus>();
    Scanner sc = new Scanner(System.in);
    private static BusRegistraion instance;

    private BusRegistraion() {
    }

    public static BusRegistraion getInstance() {
        if (instance == null) {
            instance = new BusRegistraion();
        }
        return instance;
    }

    // ================Register a Bus========================
    public void register() {
        try {
            System.out.println("=============Register a Bus=============");
            System.out.println("Enter Bus Number");
            int busNumber = sc.nextInt();
            System.out.println("Enter Total Seat");
            int totalSeat = sc.nextInt();
            System.out.println("Enter Starting Point");
            String startingPoint = sc.next();
            System.out.println("Enter Ending Point");
            String endingPoint = sc.next();
            System.out.println("Enter Starting Time");
            String startingTime = sc.next();
            System.out.println("Enter Fare");
            double fare = sc.nextDouble();

            // ===========Check if bus already registered==================
            if (buses.size() > 0) {
                for (Bus bus : buses) {
                    if (bus.getBusNumber() == busNumber) {
                        System.out.println("==============================================");
                        System.out.println("Bus already registered. Please enter another bus number\n");
                        System.out.println("==============================================");
                        register();
                        return;
                    }
                }
            }
            // ===========End of check if bus already registered==================

            // ===========Register bus==================
            Bus bus = new Bus();
            bus.setBusNumber(busNumber);
            bus.setTotalSeat(totalSeat);
            bus.setAvailableSeat(totalSeat);
            bus.setStartingPoint(startingPoint);
            bus.setEndingPoint(endingPoint);
            bus.setStartingTime(startingTime);
            bus.setFare(fare);
            buses.add(bus);
            // ===========End of register bus==================

            // ===========Return to main menu==================
            System.out.println("=======Bus Registered Successfully==========\n");
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
            // ===========End of return to main menu==================

            // ===========Catch invalid input==================
        } catch (Exception e) {
            System.out.println("===============================");
            System.out.println("Invalid Input");
            System.out.println(e);
            System.out.println("===============================");
        }
        // ===========End of catch invalid input==================
    }
    // ================End of Register a Bus=================

    // ================Show all Buses========================
    public void showBuses() {
        try {
            // ===========Show all buses=====================
            System.out.println("=============Buses=============");
            if (buses.size() > 0) {
                for (Bus bus : buses) {
                    System.out.println("Bus Number: " + bus.getBusNumber());
                    System.out.println("Total Seat: " + bus.getTotalSeat());
                    System.out.println("Available Seat: " + bus.getAvailableSeat());
                    System.out.println("Starting Point: " + bus.getStartingPoint());
                    System.out.println("Ending Point: " + bus.getEndingPoint());
                    System.out.println("Starting Time: " + bus.getStartingTime());
                    System.out.println("Fare: " + bus.getFare());
                    System.out.println("==================================");
                }
                // ===========End of show all buses==================

                // ===========No bus registered yet==================
            } else {
                System.out.println("==============================================");
                System.out.println("No bus registered yet");
                System.out.println("==============================================");
            }
            // ===========End of no bus registered yet============

            // ===========Return to main menu==================
            System.out.println("Do you want to return to Main Menu? (Y/N)");
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
            // ===========End of return to main menu==================

            // ===========Catch invalid input==================
        } catch (Exception e) {
            System.out.println("===============================");
            System.out.println("Invalid Input");
            System.out.println(e);
            System.out.println("===============================");
        }
        // ===========End of catch invalid input==================
    }
    // ================End of Show all Buses=================

    // ================Search Bus============================
    public void searchBus() {
        try {
            System.out.println("=============Search Bus=============");
            System.out.println("Enter Bus Number");
            int busNumber = sc.nextInt();
            if (buses.size() > 0) {
                // ===========Search bus==================
                for (Bus bus : buses) {
                    if (bus.getBusNumber() == busNumber) {
                        System.out.println("Bus Number: " + bus.getBusNumber());
                        System.out.println("Total Seat: " + bus.getTotalSeat());
                        System.out.println("Available Seat: " + bus.getAvailableSeat());
                        System.out.println("Starting Point: " + bus.getStartingPoint());
                        System.out.println("Ending Point: " + bus.getEndingPoint());
                        System.out.println("Starting Time: " + bus.getStartingTime());
                        System.out.println("Fare: " + bus.getFare());
                        System.out.println("==================================");
                        return;
                    } else {
                        System.out.println("==============================================");
                        System.out.println("Bus not found");
                        System.out.println("==============================================");
                    }
                }
            } else {
                // ===========No bus registered yet==================
                System.out.println("==============================================");
                System.out.println("No bus registered yet");
                System.out.println("==============================================\n");
                // ===========End of no bus registered yet==================
            }

            System.out.println("Do you want to return to Main Menu? (Y/N)");

            // ===========Return to main menu==================
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
            // ===========End of return to main menu==================

            // ===========Catch invalid input==================
        } catch (Exception e) {
            System.out.println("===============================");
            System.out.println("Invalid Input");
            System.out.println(e);
            System.out.println("===============================");
        }
        // ===========End of catch invalid input==================
    }
    // ================End of Search Bus====================
}
