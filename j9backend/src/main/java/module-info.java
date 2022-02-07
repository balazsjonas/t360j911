import org.example.j9backend.BookmarksService;

module bookmarks.j9backend {
    exports org.example.j9backend;
    provides BookmarksService with org.example.j9backend.impl.InMemoryBookmarkService,
            org.example.j9backend.impl.FixedBookmarkService;
}