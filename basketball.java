import java.util.Scanner;
import java.util.Random;
import java.awt.Font;
/**
 * Write a method to calculate basketball shots using random numbers
 *
 * Parastoo Toosi
 * September 13, 2022
 */
public class basketball
{
    public static void basketball()
    {
        //QQQ Declare data as an instance of type Scanner
        Scanner data = new Scanner(System.in);
        String name;

        //QQQ Declare in as an object reference to Random
        Random in = new Random();
        
        System.out.print("Counting Basketball Shots by Parastoo: ");
        
        
        //System.out.println("Parastoo Toosi");
        int shots = in.nextInt(18) + 10; //10-30 random shots
        System.out.print("\n"+"After "+ shots +
        "shots, How many shots did you get? ");
        int get = in.nextInt();

        double percent = (get * 100.0) / shots;
        System.out.println("That's "+ percent + "%" );
    }
    }
