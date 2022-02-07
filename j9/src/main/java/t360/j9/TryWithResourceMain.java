package t360.j9;

import java.util.Scanner;

public class TryWithResourceMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(TryWithResourceMain.class.getResourceAsStream("/employees.txt"));
        //try(Scanner scanner = new Scanner(TryWithResourceMain.class.getResourceAsStream("/employees.txt"))) {
        try(scanner) {
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}
