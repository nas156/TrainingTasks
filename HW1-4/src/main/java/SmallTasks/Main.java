package SmallTasks;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 1, 2, 3, 4, 5, -19, 70, 0, 5};
        int[] b = {};
        int[] c = {0};
        findMinElemWithIndex(c);
    }

    private static void task1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                System.out.print(a[i]);
            }
            System.out.println();
        }
//        00000
//        1111
//        222
//        33
//        4
    }

    private static void task2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                System.out.print(a[j]);
            }
            System.out.println();
        }
//        01234
//        0123
//        012
//        01
//        0
    }

    private static void task3(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                System.out.print(a[j]);
            }
            System.out.println();
        }
//        01234
//        1234
//        234
//        34
//        4
    }

    private static void findMinElemWithIndex(int[] a) {
        if (a != null && a.length>0){
            if (a.length==1) System.out.println("Index = " + 0 + ", Min elem = " + a[0]);
            else {
                int index = 0;
                int minElem = a[0];
                for (int i = 1; i < a.length; i++) {
                    if (a[i] < minElem) {
                        index = i;
                        minElem = a[i];
                    }
                }
                System.out.println("Index = " + index + ", Min elem = " + minElem);
            }
        }else System.out.println("Null");
    }

    private static void findMaxElemWithIndex(int[] a) {
        int index = 0;
        int maxElem = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maxElem) {
                index = i;
                maxElem = a[i];
            }
        }
        System.out.println("Index = " + index + ", Max elem = " + maxElem);
    }

    private static void countNunOfEqualToFirstElements(int[] a){
        int firstElem = a[0];
        int counter= 0;
        for (int i = 1; i <a.length ; i++) {
            if (a[i] == firstElem){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
