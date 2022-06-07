package SysNews.BL;
import SysNews.DAL.NewsDAL;
import SysNews.EL.News;
import SysNews.EL.TopHeadlines;

public class NewsBL {
    private NewsDAL dal = new NewsDAL();
    
    public TopHeadlines FindTopHead(){
        return dal.FindTopHead();
    }
    public News FindNewsByTitle(){
        return dal.FindNewsByTitle();
    }
}
