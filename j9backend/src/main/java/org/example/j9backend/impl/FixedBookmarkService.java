package org.example.j9backend.impl;

import org.example.j9backend.BookmarksService;

import java.util.List;

public class FixedBookmarkService implements BookmarksService {
    @Override
    public List<String> listBookmarks() {
        return List.of("Egyetlen elem");
    }

    @Override
    public void addBookmark(String bookmark) {
        System.out.println("adding: "+ bookmark);
    }
}
