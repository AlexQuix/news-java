package SysNews.DAL;

import com.google.gson.Gson;
import SysNews.EL.Everything;
import SysNews.EL.News;
import SysNews.EL.TopHeadlines;

public class NewsDAL {
    private DbContext context = new DbContext();
    
    public TopHeadlines FindTopHead(){
        String rawData = context.get(context.urlTopHead);
        TopHeadlines data = TopHeadlines.SerializeToJSON(rawData);
        return data;
    }
    public News FindNewsByTitle(){
        String rawData = context.get(context.urlEverything);
        Everything data = Everything.SerializeToJSON(rawData);
        if(data.totalResults >= 1){
            return data.articles.get(0);
        }
        return new News();
    }
}
