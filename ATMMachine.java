/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

class ATM{
    float Balance;
    int PIN=5674;
    public void checkpin() {
        System.out.println("ENTER YOUR PIN : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("ENTERED PIN IS INVALID");
            
        }
    }
        public void menu(){
            System.out.println("ENTER YOUR CHOICE : ");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit ");
            Scanner sc=new Scanner(System.in);
            int opt=sc.nextInt();
            if(opt==1){
                checkBalance();
            }
            else if(opt==2){
                withdraw();
            }
            else if(opt==3){
                deposit();
            }
            else if(opt==4){
                System.out.println("TeRmInAtEd");
                
            }
            else{
                System.out.println("Enter Valid Choice");
            }


        }
        public void checkBalance(){
            System.out.println("Balance"+Balance);
            menu();
        }
        public void withdraw(){
            System.out.println("Enter the amount to withdraw : ");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextFloat();
            if(amount>Balance){
                System.out.println("Insufficient Balance");
            }
            else{
                Balance=Balance-amount;
                System.out.println("MONEY withdraw successfully");

            }
            menu();
        }
        public void deposit(){
            System.out.println("Enter The Amount : ");
            Scanner sc=new Scanner(System.in);
            float amount =sc.nextFloat();
            Balance=Balance+amount;
            System.out.println("Money Deposited SUccessfully");
            menu();
        }

}
public class ATMMachine{
    public static void main(String[] args){
        ATM obj=new ATM();
        obj.checkpin();


    }
}
