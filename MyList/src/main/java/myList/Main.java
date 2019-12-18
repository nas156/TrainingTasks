package myList;

import myList.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        //Get element with index
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );

        //List Size
        System.out.println(list.size());
    }
}
