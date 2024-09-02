import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>(Arrays.asList(
            new User("Addarsh_123","12345a","Addarsh",19,"Software Engineer"),
            new User("Mukund_123","67623b","Mukund",30,"Python developer"),
            new User("Himanshu_123","138793c","Himanshu",12,"Data Analyst"),
            new User("Aditya_123","83298d","Aditya",60,"UI Researcher")
        ));
        User user1 = new User();

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter username ");
        String username=sc.nextLine();

        System.out.println("Enter Password");
        String password=sc.nextLine();

        System.out.println("Enter name");
        String name=sc.nextLine();

        System.out.println("Enter age");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your occupation");
        String occupation=sc.nextLine();
        System.out.println();

        sc.close();

        user1.setUserName(username);
        user1.setPassword(password);
        user1.setName(name);
        user1.setAge(age);
        user1.setOccupation(occupation);


        users.add(user1);

        for(int i=0;i<users.size();i++){
            System.out.println(users.get(i).getName());
        }

    }

}
