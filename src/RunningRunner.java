import java.util.Scanner;

public class RunningRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // obtaining string
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();

        // math
        int str1len = str1.length();
        int str1cut = (int) str1len / 2;
        String str1half1 = str1.substring(0, str1cut);
        String str1half2 = str1.substring((str1cut + 1));

        // printing
        System.out.println("String Length: " + str1len);
        System.out.println("First Half: " + str1half1);
        System.out.println("Second Half: " + str1half2);

    }
}
