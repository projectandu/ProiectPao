/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpao;

/**
 *
 * @author lupul
 */
public class X_0 {
    private int x;
    private int y;
    private String[][] board = {
        {" ", " ", " "},
        {" ", " ", " "},
        {" ", " ", " "}
    };

    public void add(String symbol, int casuta) {
        getXY(casuta);
        board[x][y] = symbol;
    }
    
    public void clear()
    {
        int i,j;
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
                board[i][j]=" ";
    }
    
    public void getXY(int casuta)
    {
        if(casuta == 1)
        {
            x=0;
            y=0;
        }
        if(casuta == 2)
        {
            x=0;
            y=1;
        }
        if(casuta == 3)
        {
            x=0;
            y=2;
        }
        if(casuta == 4)
        {
            x=1;
            y=0;
        }
        if(casuta == 5)
        {
            x=1;
            y=1;
        }
        if(casuta == 6)
        {
            x=1;
            y=2;
        }
        if(casuta == 7)
        {
            x=2;
            y=0;
        }
        if(casuta == 8)
        {
            x=2;
            y=1;
        }
        if(casuta == 9)
        {
            x=2;
            y=2;
        }
        
    }

    public boolean checkWin(String symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[x][i] != symbol) {
                break;
            }
            if (i == 2) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[i][y] != symbol) {
                break;
            }
            if (i == 2) {
                return true;
            }
        }

        if (x == y) {
            for (int i = 0; i < 3; i++) {
                if (board[i][i] != symbol) {
                    break;
                }
                if (i == 2) {
                    return true;
                }
            }
        }

        if (x + y == 3 - 1) {
            for (int i = 0; i < 3; i++) {
                if (board[i][2 - i] != symbol) {
                    break;
                }
                if (i == 2) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkDraw() {
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (board[i][j] == " ") {
                    return false;
                }

            }

        }
        return true;
    }

}
