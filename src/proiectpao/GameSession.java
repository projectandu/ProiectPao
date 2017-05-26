/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lupul
 */
public class GameSession {
    private static final int PORT = 9000;
    private static ServerSocket gameSession;
    private static HashSet<String> userName = new HashSet<String>();
    
    public static void main(String[] args) throws IOException
    {
        gameSession = new ServerSocket(PORT);
        
            while(true)
            {
                Socket player1 = gameSession.accept();
                new SessionThread(player1).start();
            }
        
    }
    
    private static class SessionThread extends Thread
    {
        private Socket player1;
        private Socket player2;
        private BufferedReader inPlayer1;
        private PrintWriter outPlayer1;
        private BufferedReader inPlayer2;
        private PrintWriter outPlayer2;
        private boolean player1Turn = true;
        private boolean player2Turn = false;
        
        public SessionThread(Socket socket)
        {
            player1 = socket;
        }
        
        @Override
        public void run()
        {
            try
            {
                inPlayer1 = new BufferedReader(new InputStreamReader(player1.getInputStream()));
                outPlayer1 = new PrintWriter(player1.getOutputStream(),true);
                
                outPlayer1.println("Waiting for second player");
                
                player2 = gameSession.accept();
                
                inPlayer2 = new BufferedReader(new InputStreamReader(player2.getInputStream()));
                outPlayer2 = new PrintWriter(player2.getOutputStream(),true);
                
            } 
            catch (IOException ex) 
            {
                System.out.println(ex);
            }
        }
    }
    
    
    
    
    
}
