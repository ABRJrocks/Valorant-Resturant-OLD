
import java.util.Scanner;

public  class ArrayDemo {

    public static void main(String[] args) {
    String[] breakfast = new String[5];
    Scanner in = new Scanner(System.in);
        System.out.println("Enter Dishes: ");
        for (int i = 0; i < breakfast.length; i++)
        {
            breakfast[i] = in.nextLine();
        }
        System.out.println("Dishes:");
        {
            for (int i = 0; i < breakfast.length; i++)
            {
                System.out.println(breakfast[i]);
            }
        }
    }
}
