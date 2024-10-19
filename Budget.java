public class Budget {
    public String category;
    public int limit;
    public int spent;

    public Budget(String category,int limit){
        this.category=category;
        this.limit=limit;
        this.spent=0;
    }

    public void setCategory(String category){
        this.category=category;
    }

    public  void setLimit(int limit){
        this.limit=limit;
    }

    public String getCategory(){
        return category;
    }

    public  int getLimit(){
        return limit;
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
            System.out.println("Budget for" +category+"is"+limit+" spent: "+spent);
        }
    }

    Budget(){

    }
}
