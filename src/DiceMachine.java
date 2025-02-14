import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class DiceMachine {
    public ArrayList<Integer> roll(int diceSides, int diceAmount) {
        ArrayList<Integer> rollList = new ArrayList<>();
        int result = 0;
        int currentRolls = 0;
        while (!(diceAmount == currentRolls)) {
            currentRolls++;
            rollList.add(diceRoll(diceSides));
        }
        return rollList;
    }

    public int finalResult(Array list, String inputTypeRoll) {
        TypeRoll checkInput = TypeRoll.valueOf(inputTypeRoll);
        int index = 1;
        int tmp = 0;
        if (checkInput == TypeRoll.Advantage) {
            for (int i : list) {
                if (i > list.get(index)) {
                    tmp = index;
                    return tmp;
                }
            }
        }
        
        if (checkInput == TypeRoll.Disadvantage){
            for (int i : list) {
                if (i < list.get(index)) {
                    tmp = i;
                    return tmp;
                }
            }
        } return tmp;
    }

    private int diceRoll(int diceSides) {
        Random rollResult = new Random(diceSides);
        rollResult.nextInt();
        return diceSides;
    }
}
