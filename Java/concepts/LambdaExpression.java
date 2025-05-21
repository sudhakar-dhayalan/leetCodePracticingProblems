package concepts;

import java.util.function.Function;

// Write Lambda expression for a function that returns a value
public class LambdaExpression {
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> square_2 = n -> n * n;
        System.out.println(square(10));

        System.out.println("---Lamba expression for a funtion---");
        System.out.println(square_2.apply(10));
    }
}
