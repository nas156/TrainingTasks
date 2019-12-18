package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Tasks {
    public static void main(String[] args) {
        int[] mass1 = {1, 5, 7, 8, 4, 7, 9, 0, 1, 4};
        List<Integer> mass2 = new ArrayList<Integer>();
        IntStream.of(mass1).forEach(mass2::add);
        double m1Average1 = IntStream.of(mass1).mapToDouble(a -> a).map(a -> a / mass1.length).sum();
        double m1Average2 = IntStream.of(mass1).mapToDouble(a -> a).average().getAsDouble();
        double m2Average1 = mass2.stream().mapToDouble(a -> a).map(a -> a / mass2.size()).sum();
        double m2Average2 = mass2.stream().mapToDouble(a -> a).average().getAsDouble();
        System.out.println(m1Average1);
        System.out.println(m1Average2);
        System.out.println(m2Average1);
        System.out.println(m2Average2);
        System.out.println("==========================");
        long zeroNumbers1 = IntStream.of(mass1).filter(x -> x == 0).count();
        long zeroNumbers2 = mass2.stream().filter(x -> x == 0).count();
        System.out.println(zeroNumbers1);
        System.out.println(zeroNumbers2);
        System.out.println("==========================");
        long numbersBiggerZero1 = IntStream.of(mass1).filter(x -> x > 0).count();
        long numbersBiggerZero2 = mass2.stream().filter(x -> x > 0).count();
        System.out.println(numbersBiggerZero1);
        System.out.println(numbersBiggerZero2);
        System.out.println("==========================");
        int multipleNumber = 2;
        int[] multipedMass1 = IntStream.of(mass1).map(x -> x * multipleNumber).toArray();
        System.out.println(Arrays.toString(multipedMass1));

    }
}

