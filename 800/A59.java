import java.util.*;
public class A59{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char ch;
        int su=0;
        int sl=0;
       // System.out.println((int)+'Z');
        for(int i=0;i<n;i++){
            ch=s.charAt(i);
            
            if((int) ch >=97){
                sl++;
            }
            else{
                su++;
            }


        }
        if(su>sl){
            System.out.print(s.toUpperCase());
        }
        else{
            System.out.println(s.toLowerCase());
        }

        sc.close();
    }
}