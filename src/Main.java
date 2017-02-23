import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 23.02.2017.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Input input = new Input(new File("input.in"));
        ArrayList<Endpoint> endpoints = input.getEndpoints();

        List<Cache> cacheList = new ArrayList<>();
        for (int i = 0; i < input.getCacheNum(); i++) {
            Cache cache = new Cache(i, input.getCacheSize(), endpoints);
            cacheList.add(cache);
        }
    }
}
