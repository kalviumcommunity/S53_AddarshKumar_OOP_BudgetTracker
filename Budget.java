public class Budget {
    public String category;
    public int limit;
    public int spent;

    public Budget(String category,int limit){
        this.category=category;
        this.limit=limit;
        this.spent=0;
    }

    public void addSpent(int amount){
        this.spent+=amount;
        System.out.println(spent);
    }
}
