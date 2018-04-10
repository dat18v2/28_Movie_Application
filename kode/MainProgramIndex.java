import java.util.Scanner;
import java.util.Arrays;

public class MainProgramIndex{

   public static void main(String[] args){
      //vores objekter
      String[] names = {"Arne", "Bjarne", "Charlie", "Dora", "Else", "Finn"};
      //den bruger vi retter på nu
      int currentUser = 0;
      
      
      //menu
      int option;
      Scanner scan = new Scanner(System.in);
      
      //Opgave lav log ind/log ud
      //tilføj ekstra while loop uden om eksisterende
      //med menu, der har log ind og log out
      
      boolean keepRunning = true;
      
      while (keepRunning){
         //Udskriv menu
         System.out.println("Goddag " + names[currentUser]);
         System.out.println("0. Udskriv navne");
         System.out.println("1. Vælg bruger");
         System.out.println("2. Ændr navn");
         System.out.println("3. Afslut");
         //læs valg med antiJarl
         option = getInt("Vælg et tal (0 - 3)");
                  
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
               System.out.println("Vælg bruger");
               currentUser = getInt("Vælg hvilket nummer du er: ");
               break;
            case 2:
               System.out.println("Ændr navn");
               //int index = getInt("Vælg nummer: ");
               System.out.println("Navnet er nu: " + names[currentUser]);
               System.out.print("Angiv nyt navn: ");
               names[currentUser] = scan.next();
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
   
   public static int getInt(String prompt){
      Scanner scanInt = new Scanner(System.in);
      System.out.print(prompt);
      //antiJarl scanInt.hasNextInt()
      while (!scanInt.hasNextInt()){
         //smid det næste væk, når det ikke er en int
         scanInt.next();
         //vejled brugeren
         System.out.print(prompt);
      }
      
      return scanInt.nextInt();

   }

}