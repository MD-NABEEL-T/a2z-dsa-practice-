//  print from n -1 
public class Recursion3 {
    public static void f(int i,int n){
        if(i==0) return;
        else
        {
            System.out.println(i);
            i--;
            f(i,n);
        }
    }
    public static void main(String[] args) {
        int n=7;
        f(n,n);
    }
}
