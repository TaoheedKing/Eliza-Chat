import java.util.Scanner;

public class Eliza {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Eliza Chats! My name is Eliza, What's your name?");
        String name = keyboard.nextLine();
        System.out.println(name);

        System.out.println();

        System.out.println("Nice to meet you, "+ name + ", How has your day been?");
        String day = keyboard.nextLine();
        System.out.println(day);

        System.out.println();

        System.out.println("Okay, Anything in particular that makes you feel that It has been a splendid day!?");
        String interestingDay = keyboard.nextLine();
        System.out.println(interestingDay);
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!");

        System.out.println();

        System.out.print(name + " " + day + " " + interestingDay);


    }
}
