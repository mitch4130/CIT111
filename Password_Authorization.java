/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitch
 */
import java.util.Scanner;
public class Password_Authorization 
{
   public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.print("Type password:\t");
            String command = reader.nextLine();
            if (command.equals("password123")) {
                System.out.println("Correct! You are entering a restricted account.");
                System.out.println("The top secret information is... Java is fun!");
                break;
            } else {
                i++;
                System.out.println("Wrong!");
                if (i == 3) {
                    System.out.println("Max attempts reached!! Exiting....");
                    break;
                }
            }
        }
   }
}
        
        