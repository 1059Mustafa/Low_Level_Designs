package Car_Rental_System;

public class Bill {
    Reservation reservation;
    double totalBillAmount;
    boolean isPaid;
    Bill(Reservation reservation)
    {
        this.reservation=reservation;
        this.totalBillAmount=computeBillAmount();
        isPaid=false;
    }
    public double computeBillAmount()
    {
        return 100.0;
    }
}
