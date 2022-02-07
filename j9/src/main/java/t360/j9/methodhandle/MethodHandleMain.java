package t360.j9.methodhandle;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.VarHandle;

public class MethodHandleMain {

    public static void main(String[] args) throws Throwable {
        Employee johnDoe = new Employee("John Doe", 1982);
        MethodType stringMethod = MethodType.methodType(String.class);
        MethodHandle getName = MethodHandles.lookup().findVirtual(Employee.class, "getName", stringMethod);
        System.out.println(getName.invoke(johnDoe));

        VarHandle varHandle =
                MethodHandles.privateLookupIn(Employee.class, MethodHandles.lookup())
                        .findVarHandle(Employee.class, "name", String.class);
        System.out.println(varHandle.get(johnDoe));

        System.out.println(johnDoe.getAge());

    }
}
