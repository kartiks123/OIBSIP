import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int count=0;
        int trials = 8;
        int guess;
        int i;
        int number = 1 + (int) (100 * Math.random());

        System.out.println("-----------------------------------------------------");
        System.out.println("           WELCOME TO THE NUMBER GUESSING GAME           ");
        System.out.println("-----------------------------------------------------");
        System.out.println();
        System.out.println(" Challenge : Guess the number within 8 trials ");
        System.out.println(" I'm thinking of a number between 1 and 100. Can you guess what it is ?");
        System.out.println();

        for (i = 0; i < trials; i++) 
        {
            System.out.println("Enter the number which you are guessing : ");
            guess = sc.nextInt();

            if (number == guess) 
            {
                System.out.println("Congratulations ! You guessed the Right Number. ");
                System.out.println("Your Score is = "+count);

                break;
            } 
            
            else if (number > guess && i != trials - 1) 
            {
                System.out.println("The number is greater than " + guess);
                System.out.println();
                count++;
            } 
            
            else if (number < guess && i != trials - 1) 
            {
                System.out.println("The number is less than " + guess);
                System.out.println();
                count++;
            }
        }

        if (i == trials) 
        {
            System.out.println("Sorry ! Your Chances Are Over.");
            System.out.println("Your Score is = "+count);
            System.out.println("The number was -> " + number);
        }
    }
}