package expenses;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ExpenseTest {
    @Test
    void Large_expense_is_true(){
        Expenses one = new Expenses(200, LocalDate.now(),"food");
        assertTrue(one.isLargeExpense());
    }

    @Test
    void Large_expense_is_false(){
        Expenses two = new Expenses(50, LocalDate.now(),"food");
        assertFalse(two.isLargeExpense());
    }

    @Test
    public void toStringTest(){
        Expenses test = new Expenses(150, LocalDate.now(),"food");
        equals("Label: food ,Montant: 150 Date: 2025-07-07");
    }
}