package t360.j9;

public class ProcessMain {
    public static void main(String[] args) {
        ProcessHandle.allProcesses()
        //        .forEach(p -> System.out.println(p.pid()+" - "+ p.info()))
        ;

        ProcessHandle.allProcesses()
                .filter(ph ->! ph.supportsNormalTermination())
                .forEach(p -> System.out.println(p.pid()+" - "+ p.info()));
    }
}
