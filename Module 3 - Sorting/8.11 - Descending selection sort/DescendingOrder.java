import java.util.Scanner;

public class DescendingOrder {
    // TODO: Write a void method selectionSortDescendTrace() that takes
    //       an integer array and the number of elements in the array as arguments,
    //       and sorts the array into descending order.
    public static void selectionSortDescendTrace(int [] numbers, int numElements) {
        for (int i = 0; i < numElements - 1; i++) {
            if (numbers[i] <= 0) continue;

            // Find the Max index
            int maxIndex = i;
            for (int j = i + 1; j < numElements; j++) {
                if (numbers[maxIndex] < numbers[j]) {
                    maxIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[maxIndex];
            numbers[maxIndex] = temp;

            for (int num : numbers) {
                if (num <= 0) continue;
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int input, i = 0;
        int numElements = 0;
        int [] numbers = new int[10];

        // TODO: Read in a list of up to 10 positive integers; stop when
        //       -1 is read. Then call selectionSortDescendTrace() method.
        input = scnr.nextInt();

        while(input != -1) {
            numbers[i] = input;

            input = scnr.nextInt();
            i++;
        }
        selectionSortDescendTrace(numbers, i);
    }
}