import java.util.Scanner;

public class ButtonExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Button Example (Console Version) ===");
        System.out.println("Press ENTER to simulate clicking the button...");

        sc.nextLine();

        System.out.println("Button clicked!");
        sc.close();
    }
}
