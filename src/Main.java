
public class Main {
    public static void main(String[] args)
    {
        Board b =new Board();
        Player p1=new Player("ehab",'X');
        Player p2=new Player("mario",'O');

        Game g=new Game(b,p1,p2);
        g.play_game();
    }
}