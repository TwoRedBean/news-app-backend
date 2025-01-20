package com.project.news_page;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class NewsArticleController {
    private final NewsArticleRepository newsArticleRepository;

    public NewsArticleController(NewsArticleRepository newsArticleRepository) {
        this.newsArticleRepository = newsArticleRepository;
    }

    @GetMapping
    public List<NewsArticle> getAllArticles() {
        return newsArticleRepository.findAll();
    }
}
