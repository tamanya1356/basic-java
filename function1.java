
import java.util.*;
public class function1 {
    // declare my function 
    public static void PrintMyName(String name){ // ekhane type arg er type- string ;arg name-name
        System.out.println(name);
        return; // return type void tai return na likhleo chole..int hole 1 to infinity numb return  
    }
    // main function 
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in); // input neoar jonno create korlam 
       String name=sc.nextLine();
        PrintMyName(name); // call my function 
    }
}
