public class pattern20{
    public static void main(String []args){
        int n=5;
        int stars;
        int spaces;

        for(int i=1;i<=2*n-1;i++){
            if(i<n) stars =i;
            else stars=2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            if(i<n) spaces=2*n-2*i;
            else spaces=2*i-2*n;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}