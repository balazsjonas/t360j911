package t360.j9;

import io.reactivex.rxjava3.core.Flowable;
import reactor.core.publisher.Flux;
import t360.j9.methodhandle.Employee;

import java.util.List;
import java.util.concurrent.Flow;

public class ReactiveMain {

    private static final List<Employee> EMPLOYEES = List.of(
            new Employee("John Doe", 34),
            new Employee("Jane Doe", 40),
            new Employee("James Doe", 20),
            new Employee("John Smith", 30)
    );
    public static void main(String[] args) {
        // reactor:
        System.out.println("Reactor");
        Flux.fromIterable(EMPLOYEES)
                .filter(e -> e.getAge()>30)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .subscribe(System.out::println);
        System.out.println("---------");

        // RxJava
        System.out.println("RxJava");
        Flowable.fromIterable(EMPLOYEES)
                .filter(e -> e.getAge()>30)
                .map(Employee::getName)
                .map(String::toUpperCase)
                .subscribe(System.out::println);
        System.out.println("---------");

        // vegyesen
        System.out.println("Vegyes");
        Flux.from(Flowable.fromIterable(EMPLOYEES)
                .filter(e -> e.getAge()>30)
                .map(Employee::getName))

                .map(String::toUpperCase)
                .subscribe(System.out::println);
    }
}
