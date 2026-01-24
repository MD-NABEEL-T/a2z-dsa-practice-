public class ReverseNum {
    public static void main(String []args){
        int n=9230;
        int revNum=0,lastDigit=0;
        while(n>0){
            lastDigit=n%10;
            n=n/10;
            revNum=(revNum*10)+lastDigit;
        }
        System.out.println(revNum);
    }
}
