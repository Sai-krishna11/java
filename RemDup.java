import java.util.*;
class RemDup {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++) {
           char ch=s.charAt(i);
           int idx=s.indexOf(ch,i+1);
            if(idx==-1) {
               sb.append(ch);
             }
         }
      System.out.println("String after removing duplicates is : "+sb);
    }
}
 
 