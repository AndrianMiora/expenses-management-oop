package expenses;

import java.time.LocalDate;

public class RefundableExpenses extends Expenses {
    private boolean refunded;

    public RefundableExpenses(String label, double amount, LocalDate date, boolean refunded) {
        super(amount, date, label);
        this.refunded = refunded;
    }

    public boolean getRefunded(){
        return refunded;
    }

    public void refund(boolean refunded){
        if(this.getRefunded()){
            this.refunded = true;
        }
    }
}
