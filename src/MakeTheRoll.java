import java.util.ArrayList;

public class MakeTheRoll {
    public int go(int dice, int amount, TypeRoll type){
        DiceMachine activity = new DiceMachine();
        ArrayList<Integer> list = activity.roll(dice, amount);
        return activity.finalResult(list, type);
    }
}
