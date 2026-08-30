import java.util.Scanner;

public class q3 {

    static void findLongestStreak(String signalLog) {

        if (signalLog.length() == 0) {
            System.out.println("No signal data");
            return;
        }

        char longestSignal = signalLog.charAt(0);
        int longestLength = 1;

        char currentSignal = signalLog.charAt(0);
        int currentLength = 1;

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i) == currentSignal) {
                currentLength++;
            } else {

                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestSignal = currentSignal;
                }

                currentSignal = signalLog.charAt(i);
                currentLength = 1;
            }
        }

        // Check the last streak
        if (currentLength > longestLength) {
            longestLength = currentLength;
            longestSignal = currentSignal;
        }

        System.out.println("Longest Streak: '"
                + longestSignal
                + "' repeated "
                + longestLength
                + " times");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal sequence: ");
        String signalLog = sc.nextLine();

        findLongestStreak(signalLog);

        sc.close();
    }
}
