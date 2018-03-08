package com.worldwidenewsapi_wc.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.URL;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

import com.worldwidenewsapi_wc.demo.Source;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Articles {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="author")
    private String author;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="url")
    private String url;

    @Column(name="urlToImage")
    private String urlToImage;

    @Column(name="publishedAt")
    private String publishedAt;

//    private URL url;
//
//    private URL urlToImage;

//    private Date publishedAt;

   private Source source;



//    private TopNews topNews;

    public Articles() {
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
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

//    public URL getUrl() {
//        return url;
//    }
//
//    public void setUrl(URL url) {
//        this.url = url;
//    }
//
//    public URL getUrlToImage() {
//        return urlToImage;
//    }
//
//    public void setUrlToImage(URL urlToImage) {
//        this.urlToImage = urlToImage;
//    }

//    public Date getPublishedAt() {
//        return publishedAt;
//    }
//
//    public void setPublishedAt(Date publishedAt) {
//        this.publishedAt = publishedAt;
//    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
//
//    public TopNews getTopNews() {
//        return topNews;
//    }
//
//    public void setTopnews(TopNews topNews) {
//        this.topNews = topNews;
//    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }


   @Override
    public String toString(){
    return "Articles{" +

            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
               "url='" + url +'\'' +
                "urlToImage='" + urlToImage +'\'' +
                "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +




            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +




            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +



            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +


            "source='" + source +'\'' +
            "author='" + author +'\'' +
            "title='" + title +'\'' +
            "description='" + description +'\'' +
            "url='" + url +'\'' +
            "urlToImage='" + urlToImage +'\'' +
            "publishedAt='" + publishedAt +'\'' +







//                "topNews='" + topNews +'\'' +
            '}';
}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}