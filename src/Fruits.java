import java.util.*;

public class Fruits {

    Scanner scanner = new Scanner(System.in);
    String[] fruits;


    Fruits(String[] fruits){
        this.fruits = fruits;
    }
    void FruitNames(){

        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Enter fruit " + (i + 1) + ": ");
            fruits[i] = scanner.nextLine();
        }
    }
    void ShowFruits(){
        System.out.println("\nYour fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
