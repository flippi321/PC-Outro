import javax.swing.*;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class OutroProgram {
    private static Timer timer;

    public static void main(String[] args)  {
        try {
            //Play background music
            MyMediaPlayer audioPlayer = new MyMediaPlayer();
            audioPlayer.play("resources/TheFatRat Xenogenesis.wav");

            // Schedule the PC Shutdown
            timer = new Timer();
            timer.schedule(new Crasher(), 58400);

            // Write ominous messages
            // Will probably make the user very scared
            JOptionPane.showMessageDialog(null, "Seems like you have doomed your PC");
            JOptionPane.showMessageDialog(null, "Ur Fucked");
            JOptionPane.showMessageDialog(null, "Just give up");
            JOptionPane.showMessageDialog(null, "You still have time to save your work");
            JOptionPane.showMessageDialog(null, "I am inevitable");
            JOptionPane.showMessageDialog(null, "Come on, give up already");
            JOptionPane.showMessageDialog(null, "It's too late");
            JOptionPane.showMessageDialog(null, "Your PC is gonna turn of at the drop");
            JOptionPane.showMessageDialog(null, "And there is nothing you can do");
            JOptionPane.showMessageDialog(null, "Maybe you should just accept fate");
            JOptionPane.showMessageDialog(null, "And give up");

            // Create a stream of repeating POP up boxes, to irritate the user
            for(int i = 0; i < 25; i++){
                JOptionPane.showMessageDialog(null, "It's not too far now");
                JOptionPane.showMessageDialog(null, "A little longer...");
                JOptionPane.showMessageDialog(null, "Not too far now...");
                JOptionPane.showMessageDialog(null, "A little more...");
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static class Crasher extends TimerTask {
        public void run() {
            // Shut off the timer
            timer.cancel();
            // Create a runtime instance used for turning off the PC
            Runtime runtime = Runtime.getRuntime();
            try {
                // Turn off the PC
                runtime.exec("shutdown -s -t 0");
            } catch (IOException e) {
                // If PC can't be turned off
               JOptionPane.showMessageDialog(null, "Your PC is so Bad. It can't even TURN OFF!");
            }
        }
    }
}
