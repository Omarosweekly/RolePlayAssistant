import java.util.HashMap;

public class CheckInput {
    public boolean toEnum(int input) {
        boolean result = false;
        for (DiceShape query : DiceShape.values())
            if (query.getSides() == input) {
                result = true;
            }
        return result;
    }
}

