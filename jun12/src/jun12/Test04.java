package jun12;

public class Test04 {
   public static void main(String[] args) {
      int[] a = new int[8];
      int i = 0;
      int n = 10;

      while (i < 8) {     
         a[i++] = (n%2);  
         n /= 2;
      }

      for (i = 7; i >= 0; i--) {
         System.out.print(a[i]);
      }
      System.out.println("");
   }
}


//뒤에서부터 출력


