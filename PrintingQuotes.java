import java.util.Scanner;

public class PrintingQuotes {

    public static void main(String args[]) {
        System.out.println("What is the quote?");
        Scanner quoteInput = new Scanner(System.in);
        String quoteString = quoteInput.nextLine();
        System.out.println("Who said it?");
        Scanner authorInput = new Scanner((System.in));
        String authorString = authorInput.nextLine();
        System.out.println(authorString + " says " + "'" + quoteString + "'");
    }
}
