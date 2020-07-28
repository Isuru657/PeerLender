package com.peerlender.lendingengine.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.Duration;
import java.util.Objects;

@Entity
public class LoanApplication {

    @Id
    private long id;
    private final int amount;
    @ManyToOne
    private final User borrower;
    private final Duration repaymentTerm;
    private final double interestRatedouble;

    public LoanApplication(int amount, User borrower, Duration repaymentTerm, double interestRatedouble) {
        this.amount = amount;
        this.borrower = borrower;
        this.repaymentTerm = repaymentTerm;
        this.interestRatedouble = interestRatedouble;
    }

    public int getAmount() {
        return amount;
    }

    public User getBorrower() {
        return borrower;
    }

    public Duration getRepaymentTerm() {
        return repaymentTerm;
    }

    public double getInterestRatedouble() {
        return interestRatedouble;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanApplication that = (LoanApplication) o;
        return amount == that.amount &&
                Double.compare(that.interestRatedouble, interestRatedouble) == 0 &&
                Objects.equals(borrower, that.borrower) &&
                Objects.equals(repaymentTerm, that.repaymentTerm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, borrower, repaymentTerm, interestRatedouble);
    }

    @Override
    public String toString() {
        return "LoanRequest{" +
                "amount=" + amount +
                ", borrower=" + borrower +
                ", repaymentTerm=" + repaymentTerm +
                ", interestRatedouble=" + interestRatedouble +
                '}';
    }
}

//Loan amount
//Error documentation
//Loan amount is declared final so it requires an amount initialized
//Persistence and Id helps create an id for loan requests so that you can track ids of loan requests
