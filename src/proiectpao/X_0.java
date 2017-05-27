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
public class X_0 
{
    private String[][] board= {  
                                { " ", " ", " "},
                                { " ", " ", " "},
                                { " ", " ", " "}
                             };
    
    public void add(String symbol, int pozX, int pozY)
    {  
        board[pozX][pozY] = symbol;
    }
    
    public boolean checkWin(String symbol, int x, int y)
    {
        for(int i = 0; i < 3; i++){
            if(board[x][i] != symbol)
                break;
            if(i == 2){
                return true;
            }
        }

        for(int i = 0; i < 3; i++){
            if(board[i][y] != symbol)
                break;
            if(i == 2){
                return true;
            }
        }

        if(x == y){
            for(int i = 0; i < 3; i++){
                if(board[i][i] != symbol)
                    break;
                if(i == 2){
                    return true;
                }
            }
        }

        if(x + y == 3 - 1){
            for(int i = 0;i<3;i++){
                if(board[i][2-i] != symbol)
                    break;
                if(i == 2){
                    return true;
                }
            }
        }
 
        return false;
    }
    
    public boolean checkDraw()
    {
        int i,j;
        for (i = 0; i < 3; i++) 
        {
            for (j = 0; j < 3; j++) {
               if(board[i][j] == " ")
                   return false;
                
            }
            
        }
        return true;
    }
    
}
