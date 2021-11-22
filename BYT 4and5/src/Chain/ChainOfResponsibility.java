package Chain;

import java.util.Scanner;

public class ChainOfResponsibility
{

    public static void main( String[] args )
    {
        /*
        This code would be invoked, when the player finishes an encounter and gains monetary rewards.
        A person, invoking this code should provide only the monetary value of the reward, described in the encounter
        itself, and the program distributes it among the existing coins properly.
         */
        try {
            RewardGiving reward = new RewardGiving();

            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter the treasure value:");

            String value = myObj.nextLine();

            System.out.println("Value of the Reward: " + value + "\n");

            reward.reward(Integer.parseInt(value));
        } catch (Exception e) {
            System.out.println("Something is wrong...");
        }

    }

}
