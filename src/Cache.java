import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by User on 23.02.2017.
 */
public class Cache {

    int index;
    int size;
    long winMillis = 0;
    List<Endpoint> endpoints;
    HashMap<Integer, Long> usefullness;

    public Cache(int index, int size, List<Endpoint> endpoints) {
        this.index = index;
        this.size = size;
        this.endpoints = new ArrayList<>();
        this.usefullness = new HashMap<>();
        for (Endpoint endpoint : endpoints) {
            Long lat = endpoint.cacheList.get(index);
            if (lat != null)
                this.endpoints.add(endpoint);
        }
    }

    public void addVideo(int video, int videoSize) {
        long sum = 0;
        if (videoSize > this.size) {
            usefullness.put(video, -1L);
            return;
        }
        for (Endpoint endpoint : endpoints) {
            Long cachLat = endpoint.cacheList.get(index);
            Long requestNum = endpoint.requestList.get(video);
            if (requestNum != null)
                sum += requestNum * (endpoint.datacenter - cachLat);
        }
        usefullness.put(video, sum);
    }
}
