package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class StandardSupplierStorage implements SupplierStorage{
    private final List<StorageArticle> storageArticleList = new ArrayList<>();

    @Override
    public StorageArticle getArticleByEan(String ean) {
        return storageArticleList.stream()
                .filter(article -> article.getEan().equals(ean))
                .findFirst().get();
    }

    @Override
    public void addArticleToStorage(StorageArticle article) {
        storageArticleList.add(article);
    }
}
