import java.util.Scanner;

public class try4sc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("NAME");
        String NAME = scanner.nextLine();
        System.out.println("AGE");
        int AGE = scanner.nextInt();
        //clearing the scanner
        scanner.nextLine();
        System.out.println("fave FOOD");
        String FOOD = scanner.nextLine();

        System.out.println("hello " + NAME);
        System.out.println("you are " +AGE+ " years old");
        System.out.println("you like " + FOOD);
    }
}
