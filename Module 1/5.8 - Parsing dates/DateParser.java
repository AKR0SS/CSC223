import java.util.Scanner;

public class DateParser {
    public static int getMonthAsInt(String monthString) {
        int monthInt;

        // Java switch/case statement
        switch (monthString) {
            case "January":
                monthInt = 1;
                break;
            case "February":
                monthInt = 2;
                break;
            case "March":
                monthInt = 3;
                break;
            case "April":
                monthInt = 4;
                break;
            case "May":
                monthInt = 5;
                break;
            case "June":
                monthInt = 6;
                break;
            case "July":
                monthInt = 7;
                break;
            case "August":
                monthInt = 8;
                break;
            case "September":
                monthInt = 9;
                break;
            case "October":
                monthInt = 10;
                break;
            case "November":
                monthInt = 11;
                break;
            case "December":
                monthInt = 12;
                break;
            default:
                monthInt = 0;
        }

        return monthInt;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // TODO: Read dates from input, parse the dates to find the ones
        //       in the correct format, and output in m-d-yyyy format
        String loopTF;
        int i;
        String month, date, year;

        do {
            loopTF = scnr.nextLine();

            if (loopTF.equals("-1")) break;

            i = loopTF.indexOf(",");
            if (i == -1) continue;

            String temp = loopTF.substring(0, i);

            date = temp.split(" ")[1];
            year = loopTF.substring(i + 2);
            month = String.valueOf(getMonthAsInt(temp.split(" ")[0]));

            System.out.println(month + "-" + date + "-" + year);
        } while (true);
    }
}