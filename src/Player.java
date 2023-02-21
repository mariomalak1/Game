import java.beans.JavaBean;
import java.util.Scanner;

// this class to hold only single value to pass it with reference in method
class IntReference{
    int number;
}

public class Player {
    protected String name;
    protected char symbol;

    public Player(String nm, char sym){
        name = nm;
        symbol = sym;
    }

    // function get move, that has passed to it reference to object that holds integer value only
    public void get_move(IntReference x, IntReference y){
        x.number = new Scanner(System.in).nextInt();
        y.number = new Scanner(System.in).nextInt();
    }

    // getter, setter of name
    public String get_name(){return name;}
    public void set_name(String name){
        this.name = name;
    }

    // getter, setter of symbol
    public char get_symbol(){return symbol;}
    public void set_symbol(char sy){
        this.symbol = sy;
    }
}
