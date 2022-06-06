package lambda;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sum i = x -> x + 30;
        System.out.println(i.sum(20));
        worker(() -> System.out.println("Вызов work через лямбду"));
        IsMore13 i13 = x -> x - 13 > 0;
        System.out.println(i13.isMore13(20));
        System.out.println(i13.isMore13(5));
        System.out.println(i13.isMore13(13));
        LongerString ls = (s1, s2) -> s1.length() - s2.length() >= 0 ? s1 : s2;
        System.out.println(ls.longerString("Looooonger", "Shoooooooooooooooorter"));
        Discrim di = (a, b, c) -> b * b - 4 * a * c;
        System.out.println(di.discrim(2, 2.5, 4.1));
        Discrim otherDi = (a, b, c) -> a * Math.pow(b, c);
        System.out.println(otherDi.discrim(2, 2.5, 4.1));

        List<Staff> staff = List.of(
                new Staff("Alex", "Smith", 1984, Position.CHIEF),
                new Staff("John", "Black", 1990, Position.ARCHITECT),
                new Staff("George", "Bush", 1983, Position.ARCHITECT),
                new Staff("Natale", "Wind", 1995, Position.ENGINEER),
                new Staff("Linda", "Johnson", 1993, Position.ENGINEER),
                new Staff("Tom", "Twig", 1986, Position.ENGINEER),
                new Staff("Scott", "Freedman", 1982, Position.ENGINEER),
                new Staff("Tanya", "Springfield", 1984, Position.ACCOUNTANT)
        );

        staff.stream().
                filter(x -> x.getPosition() == Position.ENGINEER).
                forEach(x -> System.out.println(x.getFirstName() + " " + x.getSecondName()));
    }
    //Some comment added
    public static void worker(Work w) {
        w.doWork();
    }

    @FunctionalInterface
    public interface Sum {
        int sum(int x);
    }

    @FunctionalInterface
    public interface Work {
        void doWork();
    }

    @FunctionalInterface
    public interface IsMore13 {
        boolean isMore13(int x);
    }

    @FunctionalInterface
    public interface LongerString {
        String longerString(String s1, String s2);
    }

    @FunctionalInterface
    public interface Discrim {
        double discrim(double a, double b, double c);
    }
}
