package t360.j9;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgsMain {

    public static void main(String[] args) {
        // Type erasure: típus parametert Objectre cserél
        // Non-reifiable types: elveszik futásidőben a típusinfo
        // List<String>[] list =new List<String>[3]; // compile error

        List<String>[] list =(List<String>[]) new List<?>[3]; // fordul, de warning

        // Heap polution
        Object[] objectArray = list; // Itt elvész a tipus információ
        objectArray[1] = List.of(1,2);
        System.out.println(list[1].get(0)); // ClassCastException : Integer->String


    }

    // nem overrideolható
    // lehet static, final vagy private
    @SafeVarargs // Nem implementálunk heap polutiont, haggyá békén.
    static void problémás(List<String>... stringList) {
        Object[] array = stringList;
        List<Integer> tmpList = Arrays.asList(42);
        array[0] = tmpList; // semantically invalid, but compiles without warning
        //String s = stringList[0].get(0); // ClassCastException at runtime
    }

}
