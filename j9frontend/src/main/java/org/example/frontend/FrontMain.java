package org.example.frontend;

import org.example.j9backend.BookmarksService;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;


public class FrontMain {
    public static void main(String[] args) {
        System.out.println("hello");
        List<BookmarksService> services = ServiceLoader.load(BookmarksService.class).stream()
                .map(ServiceLoader.Provider::get).collect(Collectors.toList());
        services.forEach(s -> System.out.println(s.getClass().getSimpleName()));
        BookmarksService service =
                services.stream()
                        .filter(p -> !p.getClass().getSimpleName().contains("Fix"))
                                .findFirst().orElseThrow(IllegalStateException::new);
        service.addBookmark("google");
        service.addBookmark("maps");
        service.addBookmark("gmail");

        System.out.println(service.listBookmarks());
    }

}
