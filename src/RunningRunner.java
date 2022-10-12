import java.util.Scanner;

public class RunningRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // obtaining string
        System.out.print("Enter first string: ");
        String str1 = scan.nextLine();

        // math
        int str1len = str1.length();
        int str1cut = str1len / 2;
        String str1half1 = str1.substring(0, str1cut);
        String str1half2 = str1.substring(str1cut);

        // printing
        System.out.println("String Length: " + str1len);
        System.out.println("First Half: " + str1half1);
        System.out.println("Second Half: " + str1half2);

        // obtaining string 2
        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();

        // math
        int str2len = str2.length();
        if (str1len > str2len) {
            System.out.println(str1 + " is longer");
        } else if (str1len < str2len) {
            System.out.println(str2 + " is longer");
        } else {
            System.out.println("Both strings have the length");
        }

        // equal/compareTo
        if (str1.equals(str2)) {
            System.out.println("Both strings have the exact same characters");
        } else {
            int alp = str1.compareTo(str2);
            if (alp < 0) {
                System.out.println(str1 + " is first alphabetically");
            } else {
                System.out.println(str2 + " is first alphabetically");
            }
        }

        // found in each other
        int indexOfStr2 = str1.indexOf(str2);
        if (indexOfStr2 != -1) {
            System.out.println(str2 + " is found in " + str1);
        } else {
            System.out.println(str2 + " is NOT found in " + str1);
        }
    }
}
