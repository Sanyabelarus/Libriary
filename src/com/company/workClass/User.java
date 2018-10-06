package com.company.workClass;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private Boolean hasSubscription;
    private Boolean isDebtor;
    private List <Book> books = new ArrayList<>();
    public void bookDebtor(){

    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBooks(Book book) {
        books.add(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHasSubscription() {
        return hasSubscription;
    }

    public void setHasSubscription(Boolean hasSubscription) {
        this.hasSubscription = hasSubscription;
    }

    public Boolean getDebtor() {
        return isDebtor;
    }

    public void setDebtor(Boolean debtor) {
        isDebtor = debtor;
    }


    public User(String name, Boolean hasSubscription, Boolean isDebtor) {
        this.name = name;
        this.hasSubscription = hasSubscription;
        this.isDebtor = isDebtor;
    }

    public User() {
    }
}
