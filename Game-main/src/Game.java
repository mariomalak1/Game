import java.util.*;
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

        IntReference x = new IntReference();
        IntReference y=new IntReference();

        if (turn==0) {
            System.out.println(player1.get_name()+" enter move");
            player1.get_move(x, y);
            board.update(x.number,y.number, player1.get_symbol());
            board.display_Board();
            turn++;
        }
        else {
            System.out.println(player2.get_name()+" enter move");
            player2.get_move(x, y);
            board.update(x.number,y.number, player2.get_symbol());
            board.display_Board();
            turn--;

        }
    }
    public void play_game(){
while(!board.is_draw()&&!board.is_winner(player1.symbol)&&!board.is_winner(player2.symbol)){
    GameManger();

}
if (board.is_draw())
        System.out.println("Draw");
else {
    // because turn is change in last move to another player
    if(turn==1){
        System.out.println(player1.get_name()+"win");
    }
    else{
        System.out.println(player2.get_name()+"win");
    }
}
    }
}
