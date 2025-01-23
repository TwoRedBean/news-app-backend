package com.project.news_app_backend;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(length = 500)
    private String content;
}
