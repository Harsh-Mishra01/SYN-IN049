import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter the number :");
        int num = s.nextInt();
        boolean flag = true;

        for(int i=2; i<=num/2; i++)
        {
             if(num % i==0)
             {
                flag=false;
                break;
             }
        }
        if(flag)
        {
            System.out.println(num +" is a prime number");
        }else{
            System.out.println(num+" is not prime number");
        }

    }
    
}
