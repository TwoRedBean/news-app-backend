package com.project.news_page;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "news_articles")
public class NewsArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
