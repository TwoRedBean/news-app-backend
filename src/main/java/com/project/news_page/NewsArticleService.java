package com.project.news_page;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsArticleService {
    private final NewsArticleRepository newsArticleRepository;

    public NewsArticleService(NewsArticleRepository newsArticleRepository) {
        this.newsArticleRepository = newsArticleRepository;
    }

    public List<NewsArticle> getAllArticles() {
        return newsArticleRepository.findAll();
    }

    public NewsArticle getArticlesById(Integer id) {
        return newsArticleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Article " + id + " not available"));
    }
}
