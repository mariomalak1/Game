import java.util.Scanner;

// this class to hold only single value to pass it with reference in method

public class Player {
    protected String name;
    protected char symbol;

    public Player(String nm, char sym){
        name = nm;
        symbol = sym;
    }

    // function get move, that has passed to it reference to object that holds integer value only
    public void get_move(IntReference x, IntReference y){
        System.out.println("Enter your move like 0 1 ");
        Scanner s = new Scanner(System.in);
        x.number = s.nextInt();
        y.number = s.nextInt();
    }

    // getter of name
    public String get_name(){return name;}
    // setter of name
    public void set_name(String name){
        this.name = name;
    }

    // getter of symbol
    public char get_symbol(){return symbol;}
    // setter of symbol
    public void set_symbol(char sy){
        this.symbol = sy;
    }

    // method to take the name of the player
    public void takeName() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String Name = s.nextLine();
        this.set_name(Name);
    }

    // method to take the symbol of the player and check if it is valid
    public void takeSym(char[] flag,int n){
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter Your Sym (X or O only ): ");
            char sym = s.next().charAt(0);
            sym = Character.toUpperCase(sym);
            if(sym == 'X' || sym == 'O')
            {
                if(flag[0] != sym && flag[1] !=sym) {
                    flag[n] = sym;
                    this.set_symbol(sym);
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

    public static class IntReference{
        int number;
    }

}
