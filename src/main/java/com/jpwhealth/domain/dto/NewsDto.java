package com.jpwhealth.domain.dto;

import com.jpwhealth.domain.News;
import com.jpwhealth.domain.Topic;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class NewsDto {

    private Long id;
    private String title;
    private String subTitle;
    private String author;
    private String message;
    private String imageUrl;
    private List<Topic> topic;
    private LocalDateTime dateRegister;

    public NewsDto() {
    }

    public NewsDto(News news) {
        this.id = news.getId();
        this.title = news.getTitle();
        this.subTitle = news.getSubTitle();
        this.message = news.getMessage();
        this.imageUrl = news.getImageUrl();
        this.author = news.getAuthor();
        this.topic = news.getTopics();
        this.dateRegister = news.getDateRegister();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public List<Topic> getTopic() {
        return topic;
    }

    public LocalDateTime getDateRegister() {
        return dateRegister;
    }
}
