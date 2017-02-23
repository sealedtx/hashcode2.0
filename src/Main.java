import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by User on 23.02.2017.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("input.in"));
        int V = scan.nextInt();
        int E = scan.nextInt();
        int R = scan.nextInt();
        int C = scan.nextInt();
        int X = scan.nextInt();
        int videos[] = new int[V];
        ArrayList<Endpoint> endpoints = new ArrayList<>();
        for (int i = 0; i < V; i++)
            videos[i] = scan.nextInt();
        for (int i = 0; i < E; i++) {
            HashMap<Integer, Long> cacheList = new HashMap<>();
            int datacenter = scan.nextInt();
            int cacheNum = scan.nextInt();
            for (int j = 0; j < cacheNum; j++) {
                int num = scan.nextInt();
                long lat = scan.nextLong();
                cacheList.put(num, lat);
            }
            endpoints.add(new Endpoint(datacenter, cacheList));
        }
        for (int i = 0; i < R; i++) {
            int video = scan.nextInt();
            int endpoint = scan.nextInt();
            long requests = scan.nextLong();
            endpoints.get(endpoint).addRequest(video, requests);
        }
        System.out.println("lol");
    }
}
