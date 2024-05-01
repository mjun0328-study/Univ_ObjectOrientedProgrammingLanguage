import java.util.Scanner;

class HangMan {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    char anotherGame='y';


    while(anotherGame =='y'){
      int numberOfCorrectLettersGuessed = 0, numberOfMisses = 0;

      System.out.print("Enter the word : ");
      String hiddenWord = input.nextLine();

      boolean[] isCorrect = new boolean[hiddenWord.length()];

      while (numberOfCorrectLettersGuessed < hiddenWord.length()) {
        System.out.print("(Guess) Enter a letter in word ");
        for(int i=0; i<hiddenWord.length(); i++) {
          if(isCorrect[i]) {
            System.out.print(hiddenWord.charAt(i));
          }else {
            System.out.print("*");
          }
        }
        System.out.print(" > ");
        char answer = input.nextLine().charAt(0);

        boolean isHas = false;
        for(int i=0; i<hiddenWord.length(); i++) {
          if(hiddenWord.charAt(i) == answer) {
            isHas = true;
            if(isCorrect[i]) {
              System.out.print("   " + answer + " is already in the word\r\n");
              break;
            }else {
              isCorrect[i] = true;
              numberOfCorrectLettersGuessed++;
            }
          }
        }

        if(!isHas) {
          System.out.print("   " + answer + " is not in the word\r\n");
          numberOfMisses++;
        }
      }
      
      System.out.print("The word is " + hiddenWord + ". You missed "
          + numberOfMisses + ((numberOfMisses <= 1) ? " time" : " times") + "\r\n");

      System.out.print("Do you want to guess for another word? Enter y or n > ");
      anotherGame = input.nextLine().charAt(0);
    } 
  }
}