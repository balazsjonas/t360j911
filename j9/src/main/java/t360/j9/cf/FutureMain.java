package t360.j9.cf;

import java.util.concurrent.CompletableFuture;

public class FutureMain {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 1);

    }
}
