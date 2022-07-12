package model.entities;

public class BusinessAccount extends BankAccount {

    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, double initialDeposit, Double loanLimit) {
        super(number, holder, initialDeposit);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit){
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            //deposit(amount);
            balance += amount - 10.0;
        }
    }
}
