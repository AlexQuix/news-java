package SysNews.EL;

import com.google.gson.Gson;
import java.util.ArrayList;


public class Everything {
    public String status;
    public int totalResults;
    public ArrayList<News> articles;
    
    public static Everything SerializeToJSON(String rawData){
        Gson g = new Gson();
        return g.fromJson(rawData, Everything.class);
    }
}
