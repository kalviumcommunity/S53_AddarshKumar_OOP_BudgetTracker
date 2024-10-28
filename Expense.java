public class Expense extends Transaction {
    public Expense(String date, int amount, String category) {
        super(date, amount, category);
    }

    // Implement the abstract method
    @Override
    public String getTransactionType() {
        return "Expense";
    }
}
