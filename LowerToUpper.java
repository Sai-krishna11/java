import java.util.Scanner;
class LowerToUpper {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a lower case string ");
    String s1=sc.next();
    String s2="";
   for(int i=0;i<s1.length();i++) {
          s2=s2+(char)(s1.charAt(i)-32);
   }
 System.out.println("lower case string : "+s1);
System.out.println("Upper case string : "+s2);
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter an upper case string:");
 String ss1=scan.next();
    String ss2="";
   for(int i=0;i<ss1.length();i++) {
          ss2=ss2+(char)(ss1.charAt(i)+32);
   }
 System.out.println("Upper case string : "+ss1);
System.out.println("Lower case string : "+ss2);
Scanner sn=new Scanner(System.in);
System.out.println("Enter a to be converted : ");
String st1=sn.next();
String st2="";
for(int i=0;i<st1.length();i++) {
 if(st1.charAt(i)>='a'&&st1.charAt(i)<='z') {
     st2=st2+(char)(st1.charAt(i)-32);
   }
else  {
    st2=st2+(char)(st1.charAt(i)+32);
}
}
System.out.println("Entered String:"+st1);
System.out.println("Converted String:"+st2);
}
}