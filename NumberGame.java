import java.io.*;
import java.util.Random;
public class NumberGame
{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random randomnum = new Random();

        int rand  = randomnum.nextInt(100)+1;
        int limit = 3;
        int score = 0;
        while(limit != 0){
            System.out.println("enter your guesses for the number: ");
            int randguess = Integer.parseInt(br.readLine());

            if(randguess < rand){
                System.out.println("the guess is low");
                limit--;
            }
            else if(randguess > rand){
                System.out.println("the guess is high");
                limit--;
            }
            else{
                System.out.println("You are correct!!");  
                score = score + 1; 
                break;
            }
        }
            if(limit == 0){
                System.out.println("you've reached your limits and the random number is "+rand);
            }
            else{
            System.out.println(limit + " attempts are left");
            System.out.println("Your score is: "+score);
        }
    }
}