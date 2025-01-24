import java.util.Scanner;
import java.util.Random;

public class task2
{
   public static void main(String[] args)
   {
    //create obj of random Scanner
    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    //Generate a random number between 1 to 10 
    int randomnum = r.nextInt(10)+1;
    int userguess = 0;
    int attempt = 0;

    System.out.println("Welcome to my Number guessing game");
    System.out.println("I have generated a number between 1 to 10. can you guess what it is?");

    //Loop until the user guesses the correctly

    while (userguess != randomnum)
    {
        System.out.println("Enter your gusseing number");

        //ensure user input is valid
        if (sc.hasNextInt())
        {
            userguess = sc.nextInt();
            attempt++;
        

        if(userguess < 1 || userguess > 10)
        {
            System.out.println("Please Guess the number between 1 to 10");

        }
        else if (userguess > randomnum)
        {
          System.out.println("Too high ! Try again");
        }
        else if(userguess < randomnum)
        {
            System.out.println("Too low ! Try again");
        }
        else
        {
            System.out.println("Congratulations! you've guessed the number"   + randomnum +  "correctly");

            System.out.println("It took you" + attempt + "attempts");
        }
    }
    else
    {
        System.out.println("Please enter a valid integer");
        sc.next();
    }
   }


    sc.close();
    System.out.println("Thank you for playing");
} 
}  
