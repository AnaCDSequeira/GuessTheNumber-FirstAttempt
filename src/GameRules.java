public class GameRules {

    public static void play(Player player1, Player player2) {
        int computerGeneratedNumber = Util.generateNumber();

        play(player1);
        play(player2);

        while (player1.getGeneratedNumber() != computerGeneratedNumber && player2.getGeneratedNumber() != computerGeneratedNumber) {
            play(player1);
            play(player2);
        }
        if (player1.getGeneratedNumber() == player2.getGeneratedNumber()) {
            System.out.println("It's a draw! Play again.");
            return;
        }
        if (player1.getGeneratedNumber() == computerGeneratedNumber) {
            System.out.printf("%s wins!", player1.getName());
        }
        if (player2.getGeneratedNumber() == computerGeneratedNumber) {
            System.out.printf("%s wins!", player2.getName());
        }
    }

    private static void play(Player player) {
        player.setGeneratedNumber(Util.generateNumber());
    }
}