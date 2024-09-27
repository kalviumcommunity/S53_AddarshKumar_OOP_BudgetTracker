public class Transaction {
    String date;
    int amount;
    String category;

    static int totalTransactions=0;

    public Transaction(String date,int amount,String category){
        this.date=date;
        this.amount=amount;
        this.category=category;
        totalTransactions+=amount;
    }


    public String toString(){
        return date+" , "+category+" , "+ amount;
    }
}
