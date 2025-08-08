package expenses;

import java.util.List;
import java.util.stream.Collectors;

public class ExpenseDAO {
    private List<RecurringExpenses> recurringExpenses ;

    public ExpenseDAO(List<RecurringExpenses> recurringExpenses, List<RefundableExpenses> refundableExpense) {
        this.recurringExpenses = recurringExpenses;
        this.refundableExpense = refundableExpense;
    }


    public List<Double> notRefundedYet(List<RefundableExpense> refundableExpense){
        if(refundableExpense.refund = false ){
            return refundableExpense.stream()
                    .collect(Collectors.toList());

        }
    }

    public double sumOfRecurrentExpense(List<RecurringExpense> recurringExpenses){
        return recurringExpenses.stream()
                .reduce((previousExpense, actualExpense) -> previousExpense + actualExpense).toList();
    }

}
