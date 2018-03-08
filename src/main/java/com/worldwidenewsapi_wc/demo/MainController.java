package com.worldwidenewsapi_wc.demo;


import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/")
    public @ResponseBody String showIndex(){

        //DISPLAYS FOR SOURCE ONLY
        RestTemplate restTemplate = new RestTemplate();
        Source source = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=90e180a070b44a8ea17d3e4ad5a080c0",Source.class);

        System.out.println(source);
        return source.getId();

//        ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(TopNews.class);

//        RestTemplate restTemplate = new RestTemplate();
//        TopNews topNews = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=90e180a070b44a8ea17d3e4ad5a080c0",TopNews.class);
//        Articles articles = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=90e180a070b44a8ea17d3e4ad5a080c0", Articles.class);
//        Source source = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=90e180a070b44a8ea17d3e4ad5a080c0", Source.class);


//        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<>>();
//        //Add the Jackson Message converter
//        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        // Note: here we are making this converter to process any kind of response,
//        // not only application/*json, which is the default behaviour
//        converter.setSupportedMediaTypes(Arrays.asList());
//        messageConverters.add(converter);
//        restTemplate.setMessageConverters(messageConverters);


//        System.out.println(topNews);
//        return topNews.getStatus();




//        System.out.println(articles);
//        return articles.getAuthor();
//
//        System.out.println(source);

    }




}
