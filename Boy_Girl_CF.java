import java.util.*;
class Boy_Girl_CF{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        HashSet<String> s=new HashSet<>(Arrays.asList(a.split("")));
        if(s.size()%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
