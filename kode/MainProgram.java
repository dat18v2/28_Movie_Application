import java.util.Scanner;

public class MainProgram{

   public static void main(String[] args){
      //menu
      int option;
      Scanner scan = new Scanner(System.in);
      
      //læs valg
      System.out.print("Tag lige og vælg et eller andet: ");
      option = scan.nextInt();
      
      System.out.println("Du valgte: " + option);
   
   }

}