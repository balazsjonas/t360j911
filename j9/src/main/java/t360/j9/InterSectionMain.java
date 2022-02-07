package t360.j9;

interface A {}
interface B {}
class C1 implements A, B{}
class C2 implements A, B {}
class C3 implements A {}

public class InterSectionMain {

    public static void main(String[] args) {
        System.out.println(pick(new C1(), new C2()));
        System.out.println("-----");
        System.out.println(valami(new C1(), new C1()));
        System.out.println(valami(new C1(), new C2()));
        //System.out.println(valami(new C1(), new C3()));

    }

    static <T> String pick(T t1, T t2) {
        System.out.println(t1.getClass().getSimpleName());
        System.out.println(t2.getClass().getSimpleName());
        return t1.getClass().getSimpleName();
    }

    static <T extends A & B> String valami(T t1, T t2) {

        return t1.getClass().getSimpleName() + t2.getClass().getSimpleName();
    }
}
