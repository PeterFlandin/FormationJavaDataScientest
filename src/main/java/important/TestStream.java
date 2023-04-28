package important;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {

        // Création d'un stream à partir d'un tableau

        System.out.println("****stream1");
        List<String> maListe = Arrays.asList("a1", "a2", "b2", "b1", "c1");
        Stream<String> words0 = maListe.stream();
        words0.forEach(System.out::println);

        System.out.println("****stream2");
        String line = "Je m'appelle Meriam";
        Stream<String> words = Stream.of(line.split(" ")).skip(2);
        words.forEach(System.out::println);

        System.out.println("****stream3");
        Stream<String> words1 = Arrays.stream(line.split(" "), 1, 3);
        words1.forEach(System.out::println);

        // Creation d'un stream infini
        // System.out.println("****stream4");
        // Stream<Double> randDoubles = Stream.generate(Math::random).limit(100);
        // randDoubles.forEach(System.out::println);

        // Stream<String> echos = Stream.generate(() -> "Echo");
        // echos.forEach(System.out::println);

        // Stream<Integer> intSeq = Stream.iterate(0, n -> n.intValue() + 1);
        // intSeq.forEach(System.out::println);
        System.out.println("****stream5");
        List<String> strings = Arrays.asList("girafe", "chameau", "chat", "poisson", "cachalot");
        long count = strings.stream().filter(w -> w.length() > 7).count();
        System.out.println(count);

        System.out.println("****stream6");
        List<String> strings1 = Arrays.asList("girafe", "chameau", "chat", "poisson", "cachalot");
        Stream<String> firstLetters = strings1.stream().map(s -> s.substring(0, 1));
        firstLetters.forEach(System.out::println);

    }
}