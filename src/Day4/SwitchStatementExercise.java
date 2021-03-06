package Day4;

import java.util.Scanner;

public class SwitchStatementExercise {
    public static void main(String[] args) {

        System.out.println("Select number of day");
        Scanner chooseDayScanner = new Scanner(System.in);
        int chooseDay = chooseDayScanner.nextInt();
        System.out.println(isWeekDay(chooseDay));

        System.out.println("Select number of month");
        Scanner chooseMonthScanner = new Scanner(System.in);
        int chooseMonth = chooseMonthScanner.nextInt();
        System.out.println(determineNameOfMonth(chooseMonth));

        System.out.println("Select number of day");
        Scanner chooseNoOfDayScanner = new Scanner(System.in);
        int chooseNoOfDay = chooseNoOfDayScanner.nextInt();
        System.out.println(determineNameOfDay(chooseNoOfDay));


    }

    public static boolean isWeekDay(int dayNumber){
        switch (dayNumber){
            case 0:
            case 6: return false;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: return true;
        }
        return false;
    }

    public static String determineNameOfMonth(int monthNumber){
        switch (monthNumber){
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
        }
        return "Invalid selection";
    }

    public static String determineNameOfDay(int dayNumber){
        switch (dayNumber){
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
        }
        return "Invalid selection";
    }



}
