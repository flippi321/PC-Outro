import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class MyMediaPlayer {
    Clip clip;
    AudioInputStream audioInputStream;

    /**
     * Empty constructor for class representing a media Player
     */
    public MyMediaPlayer(){
    }

    /**
     * Method to play a song in the background
     * @param filePath the path to the song that should be played
     * @throws LineUnavailableException if the file Path is not valid
     * @throws IOException if something is wrong when running
     * @throws UnsupportedAudioFileException if file type is not supported
     */
    public void play(String filePath) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        // create AudioInputStream object
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());

        // create clip reference
        clip = AudioSystem.getClip();

        // open audioInputStream to the clip
        clip.open(audioInputStream);

        // Start the clip
        clip.start();
    }
}