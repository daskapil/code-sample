package com.kapil.learn.collections;

/*
 * Item 43: Return empty array or collection; nol null
 * */

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class BestPractices {

    private static final String[] EMPTY_ARRAY = new String[0];

    public String[] getBookTitlesByAuthorArray(String author) {
        //Idiom for returning Array from a Collection
        Dao dao = new BookImpl();
        List<String> titles = dao.getBookTitlesByAuthor(author);
        return titles.toArray(EMPTY_ARRAY);
    }

    public List<String> getBookTitlesByAuthorList(String author) {
        //Idiom for returning empty immutable Collection
        Dao dao = new BookImpl();
        List<String> titles = dao.getBookTitlesByAuthor(author);
        if(titles.isEmpty()){
            return Collections.emptyList();
        }

        return titles;
    }
}

class Book1 {

    private String title;
    private String author;

    // constructors / standard setters / getters
}

interface Dao<T> {

    List<T> getBookTitlesByAuthor(String author);
}

class BookImpl implements Dao {

    @Override
    public List getBookTitlesByAuthor(String author) {
        return null;
    }
}
