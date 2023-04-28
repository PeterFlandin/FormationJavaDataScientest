package important;


interface FindProduct {
    int product(int x, int y);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        FindProduct num = (x, y) -> (x * y);
        System.out.println(num.product(12, 7));
    }
}