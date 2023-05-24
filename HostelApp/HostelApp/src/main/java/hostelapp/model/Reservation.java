package hostelapp.model;

public class Reservation {
    private Data reservationDate;
    private Data checkinDate;
    private Data checkoutDate;

    public Reservation(){}
    public Reservation(Data checkinDate, Data checkoutDate){
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public Data getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Data reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Data getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Data checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Data getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Data checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
}
