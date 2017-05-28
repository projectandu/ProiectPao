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
import java.util.Scanner;
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
    private static boolean free = true;

    public static void main(String[] args) throws IOException {
        gameSession = new ServerSocket(PORT);

        while (true) {
            if (free) {
                Socket player = gameSession.accept();
                free = false;
                new SessionThread(player).start();
            }

        }

    }

    private static class SessionThread extends Thread {

        private Socket player1;
        private Socket player2;
        private BufferedReader inPlayer1;
        private PrintWriter outPlayer1;
        private BufferedReader inPlayer2;
        private PrintWriter outPlayer2;
        private boolean player1Turn = true;
        private boolean player2Turn = false;
        private boolean win = false;
        private boolean tie = false;
        private boolean replay = true;
        private boolean finish = false;

        public SessionThread(Socket socket) {
            player1 = socket;
        }

        @Override
        public void run() {
            try {
                System.out.println("Session started!");
                inPlayer1 = new BufferedReader(new InputStreamReader(player1.getInputStream()));
                outPlayer1 = new PrintWriter(player1.getOutputStream(), true);
                outPlayer1.println("X");
                player2 = gameSession.accept();
                free = true;
                inPlayer2 = new BufferedReader(new InputStreamReader(player2.getInputStream()));
                outPlayer2 = new PrintWriter(player2.getOutputStream(), true);
                outPlayer2.println("0");
                X_0 board = new X_0();
                while (replay) {
                    board.clear();
                    int input;
                    replay = false;
                    while (!win && !tie) {
                        if (player1Turn) {
                            input = Integer.parseInt(inPlayer1.readLine());
                            System.out.println(input);
                            board.add("X", input);
                            outPlayer2.println(String.valueOf(input));
                            win = board.checkWin("X");
                            tie = board.checkDraw();
                            if (win) {
                                outPlayer1.println("10");
                                outPlayer2.println("-10");
                            } else if (tie) {
                                outPlayer1.println("11");
                                outPlayer2.println("11");
                            } else {
                                outPlayer1.println("0");
                                outPlayer2.println("0");
                            }
                            player1Turn = false;
                            player2Turn = true;
                        } else if (player2Turn && !win && !tie) {
                            input = Integer.parseInt(inPlayer2.readLine());
                            System.out.println(input);
                            board.add("0", input);
                            outPlayer1.println(String.valueOf(input));
                            win = board.checkWin("0");
                            tie = board.checkDraw();
                            if (win) {
                                outPlayer1.println("-10");
                                outPlayer2.println("10");
                            } else if (tie) {
                                outPlayer1.println("11");
                                outPlayer2.println("11");
                            } else {
                                outPlayer1.println("0");
                                outPlayer2.println("0");
                            }
                            player2Turn = false;
                            player1Turn = true;
                        }
                    }
                    String replay1 = "";
                    String replay2 = "";
                    finish = false;
                    while (!finish) {
                        if (inPlayer1.ready()) {
                            replay1 = inPlayer1.readLine();
                            replay2 = inPlayer2.readLine();
                            finish = true;
                        } else if (inPlayer2.ready()) {
                            replay2 = inPlayer2.readLine();
                            replay1 = inPlayer1.readLine();
                            finish = true;
                        }
                    }
                    if (replay1.startsWith("Replay!") && replay2.startsWith("Replay!")) {
                        replay = true;
                        win = false;
                        tie = false;
                    } else {
                        replay = false;
                    }
                }

            } catch (IOException ex) {
                System.out.println(ex);
            } finally {
                System.out.println("END");
            }
        }
    }

}
