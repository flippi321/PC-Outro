import javax.print.attribute.standard.Media;
import javax.sound.sampled.*;
import java.io.*;

public class OutroProgram {
    String song = "song.mp3";
    Media track;

    public static void main(String[] args){
        Runtime runtime = Runtime.getRuntime();
        try
        {
            //Play background music
            MyMediaPlayer audioPlayer = new MyMediaPlayer();
            audioPlayer.play("resources/TheFatRat Xenogenesis.mp3");

            // Write ominous message
            System.out.println("Seems like you have doomed your PC");

            // Wait until the drop of the song
            Thread.sleep(57000);

            // Shut Down PC
            runtime.exec("shutdown -s -t 0");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
