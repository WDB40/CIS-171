import java.util.Scanner;

public class MemberIDBrown {

    public static void main(String[] args) {

        //Wes Brown

        //Get the member ID
        String memberID = getMemberID();

        //Format the member ID
        memberID = formatMemberID(memberID);

        //Print out the member ID
        System.out.printf("Formatted Member ID: %s", memberID);
    }

    private static String getMemberID(){

        //Variables to be used
        Scanner scanner = new Scanner(System.in); //For input
        String memberID; //To capture the result to return
        int MEMBER_ID_LENGTH = 14; //Constant for valid member ID character count

        //Ask for the user input for member ID.
        //If not 14 characters, try again.
        do{
            System.out.printf("Enter the %d character member ID: ", MEMBER_ID_LENGTH);
            memberID = scanner.nextLine();
        } while (memberID.length() != MEMBER_ID_LENGTH);

        //Return the valid memberID
        return memberID;
    }

    private static String formatMemberID(String memberID){

        //Send the string to uppercase as per requirement
        String formattedMemberId = memberID.toUpperCase();

        //This formats the string to match the requires for the member ID
        formattedMemberId = formattedMemberId.substring(0,1) + "-" +
                formattedMemberId.substring(1,4) + " " + formattedMemberId.substring(4,8) +
                " " + formattedMemberId.substring(8, 10) + "-" + formattedMemberId.substring(10, 13) +
                " (" + formattedMemberId.substring(13) + ")";

        //Return the formatted member ID
        return formattedMemberId;
    }
}
