import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number_of_daysINMonth = 0;
        String MonthOfName = "Unknown" ;

        System.out.println("input a month Number");
        int month = input.nextInt();

        System.out.println("Input a Year");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_of_daysINMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_of_daysINMonth = 29;
                } else {
                    number_of_daysINMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_of_daysINMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_of_daysINMonth = 30;
                break;
            case 5:
                MonthOfName = "may";
                number_of_daysINMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_of_daysINMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_of_daysINMonth = 31;
                break;
            case 8:
                MonthOfName = "august";
                number_of_daysINMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_of_daysINMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_of_daysINMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_of_daysINMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_of_daysINMonth = 31;
                break;
        }
        System.out.println(MonthOfName + year + "has" + number_of_daysINMonth + "days\n");


    }
}




