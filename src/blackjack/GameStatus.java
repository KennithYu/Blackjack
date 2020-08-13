/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Shannon Han, Kennith King Hay Yu
 */
public enum GameStatus {
    
    WELCOME ("Welcome", 0),
    SHUFFLE ("Shuffling Cards", 1),
    DEAL ("Dealing Hands", 2),
    TURN ("Signal Turn", 3),
    EVALUATE ("Evaluate Score", 4),
    END ("End", 5);
    
    private String status;
    private int statusCode;
    
    private GameStatus(String status, int statusCode) {
        this.status = status;
        this.statusCode = statusCode;
    }

    public String getStatus() {
        return status;
    }

    public int getStatusCode() {
        return statusCode;
    }
    
    
}
