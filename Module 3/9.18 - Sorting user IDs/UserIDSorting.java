import java.util.Scanner;
import java.util.ArrayList;

public class UserIDSorting {
    // TODO: Write the partitioning algorithm - pick the middle element as the
    //       pivot, compare the values using two index variables l and h (low and high),
    //       initialized to the left and right sides of the current elements being sorted,
    //       and determine if a swap is necessary
    public static int partition(ArrayList<String> userIDs, int lowIndex, int highIndex) {
        int midpoint = lowIndex + (highIndex - lowIndex) / 2;
        String pivot = userIDs.get(midpoint);

        boolean done = false;
        while (!done) {
            // Decrement highIndex while pivot < numbers[highIndex]
            while (userIDs.get(highIndex).compareTo(pivot) > 0) {
                highIndex -= 1;
            }
            // Increment lowIndex while numbers[lowIndex] < pivot
            while (userIDs.get(lowIndex).compareTo(pivot) < 0) {
                lowIndex += 1;
            }


            // If zero or one elements remain, then all numbers are
            // partitioned. Return highIndex.
            if (lowIndex >= highIndex) {
                done = true;
            }
            else {
                // Swap numbers[lowIndex] and numbers[highIndex]
                String temp = userIDs.get(lowIndex);
                userIDs.set(lowIndex, userIDs.get(highIndex));
                userIDs.set(highIndex, temp);

                // Update lowIndex and highIndex
                lowIndex += 1;
                highIndex -= 1;
            }
        }
        return highIndex;
    }

    // TODO: Write the quicksort algorithm that recursively sorts the low and
    //       high partitions
    public static void quicksort(ArrayList<String> userIDs, int lowIndex, int highIndex) {
        // Base case: If the partition size is 1 or zero
        // elements, then the partition is already sorted
        if (lowIndex >= highIndex) {
            return;
        }

        // Partition the data within the array. Value lowEndIndex
        // returned from partitioning is the index of the low
        // partition's last element.
        int lowEndIndex = partition(userIDs, lowIndex, highIndex);

        // Recursively sort low partition (lowIndex to lowEndIndex)
        // and high partition (lowEndIndex + 1 to highIndex)
        quicksort(userIDs, lowIndex, lowEndIndex);
        quicksort(userIDs, lowEndIndex + 1, highIndex);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ArrayList<String> userIDList = new ArrayList<String>();

        String userID;

        userID = scnr.next();
        while (!userID.equals("-1")) {
            userIDList.add(userID);
            userID = scnr.next();
        }

        // Initial call to quicksort
        quicksort(userIDList, 0, userIDList.size() - 1);

        for (String s : userIDList) {
            System.out.println(s);
        }
    }
}