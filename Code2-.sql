/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Thuy
 * Created: 16 mai 2023
 */

import java.util.*;

public class code2-{
	
	public static void main (String[] args) {
		
    private char[][] board;
    private char currentPlayer;
}
    public void TicTacToe(){
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hasPlayerWon(char player) {
        // Vérification des lignes
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Vérification des colonnes
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        

        // Vérification des diagonales
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
		}
        return false;
    }

    private int evaluateBoard() {
        if (hasPlayerWon('X')) {
            return 1; // Le joueur X a gagné
        } else if (hasPlayerWon('O')) {
            return -1; // Le joueur O a gagné
        } else {
            return 0; // Match nul
        }
    }

    private int minimax(int depth, boolean isMaximizingPlayer) {
        int score = evaluateBoard();

        if (score == 1 || score == -1) {
            return score;
        }

        if (isBoardFull()) {
            return 0;
        }

        if (isMaximizingPlayer) {
            int bestScore = Integer.MIN_VALUE;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        board[i][j] = 'X';
                        int currentScore = minimax(depth + 1, false);
                        board[i][j] = '-';
                        bestScore = Math.max(bestScore, currentScore);
                    }
                }
            }

            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;

            for (int i=0; i<3; i++) {
                for (int j=0; j<3; j++) {
                    if (board[i][j] == '-') {
                        board[i][j] = 'O';
                        int currentScore = minim;

			}}}}}

    public int findBestMove() {
        int bestScore = Integer.MIN_VALUE;
        int bestMove = -1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    board[i][j] = 'X'; // Supposons que c'est le tour du joueur X
                    int currentScore = minimax(0, false);
                    board[i][j] = '-';

                    if (currentScore > bestScore) {
                        bestScore = currentScore;
                        bestMove = 3 * i + j; // Conversion des coordonnées de la grille en un index unique
                    }
                }
            }
        }

        return bestMove;
    }

    public void play() {
		
        // ... Logique du jeu

        // C'est le tour de l'ordinateur
        int bestMove = findBestMove();
        int row = bestMove / 3;
        int col = bestMove % 3;
        board[row][col] = 'X';

        // ... Continuer le jeu
		}
	}

