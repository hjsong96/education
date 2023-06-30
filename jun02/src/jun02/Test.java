package jun02;

public class Test {
   public static void main(String[] args) {
      
      int num9 = 1;
      int num10 = num9--;
      //        9     10
      int num11 = num9-- + --num9;
      //        9     10 3  2
      System.out.println(num9);//-2
      System.out.println(num10);//1
      System.out.println(num11);//2

      
   }
}