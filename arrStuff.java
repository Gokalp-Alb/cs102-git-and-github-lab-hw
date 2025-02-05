import java.util.Random;
import java.util.Scanner;

public class arrStuff {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    static int [] arr;
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = rd.nextInt(101);            
        }
        int choice;
        do{
            choice = displayMenuAndGetChoice();
        }while(choice != 5);
    }

    public static int displayMenuAndGetChoice()
    {
        System.out.println("1_Find min");
        System.out.println("2_Find max");
        System.out.println("3_Find each elements difference from average");
        System.out.println("4_Find the sum of even and odd numbers");
        System.out.println("5_ Finish program");
        return sc.nextInt();
    }

    public static int findMin()
    {

    }

    public static int findMax()
    {

    }
    
    
    public static int findEachElementsDifference()
    {

    }
    
    public static int FindOddAndEven()
    {

    }
}