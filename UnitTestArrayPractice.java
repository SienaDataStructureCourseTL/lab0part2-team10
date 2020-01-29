import java.util.Random;
import java.util.Scanner;
/**
 * This class is used to perform a unit test on the
 * ArrayPractice class.  
 * 
 * DO NOT ALTER THIS CLASS UNTIL INSTRUCTED TO DO SO.  
 *
 * @author Prof. Ting, modified by Alexander Stein, Matt Scolaro and Tesfa Tesfaye
 * Note: This code was completed with the assistance and guidance of a CS tutor.
 * @version 1/28/2020
 */
public class UnitTestArrayPractice
{
    public static void main(String args[])
    {
        Double dArr[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer iArr[] = {1, 5, 4, 2, 3};
        Boolean bArr[] = {true, false, false, true, true, true};
        String sArr[] = {"Hello", "World!"};

        //Test 0
        System.out.println("***Testing ArrayPractice.sum(Double[])***\n");
        printArray(dArr);
        System.out.println("Expected:  Sum of elements:  16.5");
        System.out.println("Actual:    Sum of elements:  " + ArrayPractice.sum(dArr));
        System.out.println("\n***End test ArrayPractice.sum(Double[])***\n");

        //Test 1
        System.out.println("***Testing ArrayPractice.sum(Integer[])***\n");
        printArray(iArr);
        System.out.println("Expected:  Sum of elements:  15");
        System.out.println("Actual:    Sum of elements:  " + ArrayPractice.sum(iArr));
        System.out.println("\n***End test ArrayPractice.sum(Integer[])***\n");

        //Test 2
        System.out.println("***Testing ArrayPractice.largest(Integer[])***\n");
        printArray(iArr);
        System.out.println("Expected:  Largest:  5");
        System.out.println("Actual:    Largest:  " + ArrayPractice.largest(iArr));
        System.out.println("\n***End test ArrayPractice.largest(Integer[])***\n");

        //Test 3
        System.out.println("***Testing ArrayPractice.countLarger(Integer[], int)***\n");
        System.out.print("values larger than 3 in ");
        printArray(iArr);
        System.out.println("Expected:  Larger:  2");
        System.out.println("Actual:    Larger:  " + ArrayPractice.countLarger(iArr, 3));
        System.out.println("\n***End test ArrayPractice.countLarger(Integer[], int)***\n");

        //Test 4
        System.out.println("***Testing ArrayPractice.countTrue(Boolean[])***\n");
        printArray(bArr);
        System.out.println("Expected:  Count:  4");
        System.out.println("Actual:    Count:  " + ArrayPractice.countTrue(bArr));
        System.out.println("\n***End test ArrayPractice.countTrue(Boolean[])***\n");

        //Test 5
        System.out.println("***Testing ArrayPractice.stringLengths(String[])***\n");
        printArray(sArr);
        System.out.println("Expected:  Lengths:  5 6");
        System.out.print("Actual:    Lengths:  ");
        printArray(ArrayPractice.stringLengths(sArr));
        System.out.println("\n***End test ArrayPractice.stringLengths(String[])***\n");

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        Double values1[] = new Double[rand.nextInt(5) + 6];
        Integer values2[] = new Integer[rand.nextInt(5) + 6];

        for (int i = 0; i < values1.length; i++)
        { values1[i] = rand.nextDouble() * 4.0 - 2.0;}

        for (int x = 0; x < values2.length; x++)
        { values2[x] = rand.nextInt(21) - 20 + 10;}

        System.out.println("***Testing ArrayPractice.sum(values1)***\n");
        printArray(values1);
        System.out.println("Actual:    Sum of elements:  " + ArrayPractice.sum(values1));
        System.out.println("\n***End test ArrayPractice.sum(values1)***\n");

        System.out.println("***Testing ArrayPractice.sum(values2)***\n");
        printArray(values2);
        System.out.println("Actual:    Sum of elements:  " + ArrayPractice.sum(values2));
        System.out.println("\n***End test ArrayPractice.sum(values2)***\n");

        System.out.println("***Testing ArrayPractice.larger(values2)***\n");
        printArray(values2);
        System.out.println("Actual:    Largest of elements:  " + ArrayPractice.largest(values2));
        System.out.println("\n***End test ArrayPractice.larger(values2)***\n");

        System.out.println("***Testing ArrayPractice.countLarger(values2)***\n");
        printArray(values2);
        System.out.println("Actual:    Count of larger elements:  " + ArrayPractice.countLarger(values2, values2[1]));
        System.out.println("\n***End test ArrayPractice.countLarger(values2)***\n");

    }

    /**
     * This method will print the values of the input array, 
     * each on the same line, separated by spaces.
     * 
     * @param obj[] The input array.
     */
    private static void printArray(Object objArr[])
    {
        if (objArr != null)
        {
            for(Object obj : objArr)
            {
                System.out.print(obj + " ");
            }
            System.out.println();
        }
    }

}