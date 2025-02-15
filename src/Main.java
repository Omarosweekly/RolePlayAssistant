import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DiceShape[] dice = DiceShape.values();
        Scanner input = new Scanner(System.in);
        int choice;
        String endMSG = "";
        int menuNr;
        do {
            menuNr = 1;
            StringBuilder menu = new StringBuilder();
            menu.append("\n").append("----------Dice roll menu----------\n");

            for (DiceShape side : dice) {
                menu.append(side).append(" -> [").append(menuNr++).append("] ").append("Advantage").append(" | [")
                        .append(menuNr++).append("] ").append("Disadvantage\n");
            }
            menu.append("----------------------------------\n[").append(menuNr++).append("] Exit\n");
            System.out.println(menu);
            String txt = (endMSG == null) ? ("Result previous chosen roll: \n" + endMSG) : "Make your first roll of the dice.";
            System.out.println(txt);
            System.out.println("What roll would you like to make? ");

            MakeTheRoll value = new MakeTheRoll();
            CoinSide coin = new CoinSide();
            int amountDice;
            choice = input.nextInt();
            System.out.println("How many dice would you like to roll?");
            amountDice = input.nextInt();
            String msg;

            switch (choice) {
                case 1:
                    msg = coin.flip(value.go(DiceShape.D2.getSides(), amountDice, TypeRoll.ADVANTAGE));
                    endMSG = msg + " with advantage";
                    break;
                case 2:
                    msg = coin.flip(value.go(DiceShape.D2.getSides(), amountDice, TypeRoll.DISADVANTAGE));
                    endMSG = msg + " with disadvantage";
                    break;
                case 3:
                    msg = String.valueOf(value.go(DiceShape.D4.getSides(), amountDice, TypeRoll.ADVANTAGE));
                    endMSG = msg + " with advantage";
                    break;
                case 4:
                    msg = String.valueOf(value.go(DiceShape.D4.getSides(), amountDice, TypeRoll.DISADVANTAGE));
                    endMSG = msg + " with disadvantage";
                    break;
                case 5:
                    msg = String.valueOf(value.go(DiceShape.D6.getSides(), amountDice, TypeRoll.ADVANTAGE));
                    endMSG = msg + " with advantage";
                    break;
                case 6:
                    msg = String.valueOf(value.go(DiceShape.D6.getSides(), amountDice, TypeRoll.DISADVANTAGE));
                    endMSG = msg + " with disadvantage";
                    break;
                case 7:
                    msg = String.valueOf(value.go(DiceShape.D8.getSides(), amountDice, TypeRoll.ADVANTAGE));
                    endMSG = msg + " with advantage";
                    break;
                case 8:
                    msg = String.valueOf(value.go(DiceShape.D8.getSides(), amountDice, TypeRoll.DISADVANTAGE));
                    endMSG = msg + " with disadvantage";
                    break;
                case 9:
                    msg = String.valueOf(value.go(DiceShape.D10.getSides(), amountDice, TypeRoll.ADVANTAGE));
                    endMSG = msg + " with advantage";
                    break;
                case 10:
                    msg = String.valueOf(value.go(DiceShape.D10.getSides(), amountDice, TypeRoll.DISADVANTAGE));
                    endMSG = msg + " with disadvantage";
                    break;
                case 11:
                    msg = String.valueOf(value.go(DiceShape.D12.getSides(), amountDice, TypeRoll.ADVANTAGE));
                    endMSG = msg + " with advantage";
                    break;
                case 12:
                    msg = String.valueOf(value.go(DiceShape.D12.getSides(), amountDice, TypeRoll.DISADVANTAGE));
                    endMSG = msg + " with disadvantage";
                    break;
                case 13:
                    msg = String.valueOf(value.go(DiceShape.D20.getSides(), amountDice, TypeRoll.ADVANTAGE));
                    endMSG = msg + " with advantage";
                    break;
                case 14:
                    msg = String.valueOf(value.go(DiceShape.D20.getSides(), amountDice, TypeRoll.DISADVANTAGE));
                    endMSG = msg + " with disadvantage";
                    break;
                case 15:
                    msg = String.valueOf(value.go(DiceShape.D100.getSides(), amountDice, TypeRoll.ADVANTAGE));
                    endMSG = msg + " with advantage";
                    break;
                case 16:
                    msg = String.valueOf(value.go(DiceShape.D100.getSides(), amountDice, TypeRoll.DISADVANTAGE));
                    endMSG = msg + " with disadvantage";
                    break;
                default:
                    System.out.println("Incorrect value");
            }

        } while (choice != menuNr);
    }
}
