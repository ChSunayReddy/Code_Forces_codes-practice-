import java.util.*;
public class Word_CF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int u=0;
        int l=0;
        for (int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))) u++;
            if(Character.isLowerCase(s.charAt(i))) l++;
        }
        if(u>l){
            System.out.println(s.toUpperCase());
        }
        else{
            System.out.println(s.toLowerCase());
        }
    }
}
