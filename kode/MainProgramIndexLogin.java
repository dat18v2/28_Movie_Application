import java.util.Scanner;
import java.util.Arrays;

public class MainProgramIndexLogin{

   public static void main(String[] args){
      //vores objekter
      String[] names = {"Arne", "Bjarne", "Charlie", "Dora", "Else", "Finn"};
      //den bruger vi retter på nu
      int currentUser = 0;
      
      Scanner scan = new Scanner(System.in);
      
      //Opgave lav log ind/log ud
      //tilføj ekstra while loop uden om eksisterende
      //med menu, der har log ind og log out

      boolean loginLoop = true;
      int optionLogin;
      while (loginLoop){
         //login or exit
         System.out.println("0. Login");
         System.out.println("1. Afslut");
         optionLogin = getInt("Vælg menupunkt: ");
         
         if (optionLogin==0){
            //login
            System.out.println("Login");
            currentUser = getInt("Vælg bruger: ");
            
            //menu for bruger når logget ind
            boolean keepRunning = true;
            int option;
            while (keepRunning){
               //Udskriv menu
               System.out.println("Goddag " + names[currentUser]);
               System.out.println("0. Udskriv navne");
               System.out.println("1. Ændr navn");
               System.out.println("2. Log ud");
               //læs valg med antiJarl
               option = getInt("Vælg et tal (0 - 2): ");
                        
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
                     System.out.println("Ændr navn");
                     //int index = getInt("Vælg nummer: ");
                     System.out.println("Navnet er nu: " + names[currentUser]);
                     System.out.print("Angiv nyt navn: ");
                     names[currentUser] = scan.next();
                     break;
                  case 2:
                     //log ud
                     System.out.println("Du bliver nu logget ud!");
                     keepRunning = false;
                     break;               
                  default:
                     //alle andre muligheder
                     System.out.println("Der er kun muligheder for at taste 0 - 2");
               } // main menu switch
            } // while keepRunning
         }   
         else if (optionLogin==1){
            System.out.println("Farvel!");
            loginLoop=false;
         }
         else{
            System.out.println("Det er kun muligt at taste 0 eller 1");
         } //no action
           
      } // while loginLoop
   } //main
   
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