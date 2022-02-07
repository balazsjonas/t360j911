package org.example.j9backend;

import java.util.List;

public interface BookmarksService {
    List<String> listBookmarks();
    void addBookmark(String bookmark);
}
