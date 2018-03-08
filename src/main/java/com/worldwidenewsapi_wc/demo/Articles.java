package com.worldwidenewsapi_wc.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.URL;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Articles {


    private String author;

    private String title;

    private String description;

    private URL url;

    private URL urlToImage;

    private Date publishedAt;

    private Source source;

    public Articles() {
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTile() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public URL getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(URL urlToImage) {
        this.urlToImage = urlToImage;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    @Override
    public String toString(){
        return "Articles{" +
                "author='" + author +'\'' +
                "title='" + title +'\'' +
                "description='" + description +'\'' +
                "url='" + url +'\'' +
                "urlToImage='" + urlToImage +'\'' +
                "publishedAt='" + publishedAt +'\'' +
                "source='" + source +'\'' +
                '}';
    }
}
