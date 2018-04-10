import java.util.Scanner;

public class MainProgram{

   public static void main(String[] args){
      //menu
      int option;
      Scanner scan = new Scanner(System.in);
      boolean keepRunning = true;
      
      while (keepRunning){
         //læs valg
         System.out.print("Tag lige og vælg et eller andet: ");
         option = scan.nextInt();
         
         
         //branch ud efter brugerens valg
         if (option==1){
            System.out.println("Du valgte: " + option);
         
         }
         else if (option==2){
            System.out.println("Du valgte: " + option);
         
         }
         else{
            System.out.println("Farveller!");
            keepRunning = false;// // 
         }
      }
   
   }

}