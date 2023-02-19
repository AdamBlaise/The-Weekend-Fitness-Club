import java.util.Scanner;

public class Main {


    static Scanner input = new Scanner(System.in);

    static Customers customers = new Customers();

    //ENTERING AND VALIDATING CUSTOMER DETAILS

    private static Customers customerDetails() {
        String custName ="";
        String custEmail ="";
        String custPhone ="";

        //Ensure that customer details are entered correctly
        do{
            System.out.println("Enter your Name: ");
            custName = input.nextLine();
        }while(custName.equals(""));
        customers.setName(custName);

        System.out.println("Enter your Email: ");
        custEmail = input.nextLine();
        customers.setEmail(custEmail);

        do{
            System.out.println("Enter your Phone Number: ");
            custName = input.nextLine();
        }while(custName.equals(""));
        customers.setPhone(custPhone);

        return customers;
    }


    public static void main(String[] args) {

        customerDetails();
    }
}