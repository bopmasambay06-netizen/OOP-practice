import java.lang.reflect.Array;
import java.util.*;
public class Vegetables {

    Scanner scanner = new Scanner(System.in);
    String[] vegetables;


    Vegetables(String[] vegetables) {
        this.vegetables = vegetables;
    }

    void VegetableNames() {

        for (int i = 0; i < vegetables.length; i++) {
            System.out.print("Enter vegetable " + (i + 1) + ": ");
            vegetables[i] = scanner.nextLine();
        }
    }

    void showVegetables() {

    }

    public void ShowVegetables() {
        System.out.println("\nYour Vegetable:");
        for (String vegetable : vegetables) {
            System.out.println(vegetable);
        }
    }
}
