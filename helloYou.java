import java.util.Scanner;
import java.util.Random;

public class helloYou {

    public static void name(){
        Scanner scan = new Scanner(System.in);

        String again;
        do{
            System.out.println("Enter your name:");
            String brand = scan.nextLine();
            System.out.println("Hello, " + brand + ".");
            
            System.out.println("Do you wish to continue with the questionnaire?  'y' for yes, 'n' for no.");
            String answer = scan.nextLine().toLowerCase();

                if (answer.equals("y") || (answer.equals("yes"))){
                    System.out.println("Please answer the following questions.");
                } else {
                    System.out.println("Please return later to complete the survey.");
                }

            String set;            
            String pet;
            int petAge;
            int lucky;
            int jersey;
            int auto;
            String actor;
            int userRandom;
            do{
                System.out.println("What is the name of your favorite pet?");
                pet = scan.nextLine();

                System.out.println("What is the age of your favorite pet?");
                petAge = Integer.valueOf(scan.nextLine());

                System.out.println("What is your lucky number?");
                lucky = Integer.valueOf(scan.nextLine());

                System.out.println("Do you have a favorite quarterback?");
                String qb = scan.nextLine();

                if (qb.equals("y") || (qb.equals("yes"))){
                    System.out.println("what is their jersey number?");
                    jersey = Integer.valueOf(scan.nextLine());
                }if ((!qb.equals("y")) && (!qb.equals("yes")) && (!qb.equals("n")) && (!qb.equals("no"))){
                    System.out.println("Please enter yes, y, no, or n.  These are the only valid answers.");
                }//while answer not valid, repeat qb question.

                System.out.println("What is the 2 digit model year of your car?");
                auto = Integer.valueOf(scan.nextLine());

                System.out.println("What is the name of your favorite actor or actress?");
                actor = scan.nextLine();

                System.out.println("Enter a random number between 1 and 50");
                userRandom = Integer.valueOf(scan.nextLine());
                    if (userRandom < 1 || userRandom > 50){
                        System.out.println("That is not a valid answer.  Please enter a random number between 1 and 50");
                    } //while condition not met repeat question

                System.out.println("Would you like to generate another set of numbers? Any reply other than y or yes is considered no and will terminate the program.");
                set = scan.nextLine();
            }
            while(set.equals("yes") || (set.equals("y")));

            Random rand = new Random();
            int magicRandom = rand.nextInt(75);
            int random1 = rand.nextInt(65);
            
            int magicBall = (lucky * magicRandom);
            while (magicBall > 75){
                magicBall = magicBall - 75;
            }
            System.out.println(magicBall);

            
            char pet3 =pet.charAt(2);
            int petAscii = (int) pet3;

            if (petAscii > 65) {
                petAscii = petAscii - 65;
            }

            char actor1 =actor.charAt(1);
            int actorAscii = (int) actor1;

            if (actorAscii > 65) {
                actorAscii = actorAscii - 65;
            }
            int simpleValue = 42;

            int carPet = auto + petAge;
            if (carPet > 65) {
                carPet = carPet -65;
            }
            
            int doubleRandom = userRandom - random1;
            if (doubleRandom < 1) {
                doubleRandom = doubleRandom + 65;
            }
            
            System.out.println("Lottery numbers: " + petAscii + " " + actorAscii + " " + simpleValue + " " + carPet + " " + doubleRandom + "  Magic ball: " + magicBall);

            System.out.println("Would you like to generate another set of numbers? Any reply other than y or yes will terminate the program.");
            again = scan.nextLine();
        }
        while(again.equals("yes") || (again.equals("y")));
        
        System.out.println("Thank you for playing. Goodbye.");

        scan.close();


    }
}


