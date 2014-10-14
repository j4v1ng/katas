import com.googlecode.totallylazy.Callable1;

import java.util.List;

import static com.googlecode.totallylazy.Sequences.sequence;

public class FizzBuzzer {

    public List<String> numbers() {
        return sequence(Numbers.from1To100().split(" ")).map(fizzBuzzIt()).toList();
    }

    private Callable1<String, String> fizzBuzzIt() {
        return new Callable1<String, String>() {
            @Override
            public String call(String number) throws Exception {
                return ruleValidator(number, new FizzBuzz(),new Fizz(), new Buzz());
            }
        };
    }

    private String ruleValidator(String number, FizzBuzzingStrategy ... strategies) {
        for(FizzBuzzingStrategy strategy : strategies) {
            if(strategy.applies(number))
                return strategy.fizzbuzz();
        }
        return number;
    }
}
