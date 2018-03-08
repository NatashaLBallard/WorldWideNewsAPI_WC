package com.worldwidenewsapi_wc.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static javax.print.DocFlavor.READER.TEXT_PLAIN;



@Controller
public class MainController {




    @RequestMapping("/")
    public @ResponseBody String showIndex(){

        //DISPLAYS FOR SOURCE ONLY
//        RestTemplate restTemplate = new RestTemplate();
//        Source source = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=90e180a070b44a8ea17d3e4ad5a080c0",Source.class);
//
//        System.out.println(source);
//        return source.getId();



//        //DISPLAYS FOR TOPNEWS
        RestTemplate restTemplate = new RestTemplate();
        TopNews topNews = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=90e180a070b44a8ea17d3e4ad5a080c0",TopNews.class);

        System.out.println(topNews);
        return topNews.getStatus();


//        //DISPLAYS FOR Articles - weird variable types
//        RestTemplate restTemplate = new RestTemplate();
//        Articles articles = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=90e180a070b44a8ea17d3e4ad5a080c0",Articles.class);
//
//        System.out.println(articles);
//        return articles.getAuthor();


//
//        RestTemplate restTemplate = new RestTemplate();
//        TopNews topNews = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&apiKey=90e180a070b44a8ea17d3e4ad5a080c0",TopNews.class);
//
//        System.out.println(topNews);
//        return topNews.toString();






//        ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
//        RestTemplate restTemplate = new RestTemplate(requestFactory);

//

//        final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        final List<MediaType> supportedMediaTypes = new LinkedList<MediaType>(converter.getSupportedMediaTypes());
//        final MediaType textJavascriptMediaType = new MediaType("application", "*+json", MappingJackson2HttpMessageConverter.DEFAULT_CHARSET);
//        supportedMediaTypes.add(textJavascriptMediaType);
//        converter.setSupportedMediaTypes(supportedMediaTypes);
//        restTemplate.getMessageConverters().add(converter);

//        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
//        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
//        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

//        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
//        //Add the Jackson Message converter
//        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//        // Note: here we are making this converter to process any kind of response,
//        // not only application/*json, which is the default behaviour
//        converter.setSupportedMediaTypes(Arrays.asList());
//        messageConverters.add(converter);
//        restTemplate.setMessageConverters(messageConverters);






//        ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(TopNews.class);

//        RestTemplate restTemplate = new RestTemplate();
//        TopNews topNews = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=90e180a070b44a8ea17d3e4ad5a080c0",TopNews.class);
//        Articles articles = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=90e180a070b44a8ea17d3e4ad5a080c0", Articles.class);
//        Source source = restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=90e180a070b44a8ea17d3e4ad5a080c0", Source.class);





//        System.out.println(topNews);
//        return topNews.getStatus();




//        System.out.println(articles);
//        return articles.getAuthor();
//
//        System.out.println(source);

    }



//    @RequestMapping("/test")
//    public @ResponseBody String showTest(){
//        RestTemplate restTemplate = new RestTemplate();
//        Horoscope quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random",Horoscope.class);
//
//
//        System.out.println(quote);
//        return quote.getValue().getQuote();
//    }

}
