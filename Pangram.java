import java.util.*;
class Pangram {
  public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string:");
       String str=sc.nextLine();
       str=str.replaceAll("","").toLowerCase();
       String s1="";
       for(char i='a';i<='z';i++) {
           if(str.indexOf(i)!=-1) {
               s1=s1+i;
            }
         }
       if(s1.length()==26) {
         System.out.println("Pangram");
       }
     else {
        System.out.println("not Pangram");
      }
}
}