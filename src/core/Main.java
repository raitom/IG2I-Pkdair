package core;

/**
 * Created by tgeselle on 13/04/15.
 */
public class Main {
    public static void main(String[] args){
        String os = System.getProperty("os.name").toLowerCase();

        if(os.indexOf("mac") >= 0){
            System.out.println("Mac !");
        }else if (os.indexOf("win") >= 0){
            System.out.println("Windows !");
        }
    }
}
