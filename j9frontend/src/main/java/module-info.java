import org.example.j9backend.BookmarksService;

module bookmarks.j9frontend {
    requires bookmarks.j9backend;
    uses BookmarksService;
}