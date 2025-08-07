package expenses;

import java.time.LocalDate;

public class Expenses {
        private String label;
        private double amount;
        private LocalDate date;

        public Expenses(double amount, LocalDate date, String label) {
            this.amount = amount;
            this.date = date;
            this.label = label;
        }

        public double getAmount() {
            return amount;
        }
        public LocalDate getDate() {
            return date;
        }
        public String getLabel() {
            return label;
        }


        public boolean isLargeExpense() {
            return amount > 100;
        }

        @Override
        public String toString() {
            return "Label: "+label +" ,Montant: "+amount +" Date: "+date;
        }


}