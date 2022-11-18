import java.util.Scanner;
class Unique{
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a string:");
          String str=sc.nextLine();
         str=str.toLowerCase();
         int l=str.length();
         int n=0;
        for(int i=0;i<l-1;i++) {
            char ch=str.charAt(i);
            for(int j=i+1;j<l;j++) {
                    char ch1=str.charAt(j);
                    if(ch==ch1) {
                         n++;
                         break;
                     }
                 }
            }
     if(n>=1) {
            System.out.println("not unique");
        }
     else {
           System.out.println("unique");
      }
   }
}