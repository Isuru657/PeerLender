package com.peerlender.lendingengine.application.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Duration;
import java.util.Objects;

@Entity
public class LoanRequest {

    @Id
    private long id;
    private final int amount;
    private final long borrowerId;
    private final int daystoRepay;
    private final double interestRatedouble;

    public LoanRequest(int amount, long borrowerId, int daystoRepay, double interestRatedouble) {
        this.amount = amount;
        this.borrowerId = borrowerId;
        this.daystoRepay = daystoRepay;
        this.interestRatedouble = interestRatedouble;
    }

    public int getAmount() {
        return amount;
    }

    public long getBorrowerId() {
        return borrowerId;
    }

    public int getDaystoRepay() {
        return daystoRepay;
    }

    public double getInterestRatedouble() {
        return interestRatedouble;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanRequest that = (LoanRequest) o;
        return amount == that.amount &&
                borrowerId == that.borrowerId &&
                daystoRepay == that.daystoRepay &&
                Double.compare(that.interestRatedouble, interestRatedouble) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, borrowerId, daystoRepay, interestRatedouble);
    }

    @Override
    public String toString() {
        return "LoanRequest{" +
                "amount=" + amount +
                ", borrowerId=" + borrowerId +
                ", daystoRepay=" + daystoRepay +
                ", interestRatedouble=" + interestRatedouble +
                '}';
    }
}