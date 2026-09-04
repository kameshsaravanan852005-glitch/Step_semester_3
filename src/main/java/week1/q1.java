// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Random;
import java.util.Scanner;

public class q1 {
   public q1() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();
      String[] var3 = new String[]{"Rock", "Paper", "Scissors"};
      System.out.print("Enter your choice (Rock/Paper/Scissors): ");
      String var4 = var1.nextLine();
      int var5 = var2.nextInt(3);
      String var6 = var3[var5];
      System.out.println("Computer chose: " + var6);
      if (var4.equalsIgnoreCase(var6)) {
         System.out.println("It's a Tie!");
      } else if ((!var4.equalsIgnoreCase("Rock") || !var6.equals("Scissors")) && (!var4.equalsIgnoreCase("Paper") || !var6.equals("Rock")) && (!var4.equalsIgnoreCase("Scissors") || !var6.equals("Paper"))) {
         if (!var4.equalsIgnoreCase("Rock") && !var4.equalsIgnoreCase("Paper") && !var4.equalsIgnoreCase("Scissors")) {
            System.out.println("Invalid choice!");
         } else {
            System.out.println("Computer wins!");
         }
      } else {
         System.out.println("Player wins!");
      }

      var1.close();
   }
}
