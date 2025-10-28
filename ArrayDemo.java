
import java.util.Scanner;

public class ArrayDemo {

    int arr[] = new int[5];//instance variable 

    void insert(int data, int location) {
        int i;
        for (i = arr.length - 1; i >= location; i--) {
            arr[i] = arr[i - 1];
        }

        arr[i] = data;
    }

    void display() {
        System.out.println("Elements in the Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    void remove(int location) {

        int i;
        for (i = location - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        ArrayDemo a = new ArrayDemo();

        while (true) {
            System.out.println("\n1 For Add \n2 For Display\n3 for remove\n0 For Exit\nEnter your choice");
            int choice = scr.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data item and location ");
                    int data = scr.nextInt();
                    int location = scr.nextInt();
                    a.insert(data, location);
                    break;
                case 2:
                    a.display();
                    break;
                case 2+1:
                    System.out.println("Enter location to remove");
                    location = scr.nextInt();
                    a.remove(location);
                    break;
                case 0:
                    System.exit(0);
                default:
                    throw new AssertionError();
            }
        }
    }
}
