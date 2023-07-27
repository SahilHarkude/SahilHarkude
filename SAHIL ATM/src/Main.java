import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int balance=50000;
        int option,deposit,withdraw;
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO ATM ");
        System.out.println("1.CHECK ACCOUNT BALANCE");
        System.out.println("2.WITHDRAW");
        System.out.println("3.DEPOSIT");
        System.out.println("4.EXIT");
        System.out.print("SELECT AN OPTION:");
        option=sc.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("CURRENT BALANCE = "+balance);
                break;
            case 2:
                System.out.print("ENTER AMOUNT TO BE WITHDRAWN:");
                withdraw=sc.nextInt();
                if(withdraw>balance)
                {
                    System.out.println("INSUFFICIENT BANK BALANCE");
                }
                else
                {
                    System.out.println(withdraw+" "+"WITHDRAWN SUCCESSFULLY");
                    System.out.println("CURRENT BALANCE ="+(balance-withdraw));
                }
                break;
            case 3:
                System.out.println("ENTER AMOUNT TO BE DEPOSITED:");
                deposit=sc.nextInt();
                System.out.println(deposit+"DEPOSITED SUCCESSFULLY");
                System.out.println("CURRENT BALANCE ="+(balance+deposit));
                break;
            case 4:
                System.out.println("THANK YOU FOR USING THE ATM");
                break;
            default:
                System.out.println("ENTER OPTION BETWEEN 1-4");
                break;
        }
    }
}
