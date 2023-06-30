package netHack;

import java.util.Scanner;

public class NetHack02 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("행 숫자를 입력하세요 ");
      int L = sc.nextInt();
      //ROW 
      
      System.out.print("열 숫자를 입력하세요 ");
      int R = sc.nextInt();
      //column 
      
      char[][] hack = new char[L][R]; // 'N'

      for (int i = 0; i < hack.length; i++) {
         for (int j = 0; j < hack[i].length; j++) {
            if (i == 0 || j == 0 || i == hack.length - 1 || j == hack[i].length - 1) {
               hack[i][j] = '@';
            }

            else {
               hack[i][j] = ' ';
            }

         }
      }
      
      int LC = (int) (Math.random() * (L - 2)) + 1;
      
      int RC = (int) (Math.random() * (R - 2)) + 1;

      int ans = (int) (Math.random() * 4) + 1; //4변

      if (ans == 1) {
         hack[0][RC] = ' ';

      } else if (ans == 2) {
         hack[L - 1][RC] = ' ';
      } else if (ans == 3) {
         hack[LC][R - 1] = ' ';
      } else if (ans == 4) {
         hack[LC][0] = ' ';
      }

      for (int i = 0; i < hack.length; i++) {
         for (int j = 0; j < hack[i].length; j++) {
            System.out.print(hack[i][j] + " ");
         }
         System.out.println("");
      }

      sc.close();

   }
}
