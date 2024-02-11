package Dto;

public class Bus {
    // ======================Attributes=========================
    int BusNumber;
    int TotalSeat;
    int AvailableSeat;
    String startingPoint;
    String endingPoint;
    String StartingTime;
    Double Fare;
    // ======================End of Attributes==================

    //=========================No-argument Constructor=========================
    public Bus() {
    }
    //=========================End of No-argument Constructor==================

    //========================== Initialize Bus object==========================
    public Bus(int BusNumber, int TotalSeat, int AvailableSeat, String startingPoint, String endingPoint, String StartingTime, Double Fare) {
        this.BusNumber = BusNumber;
        this.TotalSeat = TotalSeat;
        this.AvailableSeat = AvailableSeat;
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
        this.StartingTime = StartingTime;
        this.Fare = Fare;
    }
    //==========================End of Initialize Bus object=======================

    // =========================Getter methods=========================
    public int getBusNumber() {
        return BusNumber;
    }

    public int getTotalSeat() {
        return TotalSeat;
    }

    public int getAvailableSeat() {
        return AvailableSeat;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public String getEndingPoint() {
        return endingPoint;
    }

    public String getStartingTime() {
        return StartingTime;
    }

    public Double getFare() {
        return Fare;
    }
    // =========================End of Getter methods==================

    // =========================Setter methods=========================
    public void setBusNumber(int BusNumber) {
        this.BusNumber = BusNumber;
    }

    public void setTotalSeat(int TotalSeat) {
        this.TotalSeat = TotalSeat;
    }

    public void setAvailableSeat(int AvailableSeat) {
        this.AvailableSeat = AvailableSeat;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public void setEndingPoint(String endingPoint) {
        this.endingPoint = endingPoint;
    }

    public void setStartingTime(String StartingTime) {
        this.StartingTime = StartingTime;
    }

    public void setFare(Double Fare) {
        this.Fare = Fare;
    }
    // =========================End of Setter methods==================


    //=========================toString=========================
    @Override
    public String toString() {
        return "Bus Number: " + BusNumber + "\n" + "Total Seat: " + TotalSeat + "\n" + "Available Seat: "
                + AvailableSeat
                + "\n" + "Starting Point: " + startingPoint + "\n" + "Ending Point: " + endingPoint + "\n"
                + "Starting Time: "
                + StartingTime
                + "\n" + "Fare: " + Fare + "";
    }
    //=========================End of toString==================
}
