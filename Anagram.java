import java.util.*;
class Anagram {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter string1:");
      String s1=sc.nextLine();
      System.out.println("enter string2:");
      String s2=sc.nextLine();
      s1.toLowerCase();
      s2.toLowerCase();
      char[] ch1=s1.toCharArray();
      char[] ch2=s2.toCharArray();
      Arrays.sort(ch1);
      Arrays.sort(ch2);
      if(Arrays.equals(ch1,ch2)) {
          System.out.println("String is Anagram");
        }
      else
       System.out.println("Not an Anagram");
   }
}


      