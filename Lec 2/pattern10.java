public class pattern10{
    public static void main(String []args){
        int n=5;
        for(int i=0;i<2*n-1;i++){
            int stars = i;
            if (stars<n) stars= 2*n-i;
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
        }
    }
}