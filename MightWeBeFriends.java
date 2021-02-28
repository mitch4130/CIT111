/**
 *
 * @author mitch
 */
import java.util.Scanner;
public class MightWeBeFriends {
      
public static void main(String [] args) {
    //we will ask the user questions in order to determine if we might be friends
    Scanner scanner = new Scanner(System.in);

        // Read string input for video games
        System.out.print("DO YOU LIKE VIDEO GAMES?");
        String question1 = scanner.nextLine();

        if (question1.equals("Yes"))
                 {
            System.out.println("Awesome!");
        } else {
            System.out.println("Wack");
        }
        String question2 = scanner.nextLine();
        System.out.print("DO YOU LIKE DOGS?");
        if (question2.equals("Yes"))
                 {
            System.out.println("Who doesn't!");
        } else {
            System.out.println("That's odd...");
            
            System.out.print("DO YOU LIKE MODDING CARS AND TRUCKS?");
        String question3 = scanner.nextLine();

        if (question3.equals("Yes"))
                 {
            System.out.println("I too live my life 1/4 at a time.");
        } else {
            System.out.println("I see, not everyone's cup of tea.");
            
            System.out.print("DO YOU LIKE PIZZA?");
        String question4 = scanner.nextLine();

        if (question4.equals("Yes"))
                 {
            System.out.println("My favorite food!");
        } else {
            System.out.println("Hmm, I see!");
            
            System.out.print("ARE YOU A TECH GEEK?");
        String question5 = scanner.nextLine();

        if (question5.equals("Yes"))
                 {
            System.out.println("I know one when I see one!");
        } else {
            System.out.println("I'm sure you have a lot of other interests!");
            
            System.out.println("If we have a lot of these interests in common, I'm sure we could be friends! However, if you said no to most of these, I'd like to try to be friends and see if we have anything else in common!");
        }
        
        }
        }
        }
}
}



  
    

