import java.lang.classfile.constantpool.IntegerEntry;

public class PrintDivisors {
    public static void method1(int n){
        for(int i=1;i<n+1;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void method2(int n){
        int sqrt=(n.sqrt());
        for(int i=1;i<sqrt;i++){
            if(n%i==0){
                if(n/i != i){
                    System.out.print(i);
                }
            }
        }
    }
    public static void main(String []args){
        int n=36;
        System.out.println("The divisors of "+n);
        method1(n);
        method2(n);
    }
}
