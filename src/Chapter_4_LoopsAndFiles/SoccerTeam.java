package Chapter_4_LoopsAndFiles;

import javax.swing.*;
public class SoccerTeam {
    public static void main(String[] args) {

        final int MAX_PLAYERS = 15;
        final int MIN_PLAYERS = 9;
        int players;
        int teamSize;
        int teams;

        String input = JOptionPane.showInputDialog("Enter the number of players per team");
        teamSize = Integer.parseInt(input);

        while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS){
            input=JOptionPane.showInputDialog("The number of players must be at least " +
                   MIN_PLAYERS +" and at most "+ MAX_PLAYERS + "\n Enter the number of players");
                    teamSize = Integer.parseInt(input);
        }
        input = JOptionPane.showInputDialog("Enter the number of available players");
        players = Integer.parseInt(input);

        while ( players < 0){
            input = JOptionPane.showInputDialog("Enter 0 or greater");
            players = Integer.parseInt(input);
        }
        teams = players / teamSize;
        int leftOverPlayers = players % teamSize;
        JOptionPane.showMessageDialog(null,"Teams: "+teams +"\nLeft over players "+ leftOverPlayers);
    }
}
