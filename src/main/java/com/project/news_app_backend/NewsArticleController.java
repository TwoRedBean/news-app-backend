package com.project.news_app_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class NewsArticleController {
    private final NewsArticleService newsArticleService;

    public NewsArticleController(NewsArticleService newsArticleService) {
        this.newsArticleService = newsArticleService;
    }

    @GetMapping
    public List<NewsArticle> getAllArticles() {
        return newsArticleService.getAllArticles();
    }

    @GetMapping(path = "/{id}")
    public NewsArticle getAllArticles(@PathVariable Integer id) {
        return newsArticleService.getArticlesById(id);
    }
}
