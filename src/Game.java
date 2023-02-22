public class Game {
    Board board;
    Player player1;
    Player player2;
    private int turn=0;
    public Game(Board b, Player player1,Player player2){
        this.board = b;
        this.player1 = player1;
        this.player2 = player2;
    }
    void GameManger(){

        Player.IntReference x = new Player.IntReference();
        Player.IntReference y = new Player.IntReference();

        board.display_Board();

        if (turn==0) {
            while(true)
            {
                System.out.println(player1.get_name()+" enter move");
                player1.get_move(x, y);
                //check if the index is valid
                if((x.number>=0 && x.number <3)&& (y.number>=0 && y.number <3))
                {
                    // check if the place is empty or not
                    if(board.grid[x.number][y.number] == '_')
                    {
                        board.update(x.number,y.number, player1.get_symbol());
                        turn++;
                        break;
                    }
                    else
                    {
                        System.out.println("This Place has been used before ... please try again ");
                    }
                }
                else
                {
                    System.out.println("Wrong index ... Try again ");
                }
            }
        }
        else {
            while(true)
            {
                System.out.println(player2.get_name()+" enter move");
                player2.get_move(x, y);
                //check if the index is valid
                if((x.number>=0 && x.number <3)&& (y.number>=0 && y.number <3))
                {
                    // check if the place is empty or not
                    if(board.grid[x.number][y.number] == '_')
                    {
                        board.update(x.number,y.number, player2.get_symbol());
                        turn--;
                        break;
                    }
                    else
                    {
                        System.out.println("This Place has been used before ... please try again ");
                    }
                }
                else
                {
                    System.out.println("Wrong index ... Try again ");
                }
            }
        }
    }

    public void play_game() {
        System.out.println("#### START OF THE GAME ####");
        while (!board.is_draw() && !board.is_winner(player1.symbol) && !board.is_winner(player2.symbol))
        {
            GameManger();
        }
        board.display_Board();
        if (board.is_draw())
            System.out.println("#### Draw ####");
        else {
            // because turn is change in last move to another player
            if (turn == 1) {
                System.out.println("### "+player1.get_name() + " is the winner ###");
            } else {
                System.out.println("### "+player2.get_name() + " is the winner ###");
            }
        }
    }
}
