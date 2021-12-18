package streamApi;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.List.*;

public class Methods {
    public static void main(String[] args) {
        List<String> names= of("Aman", "Ankit", "Abhinav", "Chatrughan");
        List<String> newNames =names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        List<Integer> numbers= List.of(56, 45, 56, 67, 34);
        List<Integer> number= List.of(23,4,3,5,7);
        List<Integer> newNumber = number.stream().map(i -> i * i).collect(Collectors.toList());
       List<Integer> newNumbers = numbers.stream().map(i->i*i).collect(Collectors.toList());

        System.out.println(newNumbers);
        System.out.println(newNumber);
        names.stream().forEach(
                e->{
                    System.out.println(e);
                }
        );
    newNames.stream().forEach(System.out::println);

    numbers.stream().sorted().forEach(System.out::println);
    Integer integer = numbers.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("Min " + integer);
       Integer integer1 = numbers.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("Max " + integer1);
    }
}
