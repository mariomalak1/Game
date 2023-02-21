
/*
Note(Youssef): I tested every method in Board Class and removed the test code from the main ...
# i removed the attribute (n) because it's a XO game so we now how the board will look like
# and also removed the constructor that takes n as a parameter  and edited the default  constructor to initialize the grid
# the grid attribute is created as 3X3
*/
public class Board
{
    protected char[][] grid  = new char[3][3];
    public Board() // initializing the grid of the game (X-O => 3X3 grid )
    {
        for(int i = 0 ; i < 3 ;  i++)
        {
            for(int j = 0 ; j < 3 ;  j++)
            {
                grid[i][j] = '_';
            }
        }
    }
    public void update(int x, int y,  char s)
    {
        grid[x][y] = s;
    }
    public void display_Board()
    {
        for(int i = 0 ; i < 3 ;  i++)
        {
            System.out.println("\t=======");
            System.out.println("\t|"+grid[i][0]+"|"+grid[i][1]+"|"+grid[i][2]+"|");
        }
        System.out.println("\t=======");
        System.out.println("###############");
    }
    public boolean is_winner(char sym)
    {
        if(sym == 'X' || sym == 'O')
        {
            for(int i = 0 ; i < 3 ; i++) // check win in horizontal or vertical way
            {
                if(grid[i][0] == sym &&grid[i][1] == sym&&  grid[i][2] ==sym)//check vertical win
                {
                    //System.out.println("V");
                    return true;
                }
                else if (grid[0][i] == sym && grid[1][i] ==sym&&  grid[2][i] ==sym)//check horizontal win
                {
                    //System.out.println("H");
                    return true;
                }
            }
            // check diagonal win
            return (grid[0][0] == sym && grid[1][1]==sym &&  grid[2][2]==sym) || (grid[0][2] == sym && grid[1][1] ==sym &&  grid[2][0]==sym);
        }
        return false;
    }
    // if a player won the game won't check for draw
    public boolean is_draw()
    {
        //check for empty place in the grid
        for(int i = 0 ; i < 3 ; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                if(grid[i][j] == '_')
                    return false;
            }
        }
        return true;
    }
}
