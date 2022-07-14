public class GameMain {

    public static void main(String[] args) {

        Player player1 = new Player("Ana");
        Player player2 = new Player("Miguel");

        GameRules.play(player1, player2);
    }

}
