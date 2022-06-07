package SysNews.DAL;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import SysNews.EL.TopHeadlines;


public class DbContext {
    private String baseUrl = "https://newsapi.org";
    private String apiKey = "&apiKey=94fd7c3d036a420da3ead46ec93b6add";
    
    private String country = "country=us";
    public String urlTopHead = baseUrl + "/v2/top-headlines?" + country + apiKey;
    
    // Chipotle%20now%20accepts%20cryptocurrency%20payments
    private String query = "q=New%20York%20passes%20a%20bill%20to%20limit%20bitcoin%20mining&apiKey=94fd7c3d036a420da3ead46ec93b6add";
    private String domains = "&domains=engadget.com";
    private String searchIn = "&searchIn=title";
    public String urlEverything = baseUrl + "/v2/everything?" + query + domains + searchIn + apiKey;

    public DbContext(){
    }
    
    
    public String get(String source){
        try{
            URL url = new URL(source);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();
            
            int resCode = conn.getResponseCode();
            if(resCode != 200)
                throw new RuntimeException("Hubo un error");
            
            String rawData = "";
            Scanner sc = new Scanner(url.openStream());
            while(sc.hasNext()){
                rawData += sc.nextLine();
            }
            sc.close();
            return rawData;
        }catch(Exception e){
            System.out.println(e);
            return "";
        }
    }
}
