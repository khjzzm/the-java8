package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class List {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");

        Iterator<String> stringIterator = list.iterator();
//        while (stringIterator.hasNext()){
//            System.out.println(stringIterator.next());
//        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(4);

        Iterator<Integer> integerLinkedList = linkedList.iterator();
//        while (integerLinkedList.hasNext()){
//            System.out.println(integerLinkedList.next());
//        }

//        for (Integer i: linkedList) {
//            System.out.println(i);
//        }

        list.forEach(System.out::println);


        IntStream.of(1,2,3,4,5);

        IntStream.iterate(0, i -> ( i + 1 ) % 2)
                .limit(10)
                .distinct()
                .forEach(System.out::println);
        System.out.println("complete");

    }
}
