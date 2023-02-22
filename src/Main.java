public class Main {
    public static void main(String[] args)
    {
        // taking the name and the symbol from each player

        Board b = new Board();

        char[] flag = new char[2];
        flag[0] = '-' ;
        flag[1] = '-' ;

        Player p1 = new Player("",'-');
        Player p2 = new Player("",'-');

        System.out.println("### PLAYER ONE ###");
        p1.takeName();
        p1.takeSym(flag,0);

        System.out.println("### PLAYER TWO ###");
        p2.takeName();
        p2.takeSym(flag,1);

        Game g = new Game(b,p1,p2);
        g.play_game();
    }
}