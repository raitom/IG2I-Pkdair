package core;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String os = System.getProperty("os.name").toLowerCase();

        if(os.contains("mac")){
            Mac.run();
        }else if (os.contains("win")){
            Windows.run();
        }
    }
}
