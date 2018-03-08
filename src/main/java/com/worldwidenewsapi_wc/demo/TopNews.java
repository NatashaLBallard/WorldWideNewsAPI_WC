package com.worldwidenewsapi_wc.demo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TopNews {

    private static final Logger log = LoggerFactory.getLogger(TopNews.class);

    private String status;

    private int totalResults;

//    private Articles articles;

//    private Source source;

    public TopNews() {
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

//    public Articles getArticles() {
//        return articles;
//    }
//
//    public void setArticles(Articles articles) {
//        this.articles = articles;
//    }

//    public Source getSource() {
//        return source;
//    }
//
//    public void setSource(Source source) {
//        this.source = source;
//    }

    @Override
    public String toString(){
        return "TopNews{" +
                "status='" + status +'\'' +
                "totalResults='" + totalResults +'\'' +
//                "articles='" + articles +'\'' +
//                "source='" + source +'\'' +
                '}';
    }



}
