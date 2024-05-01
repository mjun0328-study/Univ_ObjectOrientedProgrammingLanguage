import java.util.Scanner;

class HangMan {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    char anotherGame='y';


    while(anotherGame =='y'){
      int numberOfCorrectLettersGuessed = 0, numberOfMisses = 0;

      System.out.print("Enter the word : ");
      String hiddenWord =__________;

      /*
       * HangMan game settings
       */

      while (__________) {

        /*
         * hangman game
         */

        }
      }

      System.out.print("The word is " + hiddenWord + ". You missed "
          + numberOfMisses + ((numberOfMisses <= 1) ? " time" : " times") + "\r\n");

      System.out.print("Do you want to guess for another word? Enter y or n >");
      anotherGame = input.nextLine().charAt(0);

    } 
  }
}