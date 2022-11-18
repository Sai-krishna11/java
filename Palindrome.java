import java.util.*;
class Palindrome {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a string:");
   String s1=sc.next();
   String s2="";
   for(int i=s1.length()-1;i>=0;i--) {
      s2=s2+s1.charAt(i);
  }
  if(s1.equals(s2)) {
    System.out.println("String is palimdrome");
    }
  else {
    System.out.println("string is not palindrome");
     }
  }
 }

  