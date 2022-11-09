import java.io.*;

public class OutroProgram {
    public static void main(String[] args){
        Runtime runtime = Runtime.getRuntime();
        try
        {
            System.out.println("Shutting down the PC after 5 seconds.");
            runtime.exec("shutdown -s -t 5");

            System.out.println("Countdown:");
            for(int i = 5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(IOException | InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
