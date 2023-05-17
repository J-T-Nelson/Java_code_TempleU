import java.util.*;

public class Tjena {
//
  public static final String[] MOVE_SET = {"lillasjon", "insvep", "tjena", "dromsack", "nordli"};
  public static final Scanner IN = new Scanner(System.in);
  public static final Random COMP_MOVE = new Random();

  public static void main(String[] args) {
    gameStart();
  }

  public static void gameStart(){
    int pWins = 0;
    int cWins = 0;
    int roundsCount = 0;
    /*want Play asks the player if they want to play, and exits the program if they answer no (n).*/
    wantPlay();
    //printInstructions does exactly what it says.
    printInstructions();
    //gameRound starts the game and updates the roundsCount variable, it continues by prompting the player for valid input by the method playerMove(),
    //then randomly selects the computers input, then determines the winner while printing and tracking the results,
    //finally it calls the relpay() method which asks if the player wants to play again or not, if the player does
    //want to play another round the gameRound() method is called again, this cycle repeats between gameRound() and replay()
    //until the player decides to stop playing at the end of a round, in which case the amount of rounds and wins for player and computer are printed.
    gameRound(pWins, cWins, roundsCount);
  }

  public static void wantPlay(){
    System.out.println("During these cold winters there really isnt much to do...");
    System.out.println("Would you like to play a game? [y or n]");

    String play = IN.next().toLowerCase();

    while (!(play.equals("y")) && !(play.equals("n"))) {
      System.out.println("I don't understand what you mean... do you want to play, or not? [y or n]");
      play = IN.next().toLowerCase();

    }
    if (play.equals("n")){
        System.out.println("Well alright, you can always come back to play later.");
        System.exit(0); //this SHOULD just terminate the program all together... not 100% sure if I need an argumetn in it or not rn though (Fiore seemed to think I did)
    }
  }

  public static void printInstructions(){
    System.out.println("Let me explain the rules for you...");
    System.out.println("Tjena is a bit like rock paper scissors, except there are five moves instead of three.");
    System.out.println("Each of the five move beats two others.");
    System.out.println("The five moves are: 1. Lillasjon, 2. Insvep, 3. Tjena, 4. Dromsack, 5. Nordli.");
    System.out.println("Lillasjon beats Insvep and Dromsack,");
    System.out.println("Insvep beats Tjena and Nordli,");
    System.out.println("Tjena beats Lillasjon and Dromsack,");
    System.out.println("Dromsack Beats Nordli and Insvep,");
    System.out.println("Nordli beats Lillasjon and Tjena!");
  }

  public static void gameRound(int p, int c, int r){
    int pWins = p;
    int cWins = c;
    int roundsCount = r;
    roundsCount += 1;

    String Pmove = playerMove(); //(when returning from my other method.. do I need to store the return? if so, can I store it in a variable with the same name?)
    System.out.println("You chose: " + Pmove);

    String cMove = MOVE_SET[COMP_MOVE.nextInt(MOVE_SET.length)];
    System.out.println("Computer chose: " + cMove); //occassionally the program bugs out and freezes after this line...
    //which is odd. maybe the whoWins code is breaking somehow? (need better tools to debug this one)

    if(whoWins(cMove, Pmove)){
      System.out.println("Computer wins, you pathetic fool.");
      cWins += 1;
    } else {
        System.out.println("You win... you will pay with your life for the disgrace you have brought to Computers family!");
        pWins += 1;
      }
    replay(pWins, cWins, roundsCount);
    }

  public static boolean whoWins(String c, String p){
    /*returns true if computer wins;
     the trick to using numbers for evaluating the winner is that
     in the original order of the list given, each choice x, beats 2 other choices, x+1 and x+3.
     so choice 0 beats 1 and 3, choice 2 beats 3 and 0.... the challenge here is that we need to have
     a cyclical range for this type of evaluation to work which I achieved with a while loops and some if statements.*/

    //C and P are the index correlates from the array MOVE_SET to our player and computer choices; i.e. conversion of move choice to numeric representation.
    int C = Arrays.binarySearch(MOVE_SET, c);
    int P = Arrays.binarySearch(MOVE_SET, p);

    int C1 = C+1, C3 = C+3;

    if (C1 > 4 || C3 > 4) {
      if (C1 == 5){ C1 = 0;}
      if (C3 == 5){ C3 = 0;}
      if (C3 == 6){ C3 = 1;}
      if (C3 == 7){ C3 = 2;}
    }
    if (C == P || C+1 == P || C+3 == P) {
      return true;
    }
    return false;
  }

  public static String playerMove(){
    System.out.println("Your move: Tjena, Insvep, Lillasjon, Nordli, or Dromsack?");
    String Pmove = IN.next().toLowerCase();

    while (true){
      if (Pmove.equals("lillasjon") || Pmove.equals("insvep") || Pmove.equals("tjena") || Pmove.equals("nordli") || Pmove.equals("dromsack")){
        return Pmove;
      } else {
          System.out.println("That is not a valid move friend, please, try again?");
          Pmove = IN.next().toLowerCase();
          continue;
        }
    }
  }

  public static void replay(int p, int c, int r){
    int pWins = p;
    int cWins = c;
    int roundsCount = r;

    System.out.println("Would you like to play again? [y or n]");

    String play = IN.next().toLowerCase();

    while (!(play.equals("y")) && !(play.equals("n"))) {
      System.out.println("I don't understand what you mean... do you want to play, or not? [y or n]");
      play = IN.next().toLowerCase();
    }

    if (play.equals("y")) {
      gameRound(pWins, cWins, roundsCount);
    }

    System.out.println("Thanks for playing!");
    System.out.println("Rounds Played: " + roundsCount);
    System.out.println("Computer wins: " + cWins + ", Player wins: " + pWins);
    System.exit(0);
  }
}
