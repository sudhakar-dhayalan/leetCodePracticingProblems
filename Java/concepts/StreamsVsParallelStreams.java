package concepts;

import java.util.stream.IntStream;

public class StreamsVsParallelStreams {
    private static int TIMES = 3;

    public static void main(String[] args) {
        var sum1 = IntStream.rangeClosed(1, 10)
                .parallel()
                .reduce(0, Integer::sum);
        System.out.println("Concurrent modification is safe : " + sum1);

        var sum2 = IntStream.rangeClosed(1, 10)
                .parallel()
                .reduce(100, Integer::sum);
        System.out.println("Concurrent modification is NOT safe : " + sum2);
        System.out.println("In this case, it is safe to use sequence stream instead of parallel stream".toUpperCase());

        System.out.println("Sequence Stream");
        for (int i = 0; i < TIMES; i++) {
            var before = System.currentTimeMillis();
            IntStream.range(1, 10_000_000).sum();
            System.out.println(System.currentTimeMillis() - before);
        }

        System.out.println("Parallel Stream");
        for (int i = 0; i < TIMES; i++) {
            var before = System.currentTimeMillis();
            IntStream.range(1, 10_000_000).parallel().sum();
            System.out.println(System.currentTimeMillis() - before);
        }
        System.out.println("Parallel stream should be based on NQ model, where N is the No. OF ELEMENTS and Q is the No. OF COMPUTATIONS");
        System.out.println("Parallel stream uses FORK JOIN to collect the output");
    }
}
