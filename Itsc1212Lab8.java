/** If you have squiggly red lines, don't worry about it.
* That's repl being repl I think; this runs (more or less)
* so it should be fine?
*/

// TODO: Fix the below header to better fit your group.
/**
* @authors Whit Huntley, Tyler Fuentes, Mitchell Nyugen, Justin Laing
* ITSC-1212:153, Mazumder
* @version 1.0
* @since 2021-10-19
* Lab 8
* 
* Lab 8 [does something.]
*/

//Part A

import java.awt.Color;
import java.util.Scanner;

public class Itsc1212Lab8 {

  static int randomX = 0;
  static int randomY = 0;
  static World w = new World(500, 500);
  static Turtle tom = new Turtle(randomX, randomY, w);

  public static void main(String[] args) throws InterruptedException {
    tom.setVisible(false);
    randomX = ((int) (Math.random() * 100)) * 5;
    randomY = ((int) (Math.random() * 100)) * 5;
    Scanner scnr = new Scanner(System.in);

    // TODO: Remove the below print statments!
    System.out.println(randomX);
    System.out.println(randomY);

    // Initialize the guess values as impossible values so they always fall into the
    // while loop. This could be avoided with a do-while but that's apparently too
    // scary for us.
    int guessX = -1;
    int guessY = -1;

    while ((guessX != randomX) || (guessY != randomY)) {
      if (guessX != randomX) {
        // This is a dirty hack to make sure the user always falls into the while loop.
        if (guessX == -1) {
          System.out.println("Enter A Guess for the X Position of Tom: ");
          guessX = scnr.nextInt();
        }

        // Now we compare the user's value against the actual value
        if (guessX > randomX) {
          colorGuessX(guessX);
          System.out.println("Your guess for X (" + guessX + ") is Too high! Please enter another X-value.");
          guessX = scnr.nextInt();
        } else if (guessX < randomX) {
          colorGuessX(guessX);
          System.out.println("Your guess for X (" + guessX + ") is too low! Please enter another X-value.");
          guessX = scnr.nextInt();
        }

        // If the guess was correct, we inform the user.
        if (guessX == randomX) {
          System.out.println("Your X-Value was correct.");
        }
      }

      if (guessY != randomY) {
        if (guessY == -1) {
          System.out.println("Enter A Guess for the Y Position of Tom: ");
          guessY = scnr.nextInt();
        }
        if (guessY > randomY) {
          colorGuessY(guessY);
          System.out.println("Your guess for Y (" + guessY + ") is Too high! Please enter another Y-value.");
          guessY = scnr.nextInt();
        } else if (guessY < randomY) {
          colorGuessY(guessY);
          System.out.println("Your guess for Y (" + guessY + ") is too low! Please enter another Y-value.");
          guessY = scnr.nextInt();
        }
        if (guessY == randomY) {
          System.out.println("Your Y value was correct!");
        }
      }
    }
    System.out.println("Congratulations! You guessed all the answers correctly.");
    System.out.println("Your turtle is located at (" + guessX + ", " + guessY + ").");
    tom.setVisible(true);
    scnr.close();

  }

// Part B
  public static void colorGuessY(int y) {
        Turtle jen = new Turtle(w);
        jen.penUp();
        jen.setVisible(false);
        jen.setPenColor(Color.black);
        if (y > randomY) 
        {
            for (int i = y; i < 500; i++) 
            { 
                jen.moveTo(0,i);
                jen.penDown();
                jen.setHeading(90);
                jen.forward(499);
                jen.penUp();
            }
        } else 
        {
            for (int i = 0; i < y; i++) 
            {
                jen.moveTo(0, i);
                jen.penDown();
                jen.setHeading(90);
                jen.forward(499);
                jen.penUp();
            }
        }
  }

  public static void colorGuessX(int x) throws InterruptedException {
    Thread.sleep(10);
    Turtle jen = new Turtle(w);
    jen.penUp();
    jen.setVisible(false);
    jen.setPenColor(Color.black);
    if (x > randomX) 
    {
      for (int i = x; i < 500; i++) 
      {
        jen.moveTo(i, 0);
        jen.penDown();
        jen.setHeading(180);
        jen.forward(500);
        jen.penUp();
      }
    } else
    {
      for (int i = 0; i < x; i++) 
      {
        jen.moveTo(i, 0);
        jen.penDown();
        jen.setHeading(180);
        jen.forward(499);
        jen.penUp();
      }
    }

  }
} 