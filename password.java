import java.util.Scanner;
public class password {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int password=sc.nextInt();
    int Mobile=sc.nextInt();
    System.out.println("Enter you name");
    String n=sc.next();

    System.out.println("Enter your Father name");
    String f=sc.next();
    
    System.out.println("Enter age");
    int a=sc.nextInt();

    System.out.println("Enter city");
    int c=sc.nextInt();

    if(password==123456)
     {
      if(Mobile==7974){
         System.out.println("You are eligible for submmit more Information here ");
      }
      else{
        System.out.println("Not eligible");
      }
         System.out.println();
        }
    }
    
}
