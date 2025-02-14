import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DiceMachine {
    /*The choice input if the roll be  with advantage or disadvantage
    has not been made yet will happen in the choice menu.*/

    public int finalResult(ArrayList<Integer> list, TypeRoll inputTypeRoll) {
        /*Inventory*/
       ; //converter from String to Enum
        /*For the exercise inputTypeRoll is set to Disadvantage*/

        int tmp = 0;
        /*End*/
        if (list == null || list.isEmpty()) {
            System.out.println("No Entry");
            return 0;
        } else if (list.size() == 1) {
            tmp = list.getFirst();
        } else if (inputTypeRoll == TypeRoll.ADVANTAGE) {
            return Collections.max(list);

        } else if (inputTypeRoll == TypeRoll.DISADVANTAGE) {
            return Collections.min(list);
        } else {
            return tmp;
        }
        return tmp; // this will be shared to the main method.
    }

    public ArrayList<Integer> roll(int diceSides, int diceAmount) {
        /* Inventory */
        int amountRolls = 0;
        ArrayList<Integer> madeRolls = new ArrayList<>();
        /*End*/
        while (!(diceAmount == amountRolls)) {
            amountRolls++;
            int  rollResult;
            do{
                rollResult = diceRoll(diceSides+1);
            } while (rollResult <= 0);
            // The rolls need to be stored
            madeRolls.add(rollResult);
                    }
        return madeRolls; //This list is to be shared in the main method.
    }

    private int diceRoll(int diceSides) {
        Random rollResult = new Random();
        return rollResult.nextInt(diceSides+1); // Called in the roll method
    }
}
