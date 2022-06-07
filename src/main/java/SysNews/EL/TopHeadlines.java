package SysNews.EL;

import java.util.ArrayList;
import com.google.gson.Gson;


public class TopHeadlines {
    public String status;
    public int totalResults;
    public ArrayList<News> articles;
    
    public static TopHeadlines SerializeToJSON(String rawData){
        Gson g = new Gson();
        TopHeadlines thData = g.fromJson(rawData, TopHeadlines.class);
        return thData;
    }
}
