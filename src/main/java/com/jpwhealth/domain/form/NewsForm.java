package com.jpwhealth.domain.form;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotNull;
import java.util.List;

public class NewsForm {

    @NotNull
    private String title;

    @NotNull
    private String subTitle;

    @NotNull
    private String author;

    @NotNull
    private String message;

    @NotNull
    private String imageUrl;

    @NotNull
    @NumberFormat
    private List<Long> topicId;

    public NewsForm(@NotNull String title, @NotNull String subTitle, @NotNull String author, @NotNull String message, @NotNull String imageUrl, @NotNull List<Long> topicId) {
        this.title = title;
        this.subTitle = subTitle;
        this.author = author;
        this.message = message;
        this.imageUrl = imageUrl;
        this.topicId = topicId;
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

    public List<Long> getTopicId() {
        return topicId;
    }

}
