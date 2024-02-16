import java.util.ArrayList;

import Dto.Reservation;

class SeatReservation {
    ArrayList<Reservation> queue = new ArrayList<>();
    private static SeatReservation instance;
    private int front, rear;
    private int capacity = 52;

    private SeatReservation() {
        front = rear = 0;
    }

    public static SeatReservation getInstance() {
        if (instance == null) {
            instance = new SeatReservation();
        }
        return instance;
    }

    // ===========Check if queue is empty=========================
    public boolean isEmpty() {
        return front == rear;
    }
    // ===========End of check if queue is empty==================

    // ===========Check if queue is full==========================
    public boolean isFull() {
        return capacity == rear;
    }
    // ===========End of check if queue is full===================

    // ===========Enqueue reservation============================
    public void enqueue(Reservation reservation) {
        if (isFull()) {
            System.out.println("=====================================");
            System.out.println("Queue is full. No more reservation can be made");
            System.out.println("=====================================");
            return;
        }
        queue.add(reservation);
        rear++;
    }
    // ===========End of enqueue reservation======================

    // ===========Dequeue reservation=============================
    public void dequeue() {
        if (isEmpty() == true) {
            System.out.println("=====================================");
            System.out.println("Queue is empty. No reservation found");
            System.out.println("=====================================");
            return;
        } else {
            queue.remove(front);
            System.out.println("=====================================");
            System.out.println("Reservation cancelled successfully. Seat is now available for new reservation");
            System.out.println("=====================================");
            rear--;
        }
    }
    // ===========End of dequeue reservation=======================

    // ===========Display all reservations=========================
    public void display() {
        if (isEmpty() == true) {
            System.out.println("=====================================");
            System.out.println("Queue is Empty. No reservation found");
            System.out.println("=====================================");
            return;
        }
        System.out.println("=============All Reservations=============");
        for (int i = front; i < rear; i++) {
            System.out.println("=====================================");
            System.out.println(queue.get(i));
            System.out.println("=====================================");
        }
    }
    // ===========End of display all reservations==================

    // ===========Peek reservation=================================
    public Reservation peek() {
        if (isEmpty() == true) {
            System.out.println("=====================================");
            System.out.println("Queue is Empty. No reservation found");
            System.out.println("=====================================");
            return null;
        }
        return queue.get(front);
    }
    // ===========End of peek reservation==========================

    // ===========Change seat number==============================
    public void changeSeat() {
        // ===========Check if queue is empty=========================
        if (isEmpty() == true) {
            System.out.println("=====================================");
            System.out.println("Queue is Empty. No reservation found");
            System.out.println("=====================================");
            return;
        }
        // ===========End of check if queue is empty==================

        // ===========if not Change seat number==============================
        System.out.println("================Seat Change================");
        System.out.println("Enter your email");
        String email = Main.sc.next();
        for (int i = front; i < rear; i++) {
            if (queue.get(i).getEmail().equals(email)) {
                System.out.println("Enter your new seat number");
                int seat = Main.sc.nextInt();
                queue.get(i).setSeatNumbers(seat);
                System.out.println("=====================================");
                System.out.println("Seat changed successfully");
                System.out.println("=====================================");
                return;
            } else {
                System.out.println("=====================================");
                System.out.println("No reservation found with this email");
                System.out.println("=====================================");
            }
        }
        // ===========End of change seat number=======================
    }
    // ===========End of change seat number=======================
}
