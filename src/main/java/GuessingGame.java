import java.util.NoSuchElementException;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        try {
            Jar jar = administrator();
            startGame( jar);
        } catch (NoSuchElementException nsee) {
            System.out.println("no allowed to insert empty");
        }

    }

    public static Jar administrator() throws NoSuchElementException {
        Scanner reader = new Scanner(System.in);
        System.out.println("what type of item should fill the jar?");
        String itemName = reader.nextLine();
        System.out.println(String.format("What is the maximum number of %ss?", itemName));
        int maxNumber = reader.nextInt();
        Jar jar = new Jar(itemName, maxNumber);
        return jar;
    }


    public static void startGame(Jar jar) throws NoSuchElementException {
        Scanner reader = new Scanner(System.in);
        jar.fill();
        System.out.println(String.format("How many %ss are in the jar? Pick a number between 1 and %d.", jar.getName(), jar.getMaximumNumber()));
        boolean isWon = false;
        int count = 0;
        while (!isWon) {
            System.out.printf("Guess:");
            int number = reader.nextInt();
            count++;
            if ( jar.getItemsInJar() == number) {
                isWon = true;
            }

        }
        System.out.printf(String.format("Congratulations - you guessed that there are %d %ss in the jar. ", jar.getItemsInJar(), jar.getName()));
        System.out.println(String.format("You got it in %d attemp(s)", count));
    }
}
