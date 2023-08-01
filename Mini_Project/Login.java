package Mini_Project;

import java.util.Scanner;

public class Login{

    public static void main(String[] args) {
        System.out.println("--------------------Password Phase-----------------------------");
        int a=123;
        System.out.println("Please Enter the Password");
        Scanner b = new Scanner(System.in);
        int c=b.nextInt();
        if(c==a){
            System.out.println("Welcome to the Restaurent");
            System.out.println("------------------------------------------------------------");
        }
        else{
            System.out.println(" Incorrect Pasword! Please Try Again");
        }
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Enter your id");
        String id=sc.nextLine();
        System.out.println("Your Name is :"+name);
        System.out.println("Your id is : "+id);

        System.out.println("---------------Your Order is Here----------------------------");
        
        System.out.println("Your Fast_Food Order ==>");
        String fastFood=sc.nextLine();
        System.out.println("Your Spicy_Food Order ==>");
        String Spicy_food=sc.nextLine();
        System.out.println("Your Cold_Drink Order ==>");
        String Cold_Drink=sc.nextLine();
        //System.out.println("Your Order Total Bill_Pay is ==>");
        int Total=sc.nextInt();

        System.out.println("Press Choice Number");
        int ch=sc.nextInt();
        if(ch==1){
            System.out.println("Your Fast Food is :"+fastFood+" And Your Total is :"+Total);
            }   
        else if(ch==2 ){
            System.out.println("Your Spicy_Food is : "+Spicy_food+"And Your Total is"+Total);
        }
        else if(ch==3){
            System.out.println("Your Drink is : "+Cold_Drink+"And Your Total is"+Total);
        }
        else{
            System.out.println("Oops");
            
        }
    }
}