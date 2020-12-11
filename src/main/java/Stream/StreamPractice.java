package Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");

        boolean isExist = list.stream().anyMatch(e -> e.contains("a"));
        System.out.println(isExist);

        Stream<String> filter = list.stream().filter(Compare::isB);
        filter.forEach(System.out::println);

        Stream<String> map = list.stream().map(String::toUpperCase); // A, B, C
        map.forEach(System.out::println);


        String reducce = list.stream().reduce("1", (a, b) -> a + b); // 1abc
        System.out.println(reducce);


        final List<String> names = Arrays.asList("Sehoon", "Songwoo", "Chan", "Youngsuk", "Dajung", "kimhyunjin");
        String LongerEliment1  = "";
        for (String name : names) {
            if(("hoone".length() <= name.length()) && (LongerEliment1.length() <= name.length())) {
                LongerEliment1 = name;
            }
        }
        System.out.println("java 7 "+LongerEliment1);

        String LongerEliment2 = names.stream()
                .reduce("hoone", (name1, name2) ->
                        name1.length() >= name2.length() ? name1 : name2);
        System.out.println("java 8 "+LongerEliment2);

        List<String> resultList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(resultList);


        Stream<Double> doubleStream = Stream.of(4.1, 2.4, 55.55, 33.33);
        doubleStream.forEach(System.out::println);

        IntStream intStream = IntStream.range(1, 10);
        intStream.forEach((e) -> System.out.print(e));
        System.out.println();

        IntStream intStream2 = IntStream.rangeClosed(1, 10);
        intStream2.forEach((e) -> System.out.print(e));


        System.out.println();
        System.out.println();


        IntStream randomIntStram = new Random().ints(10);
        randomIntStram.forEach(System.out::println);


        IntStream distinctStream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        IntStream distinctStream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        distinctStream1.distinct().forEach(System.out::print);
        System.out.println();
        distinctStream2.filter(n -> n%2 !=0).forEach(System.out::println);
        System.out.println();

        Stream<String> mapStream = Stream.of("java", "html", "css", "push", "asdsfsadfasdfasdfasdfasdfasdf");
        mapStream.map(s-> s.length()).forEach(System.out::println);

        String[] arr = {"I study hard", "You study JAVA", "I am hungry"};
        Stream<String> arrStream = Arrays.stream(arr);
        arrStream.flatMap(s->Stream.of(s.split(" "))).forEach(System.out::println);


        IntStream streamPeeek = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);


        streamPeeek.peek(s-> System.out.println("원본 스트림 : " + s))
                .skip(6)
                .peek(s-> System.out.println("skip(2) 후 스트림 : " + s))
                .forEach(System.out::println);


    }
}
