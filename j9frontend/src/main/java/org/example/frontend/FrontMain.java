package org.example.frontend;

import org.example.j9backend.BookmarksService;
import org.example.j9backend.impl.InMemoryBookmarkService;

public class FrontMain {
    public static void main(String[] args) {
        System.out.println("hello");
        BookmarksService service = new InMemoryBookmarkService();
        service.addBookmark("google");
        service.addBookmark("maps");
        service.addBookmark("gmail");

        System.out.println(service.listBookmarks());
    }
}
