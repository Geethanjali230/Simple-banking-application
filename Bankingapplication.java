import java.util.Scanner;
public class Bankingapplication {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          int balance=0;
          int withdraw=0;
          int deposit=0;
          int opt=0;
          while(opt!=4){
          System.out.println("welcome to the banking application");
          System.out.println("option 1: check your balance");
          System.out.println("option 2: deposit money");
          System.out.println("option 3: withdraw money");
          System.out.println("option 4: exit");
          System.out.println("enter a option:");
          opt=sc.nextInt();
          switch(opt){
            case 1:
            System.out.println("Your current balance is:"+" "+balance);
            break;
            case 2:
            System.out.println("enter the amount to be deposited");
            deposit=sc.nextInt();
            balance+=deposit;
            System.out.println("your amount is successfully deposited");
            break;
            case 3:
            System.out.println("enter the amount to withdraw");
            withdraw=sc.nextInt();
            if(withdraw>balance){
                System.out.println("Insufficient balance to withdraw money");
            }
            else{
            balance-=withdraw;
            System.out.println("your required amount is successfully withdrawed");
            System.out.println(" the available balance is"+" "+balance);
            }
            break;
            case 4:
            System.out.println("exit");
            break;
            default:
            System.out.println("invalid option");
            break;
          }}

    }
    
}
