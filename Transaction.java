public class Transaction {
    String date;
    int amount;
    String category;

    public Transaction(String date,int amount,String category){
        this.date=date;
        this.amount=amount;
        this.category=category;
    }

    public String toString(){
        return date+" , "+category+" , "+ amount;
    }
}
