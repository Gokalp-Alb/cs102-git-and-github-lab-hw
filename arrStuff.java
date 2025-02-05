import java.util.Random;
import java.util.Scanner;

public class arrStuff {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    static int [] arr;
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = rd.nextInt(101);            
        }
        int choice;
        do{
            choice = displayMenuAndGetChoice();
            if (choice == 1) 
            {
                System.out.println(findMin());
            }
            else if (choice == 2) 
            {
                System.out.println(findMax());                
            }
            else if (choice == 3) 
            {
                printArray(findEachElementsDifference());
            }
            else if (choice == 4) 
            {
                
            }
        }while(choice != 5);
    }

    public static int displayMenuAndGetChoice()
    {
        System.out.println("1_Find min");
        System.out.println("2_Find max");
        System.out.println("3_Find each elements difference from average");
        System.out.println("4_Find the sum of even and odd numbers");
        System.out.println("5_Finish program");
        System.out.print("Please enter a valid integer: ");
        return sc.nextInt();
    }

    public static int findMin()
    {
        int minNumber = 101;
        for(int num : arr)
        {
            if(num < minNumber)
            {
                minNumber = num;
            }
        }
        return minNumber;
    }

    public static int findMax()
    {
        int maxNumber = -1;
        for(int num : arr)
        {
            if(num > maxNumber)
            {
                maxNumber = num;
            }
        }
        return maxNumber;
    }
    
    
    public static int[] findEachElementsDifference()
    {
        int average = 0;
        int[] differenceArr = new int[arr.length];
        for(int num : arr)
        {
            average += num;
        }
        average = average / arr.length;
        for(int i = 0; i < arr.length; i++)
        {
            differenceArr[i] = average - arr[i];
        }
        return differenceArr;
    }

    public static int FindOddAndEven()
    {

    }

    public static void printArray(int[] intArr)
    {
        for(int num : intArr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    

}