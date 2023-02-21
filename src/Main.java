import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        // taking the name and the symbol from each player

        Board b =new Board();
        char[] flag = new char[2];
        flag[0] = '-' ;
        flag[1] = '-' ;

        Player p1=new Player("",'-');
        Player p2=new Player("",'-');
        System.out.println("### PLAYER ONE ###");
        takeName(p1);
        takeSym(p1,flag,0);
        System.out.println("### PLAYER TWO ###");
        takeName(p2);
        takeSym(p2,flag,1);
        Game g=new Game(b,p1,p2);
        g.play_game();
    }
    public static void takeName(Player p) // method to take the name of the player
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String Name = s.nextLine();
        p.set_name(Name);
    }
    public static void takeSym(Player p,char[] flag,int n) // method to take the symbol of the player and check if it is valid
    {
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter Your Sym (X or O only ): ");
            char sym = s.next().charAt(0);
            sym = Character.toUpperCase(sym);
            if(sym == 'X' || sym == 'O')
            {
                if(flag[0]!= sym && flag[1]!=sym) {
                    flag[n] = sym;
                    p.set_symbol(sym);
                    break;
                }
                else {
                    System.out.println("This Symbol Have been taken ... Please Chose another one ");
                }
            }
            else {
                System.out.println("The symbol you entered is not allowed in this game ( only X or O symbol is allowed )");
                System.out.println("Please Try again .");
            }
        }
    }
}