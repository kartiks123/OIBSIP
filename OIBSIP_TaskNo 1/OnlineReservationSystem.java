import java.util.Scanner;

public class OnlineReservationSystem 
{

    static String username = "admin";
    static String password = "123";

    static int trainNumber;
    static char trainName;
    static char classType;
    static String dest1;
    static String dest2;
    static String dateOfJourney;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("         ONLINE RESERVATION SYSTEM          ");
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.print("Enter your Username : ");
        String inputUsername = sc.nextLine();
        System.out.print("Enter your Password : ");
        String inputPassword = sc.nextLine();
        System.out.println("");

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("-------------------------------------------");

            System.out.println("          Login successfully.           ");
        } else {
            System.out.println("");
            System.out.println("        Invalid login credentials. Please login using admin rights.        ");
            System.out.println("");

            return;
        }

        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("Please fill in the details for your reservation :");
        System.out.println("");

        System.out.print("Train number : ");
        trainNumber = sc.nextInt();

        System.out.println("");
        System.out.print("Train name : ");
        trainName = sc.next().charAt(0);

        System.out.println("");
        System.out.print("Class type : ");
        classType = sc.next().charAt(1);

        System.out.println("");
        System.out.print("From : ");
        dest1 = sc.next();

        System.out.println("");
        System.out.print("To : ");
        dest2 = sc.next();

        System.out.println("");
        System.out.print("Date of journey : ");
        dateOfJourney = sc.next();
        System.out.println("");

        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("            TICKET DETAILS                ");
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("");
        System.out.println("Train Number : " + trainNumber);
        System.out.println("Train Name : " + trainName);
        System.out.println("Class Type : " + classType);
        System.out.println("From : " + dest1);
        System.out.println("To : " + dest2);
        System.out.println("Date of Journey : " + dateOfJourney);
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("");

        System.out.println("Enter PNR number to cancel a reservation : ");
        String pnrNumber = sc.next();
        System.out.println("");
        System.out.println("Do you want to cancel this ticket (OK/Cancel) : ");
        String confirmation = sc.next();
        if (confirmation.equalsIgnoreCase("OK")) {
            System.out.println("");
            System.out.println("Reservation cancelled successfully.");
        } else {
            System.out.println("Reservation not cancelled.");
        }

        sc.close();
    }
}