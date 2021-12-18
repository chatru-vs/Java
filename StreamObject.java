package streamApi;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamObject {
    public static void main(String[] args) {
        Stream<Object> emptyStream = Stream.empty();
        String names[]={"Durgesh ", "Uttam ", "Ankit ", "Chatrughan "};
          Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e->{
            System.out.printf(e);
            Stream<Object> streamBuilder = Stream.builder().build();
            IntStream stream2 = Arrays.stream(new int[]{2, 4, 15, 34});

        });
    }
}
