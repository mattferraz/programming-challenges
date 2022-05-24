import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        // Julian Year (1700 - 1917):
        System.out.println("Julian Year (1700 - 1917)");

        int julianYear = random.nextInt(1700, 1918);
        System.out.println("Year: " + julianYear);
        System.out.println("Programmer's day: " + Solution.programmersDay(julianYear));

        System.out.println("-".repeat(30));

        // Transition Year (1918):
        System.out.println("Transition Year (1918)");

        int transitionYear = 1918;
        System.out.println("Year: " + transitionYear);
        System.out.println("Programmer's day: " + Solution.programmersDay(transitionYear));

        System.out.println("-".repeat(30));

        // Gregorian Year (Since 1919):
        System.out.println("Georgian Year (Since 1919)");

        int currentYear = LocalDate.now().getYear();
        int gregorianYear = random.nextInt(1919, currentYear);
        System.out.println("Year: " + gregorianYear);
        System.out.println("Programmer's day: " + Solution.programmersDay(gregorianYear));

        System.out.println("-".repeat(30));
    }

}
