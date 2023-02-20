import java.beans.JavaBean;

public class Player {
    protected String name;
    protected char symbol;

    public Player(String nm, char sym){
        name = nm;
        symbol = sym;
    }
    public void get_move(int x, int y){

    }
    public String get_name(){return name;}
    public char get_symbol(){return symbol;}
}
