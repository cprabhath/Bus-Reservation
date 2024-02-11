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
            System.out.println("Enter 1 to Register another Bus");
            System.out.println("Enter 2 to return to Main Menu\n");
            while (true) {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        register();
                        break;
                    case 2:
                        Main.main(null);
                        break;

                    default:
                        break;
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
            // ===========Show all buses==================
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
            } else {
                System.out.println("==============================================");
                System.out.println("No bus registered yet");
                System.out.println("==============================================");
            }
            System.out.println("Enter 1 to return to Main Menu");
            while (true) {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        Main.main(null);
                        break;

                    default:
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("===============================");
            System.out.println("Invalid Input");
            System.out.println(e);
            System.out.println("===============================");
        }
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
                        System.out.println("Enter 1 to return to Main Menu");
                        while (true) {
                            int choice = sc.nextInt();
                            switch (choice) {
                                case 1:
                                    Main.main(null);
                                    break;

                                default:
                                    break;
                            }
                        }
                    }
                }
                // ===========End of search bus==================

                // ===========Bus not found==================
                System.out.println("==============================================");
                System.out.println("Bus not found");
                System.out.println("==============================================\n");
                System.out.println("Enter 1 to return to Main Menu");
                while (true) {
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            Main.main(null);
                            break;

                        default:
                            break;
                    }
                }
            } else {
                // ===========No bus registered yet==================
                System.out.println("==============================================");
                System.out.println("No bus registered yet");
                System.out.println("==============================================\n");
                System.out.println("Enter 1 to return to Main Menu");
                while (true) {
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            Main.main(null);
                            break;

                        default:
                            break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("===============================");
            System.out.println("Invalid Input");
            System.out.println(e);
            System.out.println("===============================");
        }
    }
    // ================End of Search Bus====================
}
