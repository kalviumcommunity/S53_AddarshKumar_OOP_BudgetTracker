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
    
    public void checkBudget(){
        if(this.spent>this.limit){
            System.out.println("Budget exceeded");
        }
        else{
            System.out.println("Budget for ...");
        }
    }
}
