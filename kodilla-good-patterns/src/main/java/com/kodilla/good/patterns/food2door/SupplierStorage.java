package com.kodilla.good.patterns.food2door;

interface SupplierStorage {
    StorageArticle getArticleByEan(String ean);
    void addArticleToStorage(StorageArticle article);
}
