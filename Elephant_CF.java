import java.util.*;
class Elephant_CF{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=5) System.out.println(1);
        else{
            if(n%5==0) System.out.println(n/5);
            else System.out.println((n/5)+1);
        }
    }
}