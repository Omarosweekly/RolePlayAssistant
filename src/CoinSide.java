public class CoinSide {
    public String flip(int value){
        String side = "";
        if (value == 0) {
            side = "Heads/Kop";
        }
        else if (value == 1) {
            side = "Tails/Munt";
        }
        return side;
    }
}
