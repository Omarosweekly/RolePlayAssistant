import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int menuCycle = 0;
        DiceShape[] dice = DiceShape.values();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            int menuNr = 1;
                StringBuilder menu = new StringBuilder();
                menu.append("\n").append("----------Dice roll menu----------\n");

                for (DiceShape side : dice) {
                    menu.append("| [").append(menuNr++).append("] ").append(side).append(" Advantage").append(" | [")
                            .append(menuNr++).append("] ").append(side).append(" Disadvantage |\n");
                }
                menu.append(menuNr++).append(". Exit");
                System.out.println(menu);
                System.out.println("Your choice: ");

            MakeTheRoll value = new MakeTheRoll();
            CoinSide coin = new CoinSide();
            choice = input.nextInt();
            String msg;
            switch (choice) {
                case 1:
                    msg = coin.flip(value.go(2, 2, TypeRoll.ADVANTAGE));
                    System.out.println(msg + " with advantage");
                    break;
                case 2:
                    msg = coin.flip(value.go(2, 2, TypeRoll.DISADVANTAGE));
                    System.out.println(msg + " with disadvantage");
                    break;
                case 3:
                    msg = String.valueOf(value.go(4, 2, TypeRoll.ADVANTAGE));
                    System.out.println(msg + " with advantage");
                    break;
                case 4:
                    msg = String.valueOf(value.go(4, 2, TypeRoll.DISADVANTAGE));
                    System.out.println(msg + " with disadvantage");
                    break;
                case 5:
                    msg = String.valueOf(value.go(6, 2, TypeRoll.ADVANTAGE));
                    System.out.println(msg + " with advantage");
                    break;
                case 6:
                    msg = String.valueOf(value.go(6, 2, TypeRoll.DISADVANTAGE));
                    System.out.println(msg + " with disadvantage");
                    break;
                case 7:
                    msg = String.valueOf(value.go(8, 2, TypeRoll.ADVANTAGE));
                    System.out.println(msg + " with advantage");
                    break;
                case 8:
                    msg = String.valueOf(value.go(8, 2, TypeRoll.DISADVANTAGE));
                    System.out.println(msg + " with disadvantage");
                    break;
                case 9:
                    msg = String.valueOf(value.go(10, 2, TypeRoll.ADVANTAGE));
                    System.out.println(msg + " with advantage");
                    break;
                case 10:
                    msg = String.valueOf(value.go(10, 2, TypeRoll.DISADVANTAGE));
                    System.out.println(msg + " with disadvantage");
                    break;
                case 11:
                    msg = String.valueOf(value.go(20, 2, TypeRoll.ADVANTAGE));
                    System.out.println(msg + " with advantage");
                    break;
                case 12:
                    msg = String.valueOf(value.go(20, 2, TypeRoll.DISADVANTAGE));
                    System.out.println(msg + " with disadvantage");
                    break;
                case 13:
                    msg = String.valueOf(value.go(100, 2, TypeRoll.ADVANTAGE));
                    System.out.println(msg + " with advantage");
                    break;
                case 14:
                    msg = String.valueOf(value.go(100, 2, TypeRoll.DISADVANTAGE));
                    System.out.println(msg + " with disadvantage");
                    break;
                default:
                    System.out.println("Incorrect value");
            }
        } while (choice != 15);
    }
}
