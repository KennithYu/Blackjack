package blackjack;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Kennith Yu
 */
public class SaveAndLoadSystem {
    
    public static void savePlayers(Player player1, Player player2) {
       
        try {
            FileOutputStream f = new FileOutputStream(new File("Save Files/Players.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            
            o.writeObject(player1);
            o.writeObject(player2);
            
            f.close();
            o.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error initializing stream.");
        }
    }
    
    public static Player[] loadPlayers() {
        Player[] players = new Player[2];
        try {
            FileInputStream fi = new FileInputStream(new File("Save Files/Players.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            
            players[0] = (Player) oi.readObject();
            players[1] = (Player) oi.readObject();
            
            fi.close();
            oi.close();
        
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            return players;
        }
    }
    
}
