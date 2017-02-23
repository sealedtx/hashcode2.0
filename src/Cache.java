import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 23.02.2017.
 */
public class Cache {

    int index;
    int size;
    long winMillis = 0;
    List<Endpoint> endpoints;

    public Cache(int index, int size, List<Endpoint> endpoints) {
        this.index = index;
        this.size = size;
        this.endpoints = new ArrayList<>();
        for (Endpoint endpoint : endpoints) {
            Long lat = endpoint.cacheList.get(index);
            if (lat != null)
                this.endpoints.add(endpoint);
        }
    }
}
