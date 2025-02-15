public enum DiceShape {
    D2,
    D4,
    D6,
    D8,
    D10,
    D12,
    D20,
    D100
    ;

    private String msg;
    private int sides;

    void DiceSides(String msg, int sides) {
        this.msg = msg;
        this.sides = sides;
    }
    static {
        D2.msg = "Coin";
        D2.sides = 2;
        D4.msg = "4-sided dice";
        D4.sides = 4;
        D6.msg = "6-sided dice";
        D6.sides = 6;
        D8.msg = "8-sided dice";
        D8.sides = 6;
        D10.msg = "10-sided dice";
        D10.sides = 10;
        D12.msg = "12-sided dice";
        D12.sides = 12;
        D20.msg = "20-sided dice";
        D20.sides = 20;
        D100.msg = "100-sided dice";
        D100.sides = 100;
    }

    public String getMsg() {
        return msg;
    }

    /**
     * The max value of the selected dice when using the randomizer.
     * @return It corrects for the index counting
     * that starts with 0.
     */
    public int getSides() {
        return sides;
    }
@Override
    public String toString() {
    return getMsg();
}

}
