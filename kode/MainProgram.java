import java.util.Scanner;
import java.util.Arrays;

public class MainProgram{

   public static void main(String[] args){
      //vores objekter
      String[] names = {"Arne", "Bjarne", "Charlie", "Dora", "Else", "Finn"};
      
      //menu
      int option;
      Scanner scan = new Scanner(System.in);
      boolean keepRunning = true;
      
      while (keepRunning){
         //Udskriv menu
         System.out.println("0. Udskriv navne");
         System.out.println("1. Vælg bruger");
         System.out.println("2. Ændr navn");
         System.out.println("3. Afslut");
         //læs valg
         System.out.print("Tag lige og vælg et eller andet: ");
         //antiJarl scan.hasNextInt()
         while (!scan.hasNextInt()){
            //smid det næste væk, når det ikke er en int
            scan.next();
            //vejled brugeren
            System.out.print("Det skal være et tal (1 - 3): ");
         }
         
         option = scan.nextInt();
                  
         //branch ud efter brugerens valg
         /* med if, else if, else
         if (option==1){
            System.out.println("Du valgte: " + option);
         }
         else if (option==2){
            System.out.println("Du valgte: " + option);         
         }
         else{
            System.out.println("Farveller!");
            keepRunning = false;
         }
         */
         //med switch, case, default
         switch (option){
            case 0:
               System.out.println("Udskriv navne");
               System.out.println(names);
               System.out.println(Arrays.toString(names));
               break;
            case 1:
               System.out.println("Du valgte 1!");
               break;
            case 2:
               System.out.println("Du valgte 2!");
               break;
            case 3:
               //exit
               System.out.println("Farvel!");
               keepRunning = false;
               break;               
            default:
               //alle andre muligheder
               System.out.println("Der er kun muligheder for at taste 0 - 3");
         }
      }
   
   }

}