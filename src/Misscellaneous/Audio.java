package Misscellaneous;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.Scanner;

public class Audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner keyboard = new Scanner(System.in);

        File file = new File("C:\\Users\\colle\\IdeaProjects\\" +
                "Programming Exercise\\src\\Misscellaneous\\Doc and Wyatt - Everet Almond.wav");

        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);


        String respond = "";

        while (!respond.equals("q")){
            System.out.println("P = Play, S= Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice");
            respond = keyboard.next().toUpperCase();

            switch (respond) {
                case "P":
                    clip.start();
                    break;
                case "S":
                    clip.stop();
                    break;
                case "R":
                    clip.setMicrosecondPosition(0);
                    break;
                case "Q":
                    clip.stop();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input! Please try again");
            }
        }
    }

}
