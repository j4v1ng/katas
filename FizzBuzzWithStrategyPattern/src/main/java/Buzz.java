import static java.lang.Integer.parseInt;

public class Buzz implements FizzBuzzingStrategy {

    @Override
    public boolean applies(String number) {
        return parseInt(number) % 5 == 0;
    }

    @Override
    public String fizzbuzz() {
        return "Buzz";
    }
}
