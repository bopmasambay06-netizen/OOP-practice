import java.util.*;

public class Main {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] fruit = null;
        String[] vegetables = null;
        int option;
        int size;
        boolean isExit = false;


        while(!isExit){

            System.out.println("=====Inventory System=====");
            System.out.println("Options:");
            System.out.println("Option 1 - Store in Vegetables");
            System.out.println("Option 2 - Store in Fruits");
            System.out.println("Option 3 - Check Current Inventory");
            System.out.println("Option 4 - Exit");
            System.out.print("Enter the number of your options: ");
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.nextLine();
                continue;
            }

            switch (option){
                case 1 -> {
                    System.out.print("How many Vegetables: ");
                    if (scanner.hasNextInt()) {
                        size = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        System.out.println("Invalid input! Please enter an integer.");
                        scanner.nextLine();
                        continue;
                    }

                    vegetables = new String[size];

                    Vegetables vegetable = new Vegetables(vegetables);
                    vegetable.VegetableNames();
                }
                case 2 -> {
                    System.out.print("How many fruits: ");
                    if (scanner.hasNextInt()) {
                        size = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        System.out.println("Invalid input! Please enter an integer.");
                        scanner.nextLine();
                        continue;
                    }

                    fruit = new String[size];

                    Fruits fruits = new Fruits(fruit);
                    fruits.FruitNames();

                }
                case 3 -> {
                    if (fruit != null) {
                        Fruits fruits = new Fruits(fruit);
                        fruits.ShowFruits();
                    } else {
                        System.out.println("No fruits in inventory.");
                    }
                    if (vegetables != null) {
                        Vegetables veggies = new Vegetables(vegetables);
                        veggies.ShowVegetables();
                    } else {
                        System.out.println("No vegetables in inventory.");
                    }
                }
                case 4 -> {
                    isExit = true;
                }
            }
        }
    }
}
