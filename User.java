public class User {
    private String userName;
    private String password;

    public String name;
    public int age;
    public String occupation;

    public User(String userName,String password,String name,int age,String occupation){
        this.userName=userName;
        this.password=password;
        this.name=name;
        this.age=age;
        this.occupation=occupation;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public User(){
    }

}



