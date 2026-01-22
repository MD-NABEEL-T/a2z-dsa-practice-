import java.util.*;
public class CountDigits {
    public static void myMethod(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number bhai");
        Integer n=sc.nextInt();
        String s=n.toString();
        System.out.println(s.length());
        sc.close();
    }
    public static void main(String []args){
        myMethod();
    }
}
