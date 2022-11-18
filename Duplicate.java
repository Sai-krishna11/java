import java.util.*;
class PrintDuplicate {
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a String:");
      String s=sc.next();
     char[] arr=s.toCharArray();
     for(int i=0;i<s.length();i++) {
         int count=1;
         for(int j=i+1;j<arr.length;j++) {
            if(arr[i]==arr[j]) {
                   count++;
                   arr[j]=0;
             }
         }
       if(count>1&&arr[i]!='0') {
          System.out.println(s.charAt(i)+"is repeated"+count+"times");
       }
    }
  }
}
