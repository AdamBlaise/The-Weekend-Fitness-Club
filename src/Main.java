import java.util.Scanner;
import java.util.Calendar;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Customer customers = new Customer();
    static Timetable timetable = new Timetable();

    //ENTERING AND VALIDATING CUSTOMER DETAILS

    private static Customer customerDetails() {
        String custName ="";
        String custPhone ="";

        //Ensure that customer details are entered correctly
        do{
            System.out.println("Enter your Name: ");
            custName = input.nextLine();
        }while(custName.equals(""));
        customers.setName(custName);

        do{
            System.out.println("Enter your Phone Number: ");
            custPhone = input.nextLine();
        }while(custPhone.equals(""));
        customers.setPhone(custPhone);

        return customers;
    }

    public static void timetable() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'day' to view by day or 'type' to view by fitness type: ");
        String choice = input.nextLine();
        if (choice.equals("day")) {
            System.out.print("Enter 'Saturday' or 'Sunday': ");
            String day = input.nextLine();
            if(day.equals("Saturday")) {
                timetable.viewByDay("Saturday");
            }else if(day.equals("Sunday")) {
                timetable.viewByDay("Sunday");
            } else {
                System.out.println("Invalid day entered.");
            }
        } else if (choice.equals("type")) {
            System.out.print("Enter fitness type: ");
            String type = input.nextLine();
            timetable.viewByFitnessType(type);
        } else {
            System.out.println("Invalid choice.");
        }
    }
    public static void main(String[] args) {

        customerDetails();
        timetable();
    }
}