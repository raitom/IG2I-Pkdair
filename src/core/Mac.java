package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Mac{

    public static void run() throws IOException {
        System.out.println("Mac !");

        String[] cmd = { "osascript", "-e",   "tell application \"Finder\"\n" +
                "\topen location \"smb://192.168.1.1\"\n" +
                "end tell" };
        Process process = Runtime.getRuntime().exec(cmd);

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(process.getErrorStream()));
        String lsString;
        while ((lsString = bufferedReader.readLine()) != null) {
            System.out.println(lsString);
        }
    }

}
