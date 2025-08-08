package expenses;

import java.util.List;

public class ExpenseDAO {
    List<Expenses> expenses;

    public ExpenseDAO(List<Expenses> expenses) {
        this.expenses = expenses;
    }

    public List<RefundableExpenses> getRefundableExpenses() {
        return expenses.stream()
                .filter(exp -> exp instanceof RefundableExpenses)
                .map(exp -> (RefundableExpenses)exp)
                .filter(exp -> !exp.isRefunded())
                .toList();
    }

    public double totalRecurringExpense(){
        return expenses.stream()
                .filter(exp -> exp instanceof  RecurringExpenses)
                .mapToDouble(Expenses::getAmount)
                .sum();
    }

    public List<String> listLabel(){
        return  expenses.stream()
                .filter(exp -> exp.getAmount() > 100)
                .map(Expenses::getLabel)
                .toList();
    }


    public double totalAmount(){
        return expenses.stream()
                .mapToDouble(Expenses::getAmount)
                .sum();
    }
}

