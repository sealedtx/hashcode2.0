import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by User on 23.02.2017.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Input input = new Input(new File("input.in"));
        ArrayList<Endpoint> endpoints = input.getEndpoints();
        int cacheNum = input.getCacheNum();
        int cacheSize = input.getCacheSize();
    }
}
