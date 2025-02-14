import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class DiceMachine {
    /*The choice input if the roll be  with advantage or disadvantage
    has not been made yet will happen in the choice menu.*/

    public int finalResult(ArrayList<Integer> list, String inputTypeRoll) {
        /*Inventory*/
        /*For the exercise inputTypeRoll is set to Disadvantage*/
        inputTypeRoll = "Disadvantage";
        TypeRoll checkInput = TypeRoll.valueOf(inputTypeRoll); //converter from String to Enum

        int index = 0;
        int tmp = 0;
        /*End*/
        if (list == null || list.isEmpty()) {
            System.out.println("No Entry");
            return 0;
        } else if (list.size() == 1) {
            tmp = list.get(0);
            // These have not been properly looped yet
        } else if (checkInput == TypeRoll.Advantage) {
            for (int i : list) {
                if (i > list.get(index)) {
                    tmp = index;
                    return tmp;
                }
                index++;
            }
        } else if (checkInput == TypeRoll.Disadvantage){
            for (int i : list) {
                if (i < list.get(index)) {
                    tmp = i;
                    return tmp;
                }
                index++;
            }
        } return tmp;
    }

    public ArrayList<Integer> roll(int diceSides, int diceAmount) {
        /* Inventory */
        int amountRolls = 0;
        ArrayList<Integer> madeRolls = new ArrayList<>();
        /*End*/
        while (!(diceAmount == amountRolls)) {
            amountRolls++;
            int  rollResult = diceRoll(diceSides);
            // The rolls need to be stored
            madeRolls.add(amountRolls-1, rollResult);
        }
        return madeRolls;
    }


    private int diceRoll(int diceSides) {
        Random rollResult = new Random(diceSides);
        return rollResult.nextInt();
    }
}
