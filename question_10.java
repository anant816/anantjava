import java.util.Scanner;
public class question10 {
    public static  int fib(int n){
        if(n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no. whose Fibonacci series is to be displayed :");   
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(fib(i)+"\t");
        }
    }
}
