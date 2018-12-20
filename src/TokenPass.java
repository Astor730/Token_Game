public class TokenPass
{
    private int[] board;
    private int currentPlayer;
    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        for (int i = 0; i < board.length; i++)
        {
            int a = (int) (Math.random()* 10) +1;
            board[i] = a;
        }
        currentPlayer = (int) Math.random()*playerCount;
    }
    public void DistributeCurrentPlayerTokens()
    {
        int Tokens = board[currentPlayer];
        board[currentPlayer] = 0;
        int position = currentPlayer;
        while(Tokens>0)
        {
            position = (position+1) % board.length;
            board[position]++;
            Tokens--;
        }
    }
    public String printBoard()
    {
        String output = "";
        for(int i = 0; i<board.length;i++)
        {
            output = output + " " + board[i];
        }
        return output;
    }
    public void nextPlayer()
    {
        if(currentPlayer<board.length)
        {
            currentPlayer = currentPlayer ++;
        }
        else
        {
            currentPlayer = 0;
        }
    }
    public int gameOver()
    {
        int a = -1;
        for(int i = 0;i<board.length; i++)
        {
            if(board[i]==0)
            {
                a = i;
            }
        }
        return a;
    }
}
