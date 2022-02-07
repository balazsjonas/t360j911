package org.example.j9backend.impl;

import org.example.j9backend.BookmarksService;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBookmarkService implements BookmarksService {
    private static final List<String> BOOKMARKS = new ArrayList<>();
    @Override
    public List<String> listBookmarks() {
        return new ArrayList<>(BOOKMARKS);
    }

    @Override
    public void addBookmark(String bookmark) {
BOOKMARKS.add(bookmark);
    }
}
