public class TokenRunner
{
    public static void main(String[] args)
    {
        TokenPass game1 = new TokenPass(6);
        while(game1.gameOver()<0)
        {
            System.out.println(game1.printBoard());
            game1.DistributeCurrentPlayerTokens();
            game1.nextPlayer();
        }
        System.out.println(game1.printBoard());
        System.out.println("Game Winner: Player " + game1.gameOver());
    }
}
