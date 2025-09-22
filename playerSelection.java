import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {

    // Variable Declaration

        String playerName, playerPosition, attackerStatus, lineupDecision, playEligibility;
        int age, height; // height in metters
        int jerseyNumber;
        double weight ; // weight in pounds
        boolean playerEligibility;
        Scanner entry = new Scanner(System.in);

        //Player Entries
        //name
        System.out.println("Enter your name");
        playerName = entry.nextLine();

        //age
        System.out.println("Enter your age");
        age = entry.nextInt();

        //Player height and weight
        System.out.println("Enter your height");
        height = entry.nextInt();

        System.out.println("Enter your weight");
        weight = entry.nextDouble();

        // Player height and weight conversion
        final double POUND = 0.45359237;
        final int METER = 100;

        int newHeight = height * METER; // In centimeters
        double newWeight = weight * POUND; // In Kilograms

        // categorizing players based on their age
        String playerCategory;
        if (age < 20){
            playerCategory = "Rising Star";
        }
        else if (age >= 20 && age <=30 ){
            playerCategory = "Prime Player";
        }
        else {
            playerCategory = "Veteran";
        }

        // Determining player positions based on jersey numberr
        System.out.println("Coaches should kindly enter the jersey nmber of each player");
        jerseyNumber = entry.nextInt();


        switch(jerseyNumber){

            case 1:
            playerPosition = "Goalkeeper";
            attackerStatus = "No";
            break;
            
            case 2: case 3:
            playerPosition = "Full back";
            attackerStatus = "No";
            break;

            case 4:
            playerPosition = "Left Back";
            attackerStatus = "No";
            break;

            case 5:
            playerPosition = "Right Back";
            attackerStatus = "No";
            break;

            case 6:
            playerPosition = "Center Midfielder";
            attackerStatus = "No";
            break;

            case 7:
            playerPosition = "Right Winger";
            attackerStatus = "Yes";
            break;

            case 8:
            playerPosition = "Defensive Midfielder";
            attackerStatus = "No";
            break;
            
            case 9:
            playerPosition = "Center Forward";
            attackerStatus = "Yes";
            break;

            case 10:
            playerPosition = "Classic No. 10";
            attackerStatus = "No";
            break;

            case 11:
            playerPosition = "Left Winger";
            attackerStatus = "Yes";
            break;

            default:
            playerPosition = "Player position not known";
            attackerStatus = "Not determined";

        }

        // Player Eligibility

        playerEligibility = age >= 18 && age <= 35 && newWeight < 90;
        String eligible;


        if (playerEligibility) {
            eligible = "Eligible";
        }

        else {
            eligible = "Not Eligible";
        }


        // the fianl reconing, starting line up or bench man 
        if (playerCategory.equals("Prime Player") ) {
            
            if (newWeight < 80) {
                lineupDecision = "Starting Line up";
            }
            
            else{
                lineupDecision = "Bench";
            }
        }

        else {
            lineupDecision = "Bench";
        }

        
        playEligibility = playerEligibility? "Play" : "Rest";
        

        //Player Report
        System.out.println("Player: ["+ playerName + "]");
        System.out.println("age: ["+ age + "]");
        System.out.println("Height: [" + newHeight + "]");
        System.out.println("Weight: [" + newWeight + "]");
        System.out.println("Jersey: [" + jerseyNumber + "]");
        System.out.println("Position: [" + playerPosition + "]");
        System.out.println("Attacker jersey: [" + attackerStatus + "]");
        System.out.println("Eligibility: [" + eligible + "]");
        System.out.println("Lineup Decision: [" + lineupDecision + "]");
        System.out.println("Final Decision: [" + playEligibility + "]");


        entry.close();

    
    }
}
