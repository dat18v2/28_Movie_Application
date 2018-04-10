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
         //antiJarl scan.hasNextInt()
         /*flyttet til getInt()
         System.out.print("Tag lige og vælg et eller andet: ");
         while (!scan.hasNextInt()){
            //smid det næste væk, når det ikke er en int
            scan.next();
            //vejled brugeren
            System.out.print("Det skal være et tal (1 - 3): ");
         }*/
         
         option = getInt();
                  
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
               System.out.println(Arrays.toString(names));
               for (int i=0;i<names.length;i++){
                  System.out.println("Navn[" + i + "]: "+ names[i]);
               }
               break;
            case 1:
               System.out.println("Vælge bruger");
               break;
            case 2:
               System.out.println("Ændr navn");
               int index = getInt();
               System.out.println("Navnet er nu: " + names[index]);
               System.out.print("Angiv nyt navn: ");
               names[index] = scan.next();
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
   
   public static int getInt(){
      Scanner scanInt = new Scanner(System.in);
      System.out.print("Vælg et tal: ");
      //antiJarl scanInt.hasNextInt()
      while (!scanInt.hasNextInt()){
         //smid det næste væk, når det ikke er en int
         scanInt.next();
         //vejled brugeren
         System.out.print("Det skal være et tal (0 - 3): ");
      }
      
      return scanInt.nextInt();

   }

}