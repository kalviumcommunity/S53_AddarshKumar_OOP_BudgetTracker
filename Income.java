public class Income extends Transaction {
    public Income(String date,int amount){
        super(date,amount,"Income");
    }

    @Override
    public  String getTransactionType(){
        return "Income";
    }
}
