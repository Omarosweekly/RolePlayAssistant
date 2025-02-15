public class CoinSide {
    public String flip(int value){
        String side = "";
        if (value == 1) {
            side = "Heads/Kop";
        }
        else if (value == 2) {
            side = "Tails/Munt";
        }
        return side;
    }
}
