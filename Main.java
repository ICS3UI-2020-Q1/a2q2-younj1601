import java.util.Scanner;
/**
 *This program determines the bigger of 2 intergers
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    //ask for one interger
    System.out.println("Please enter an integer:");
    //get the first interger
    int num1 = input.nextInt();
    
    //ask for next interger
    System.out.println("Please enter another integer:");
    //get the second interger
    int num2 = input.nextInt();

    if (num1 > num2){
      //bigger number is num1
      System.out.println("The biggest number is " + num1 + ".");
    } else if (num1 < num2){
      //bigger number is num2
      System.out.println("The biggest number is " + num2 + ".");
    } else{
      //same number
      System.out.println("There is no biggest number.");
    }
  }
}
