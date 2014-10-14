import static java.lang.Integer.parseInt;

public class Fizz implements FizzBuzzingStrategy {

    @Override
    public boolean applies(String number) {
        return parseInt(number) % 3 == 0;
    }

    @Override
    public String fizzbuzz() {
        return "Fizz";
    }
}
