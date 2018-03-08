package com.worldwidenewsapi_wc.demo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TopNews {


    private String status;

    private int totalResults;

    private Articles articles;

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

    public Articles getArticles() {
        return articles;
    }

    public void setArticles(Articles articles) {
        this.articles = articles;
    }

    @Override
    public String toString(){
        return "TopNews{" +
                "status='" + status +'\'' +
                "totalResults='" + totalResults +'\'' +
                "articles='" + articles +'\'' +
                '}';
    }


}
