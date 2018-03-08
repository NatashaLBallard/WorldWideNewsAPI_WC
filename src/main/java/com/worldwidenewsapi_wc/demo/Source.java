package com.worldwidenewsapi_wc.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Source {

    private String id;

    private String name;

//    private Articles articles;
//
//    private TopNews topNews;

    public Source() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Articles getArticles() {
//        return articles;
//    }
//
//    public void setArticles(Articles articles) {
//        this.articles = articles;
//    }

//


    @Override
    public String toString(){
        return "Source{" +
                "id='" + id +'\'' +
                "name='" + name +'\'' +
               // "articles='" + articles +'\'' +
                '}';
    }



}
