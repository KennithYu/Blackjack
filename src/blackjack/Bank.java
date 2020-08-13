/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Kennith Yu
 */
public class Bank {
    
    private int betWinnings = 0;
    private static final int baseWinnings = 500;
    
    public void disburseWinnings(Player winner) {
        winner.setWallet(betWinnings + baseWinnings);
        resetWinnings();
    }
    
    public void placeBet(Player player, int bet) {
        if (player.getWallet() < bet) {
            System.out.println(player.getName() + " does not have enough money to make the bet.");
        } else {
            player.setWallet((player.getWallet() - bet));
            betWinnings += bet;
        }
    }
    
    public void resetWinnings() {
        betWinnings = 0;
    }
    
}
