import java.util.Scanner;

public class TicketCounterBrown {

    private static final int MAX_NUM_TICKETS = 75;
    private static final int MIN_PURCHASE_AMOUNT = 1;
    private static final int MAX_PURCHASE_AMOUNT = 6;


    public static void main(String[] args) {
        //Wes Brown
        sellTickets();
    }

    private static void sellTickets(){

        int numTicketsLeft = MAX_NUM_TICKETS;
        int purchaseRequest;
        int numCustomers = 0;

        printOpenTicketSale();

        while(ticketsLeft(numTicketsLeft)){

            purchaseRequest = getTicketPurchaseRequest();

            if(enoughTickets(purchaseRequest, numTicketsLeft)){

                numTicketsLeft -= purchaseRequest;
                numCustomers++;
                printTicketStatus(purchaseRequest);

                //Separate if statement to ask for next customer if we have tickets left.
                if(ticketsLeft(numTicketsLeft))
                    printRequestForNextCustomer(numTicketsLeft);

            } else {
                printUnableToCompleteTransaction(numTicketsLeft, purchaseRequest);
            }
        }

        printTicketSaleComplete(numCustomers);
    }

    private static int getTicketPurchaseRequest(){
        Scanner scanner = new Scanner(System.in);
        int purchaseAmount = 0;

        do{
            System.out.print("Enter the number of tickets you would like to purchase (1-6): ");

            if(scanner.hasNextInt()){
                purchaseAmount = scanner.nextInt();
            }

            //Clear the carriage return
            scanner.nextLine();

        } while(!validPurchaseAmount(purchaseAmount));

        return purchaseAmount;
    }

    private static void printOpenTicketSale(){
        System.out.printf("The sale opens now. We have %d tickets for sale!\n", MAX_NUM_TICKETS);
    }

    private static void printTicketSaleComplete(int numCustomers){
        System.out.printf("All tickets have been sold! We sold the %d tickets to %d different customers!", MAX_NUM_TICKETS, numCustomers);
    }

    private static void printRequestForNextCustomer(int ticketsLeft){
        System.out.printf("Next customer, please. We have %d tickets remaining.\n", ticketsLeft);
    }

    private static void printUnableToCompleteTransaction(int ticketsLeft, int ticketsRequested){
        System.out.printf("Sorry. Unable to complete the transaction, we have %d tickets left and you requested %d.\n", ticketsLeft, ticketsRequested);
    }

    private static void printTicketStatus(int ticketsJustSold) {
        System.out.printf("%d tickets were just sold!\n\n", ticketsJustSold);
    }

    private static boolean validPurchaseAmount(int purchaseAmount){
        return purchaseAmount >= MIN_PURCHASE_AMOUNT && purchaseAmount <= MAX_PURCHASE_AMOUNT;
    }

    private static boolean enoughTickets(int purchaseRequest, int ticketsLeft){
        return purchaseRequest <= ticketsLeft;
    }

    private static boolean ticketsLeft(int ticketsLeft){
        return ticketsLeft > 0;
    }
}
