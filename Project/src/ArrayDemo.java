
import java.util.Scanner;

public class ArrayDemo {
    String[] breakfast = new String[5];
    Scanner in = new Scanner(System.in);

    void setArray() {
        System.out.println("Enter Dishes: ");
        for (int i = 0; i < breakfast.length; i++) {
            breakfast[i] = in.nextLine();
        }
    }

    void getArray() {
        System.out.println("Dishes:");
        {
            for (String s : breakfast) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayDemo a1 = new ArrayDemo();
        ArrayDemo a2 = new ArrayDemo();
        a1.setArray();
        a1.getArray();
    }
}
