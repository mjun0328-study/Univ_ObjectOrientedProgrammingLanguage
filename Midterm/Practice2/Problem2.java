import java.util.Scanner;
import java.util.Random;

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
  public int targetNumber;
  public int guessNumber;
  public int counter;
  private final Scanner scanner = new Scanner(System.in);
  private final int COUNTER_LIMIT = 9;
  private final int MIN = 0;
  private final int MAX = 50;

  GuessNumberGame() {
    this.counter = 0;
  }
  
  public void setTargetNumber() {
    this.targetNumber = getRandomNumber();
  }

  public int getRandomNumber() {
    Random random = new Random();
    return random.nextInt(this.MAX - this.MIN + 1) + this.MIN;
  }

  public int getIntWithinRange() {
    System.out.print("[Trial " + (this.counter + 1) + "] Guess the Number: ");
    int input = scanner.nextInt();
    if(input < this.MIN)
      System.out.println("Error! Number must be greater than equal to " + this.MIN);
    else if(input > this.MAX)
      System.out.println("Error! Number must be less than equal to " + this.MAX);
    else return input;

    return this.getIntWithinRange();
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