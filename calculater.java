import java.io.*;
import java.util.*;
public class calculater{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int choice;
do{
      System.out.println("Menu");
      System.out.println("1.Addition");
      System.out.println("2.Substraction");
      System.out.println("3.Multiplication");
      System.out.println("4.Division");
      System.out.println("5.Exit");
      System.out.println("Enter your choice");
     choice=sc.nextInt();
switch(choice){
              
case 1:
          System.out.println("Enter First number");
           double num1=sc.nextDouble();
          System.out.println("Enter Second number");
          double num2=sc.nextDouble();
           System.out.println("Result:"+(num1+num2));
          break;
case 2:
           System.out.println("Enter First number");
           num1=sc.nextDouble();
          System.out.println("Enter Second number");
          num2=sc.nextDouble();
           System.out.println("Result:"+(num1-num2));
          break;
case 3:
           System.out.println("Enter First number");
           num1=sc.nextDouble();
          System.out.println("Enter Second number");
         num2=sc.nextDouble();
           System.out.println("Result:"+(num1*num2));
          break;
case 4:
            System.out.println("Enter First number");
            num1=sc.nextDouble();
          System.out.println("Enter Second number");
          num2=sc.nextDouble();
           if(num2!=0){
           System.out.println("Result:"+(num1/num2));
           }
         else{
                 System.out.println("Error we can not divided by zero");
               }
       break;
case 5:
          System.out.println("Thank You");                                                                                                                                                                                                                                                                                                                                                                                                                                                
          break;
 default:
             System.out.println("Enter your valid choice");
            break;
}
}while(choice!=5);
}
}
                                                                                              