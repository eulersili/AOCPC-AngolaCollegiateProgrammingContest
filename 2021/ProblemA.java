import java.util.Scanner;

public class ProblemA {
    public static void main(String[] args) {
        String word = "chi";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String userLetter = scanner.nextLine().toLowerCase().trim();

        if (userLetter.length() == 1 && Character.isLetter(userLetter.charAt(0))) {
            if (word.contains(userLetter)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
        else {
            System.out.println("Please, insert a single letter.");
        }

        scanner.close();
    }
}