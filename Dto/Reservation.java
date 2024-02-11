package Dto;

public class Reservation {
    // ======================Attributes=========================
    String email;
    int busNumber;
    int seatNumbers;
    // ======================End of Attributes==================

    // ==========================No-argument Constructor=========================
    public Reservation() {
    }
    // ==========================End of No-argument Constructor==================

    // =========================== Initialize Reservation object==========================
    public Reservation(String email, int busNumber, int seatNumbers) {
        this.email = email;
        this.busNumber = busNumber;
        this.seatNumbers = seatNumbers;
    }
    // ===========================End of Initialize Reservation object=======================

    // =========================Getter methods=========================
    public String getEmail() {
        return email;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public int getSeatNumbers() {
        return seatNumbers;
    }
    // =========================End of Getter methods==================

    // =========================Setter methods=========================
    public void setEmail(String email) {
        this.email = email;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public void setSeatNumbers(int seatNumbers) {
        this.seatNumbers = seatNumbers;
    }
    // =========================End of Setter methods==================

    // =========================toString=========================
    @Override
    public String toString() {
        return "Reservation" + "\nEmail=" + email + "\nBusNumber=" + busNumber + "\nSeatNumbers=" + seatNumbers ;
    }
    // =========================End of toString==================
}
