package org.example;
import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greetUser(scanner);
        String name = askUserName(scanner);
        guessUserAge(scanner);
        countToNumber(scanner);
        testProgrammingKnowledge(scanner);
        tellStory(name);
        guessAgeCorrectly(scanner);
        enjoyDaysOfWeek(scanner);

        scanner.close();
    }

    public static void greetUser(Scanner scanner) {
        System.out.println("Hello! I am your friendly chat bot.");
    }

    public static String askUserName(Scanner scanner) {
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");

        // Ask the user to repeat their name
        System.out.println("Can you please repeat your name?");
        String repeatedName = scanner.nextLine();

        // Check if the repeated name matches the first name
        if (repeatedName.equals(name)) {
            System.out.println("Thank you for repeating your name, " + name + "!");
        } else {
            System.out.println("It looks like you entered a different name. I'll call you " + repeatedName + "!");
            name = repeatedName;
        }

        return name;
    }

    public static void guessUserAge(Scanner scanner) {
        System.out.println("Let me guess your age. Are you between 20 and 30?");
        System.out.println("Enter 'yes' or 'no'.");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("I knew it! You look young.");
        } else {
            System.out.println("Oh, I was close! Age is just a number.");
        }
    }

    public static void countToNumber(Scanner scanner) {
        System.out.println("Enter a number and I'll count to it:");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void testProgrammingKnowledge(Scanner scanner) {
        System.out.println("Let's test your programming knowledge.");
        String question = "Which of the following is a Java keyword?\n" +
                "1) if\n" +
                "2) then\n" +
                "3) elseif\n" +
                "4) endif";
        int answer = 1;
        int userAnswer = 0;

        while (userAnswer != answer) {
            System.out.println(question);
            userAnswer = scanner.nextInt();
            if (userAnswer != answer) {
                System.out.println("Incorrect. Try again.");
            }
        }
        System.out.println("Correct! Well done.");
    }

    public static void tellStory(String name) {
        System.out.println("Let me tell you a story about " + name + ".");
        System.out.println(name + " is a brilliant programmer who loves to learn new things.");
    }

    public static void guessAgeCorrectly(Scanner scanner) {
        System.out.println("I can guess your age correctly this time.");
        System.out.println("Please enter the remainder of your age when divided by 3:");
        int remainder3 = scanner.nextInt();
        System.out.println("Please enter the remainder of your age when divided by 5:");
        int remainder5 = scanner.nextInt();
        System.out.println("Please enter the remainder of your age when divided by 7:");
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "!");
    }

    public static void enjoyDaysOfWeek(Scanner scanner) {
        System.out.println("Enter a number from 1 to 7 to hear what I enjoy about each day of the week:");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("I enjoy the start of a new week on Mondays!");
                break;
            case 2:
                System.out.println("Tuesdays are great for getting into the groove.");
                break;
            case 3:
                System.out.println("Wednesdays are wonderful because we're halfway through the week.");
                break;
            case 4:
                System.out.println("I love Thursdays because the weekend is near!");
                break;
            case 5:
                System.out.println("Fridays are fantastic because it's almost the weekend!");
                break;
            case 6:
                System.out.println("Saturdays are superb for relaxation.");
                break;
            case 7:
                System.out.println("Sundays are perfect for reflection and rest.");
                break;
            default:
                System.out.println("Invalid input. Please enter a number from 1 to 7.");
                break;
        }
    }
}


