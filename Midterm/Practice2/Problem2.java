import java.util.Scanner;

public class Problem2 {
  public static void main(String[] args) {
    GuessNumberGame gNC = new GuessNumberGame();

    gNC.setTargetNumber();

    // generate the random number and invite user to guess it
    gNC.displayPleaseGuessMessage();

    // continue until the user guesses the number
    while (gNC.guessNumber != gNC.targetNumber) {
      // get a valid int from user
      gNC.guessNumber = gNC.getIntWithinRange();

      // display result of guess to user
      if (gNC.checkCorrect()) {
        gNC.displayCorrectGuessMessage();
      } else {
        gNC.displayHint();
      }

      // check Counter value
      if (!gNC.checkCounter()) {
        gNC.displayOutMessage();
        break;
      }

      gNC.counter++;
    }
  }
}

class GuessNumberGame {
  /* define the fields
   * 
   * 
   * 
  */

  /* define the constructor
   * 
   * 
   * 
  */

  public void setTargetNumber() {
    // complete the code

  }

  public int getRandomNumber() {
    // complete the code

  }

  public int getIntWithinRange() {
    // complete the code


  }

  public boolean checkCounter() {
    return this.counter < this.COUNTER_LIMIT;
  }

  public boolean checkCorrect() {
    return (this.targetNumber == this.guessNumber);
  }

  public void displayPleaseGuessMessage() {
    System.out.println("I'm thinking of a number from " + this.MIN +" to " + this.MAX + ".");
    System.out.println("Try to guess it.");
    System.out.println();
  }

  public void displayCorrectGuessMessage() {
    System.out.println("BINGO! The answer was " + this.targetNumber);
  }

  public void displayOutMessage() {
    System.out.println("Game Over !! You failed more than " + this.counter + " times.");
  }

  public void displayHint() {
    if (this.guessNumber > this.targetNumber)
      System.out.println("DOWN");
    else
      System.out.println("UP");
  }
}