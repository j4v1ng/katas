import static java.lang.Integer.parseInt;

public class FizzBuzz implements FizzBuzzingStrategy {

    @Override
    public boolean applies(String number) {
        return parseInt(number) % 3 == 0 && parseInt(number) % 5 == 0;
    }

    @Override
    public String fizzbuzz() {
        return "FizzBuzz";
    }
}
