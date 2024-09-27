public class Transaction {
    String date;
    int amount;
    String category;

    static int totalTransactions=0;
    static int totalNumberOfTransactions=0;

    public Transaction(String date,int amount,String category){
        this.date=date;
        this.amount=amount;
        this.category=category;
        totalTransactions+=amount;
        totalNumberOfTransactions++;
    }

    public static void getTotalTransaction(){
        System.out.println(totalTransactions);
        System.out.println(totalNumberOfTransactions);
    }


    public String toString(){
        return date+" , "+category+" , "+ amount;
    }
}
