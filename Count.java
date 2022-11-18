import java.util.*;
class Count {
  public static void main(String[] args) {
     String str;
     int vowels=0,cons=0,spch=0,spaces=0,num=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a String:");
     str=sc.nextLine();
     str=str.toLowerCase();
     char ch;
     for(int i=0;i<str.length();i++)  {
         ch=str.charAt(i);
         if(ch>='a'&&ch<='z') {
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            vowels++;
          else
            cons++;
          }
         else if(ch>='0' && ch<='9') {
           num++;
        }
        else if(ch==' ') {
            spaces++;
         }
        else {
          spch++;
        }
   }
       System.out.println("vowels="+vowels);
       System.out.println("consonants="+cons);
       System.out.println("numbers="+num);
       System.out.println("spaces = "+spaces);
       System.out.println("special characters="+spch);
    }
}