package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Cli implements CommandLineRunner {

    @Value("${simpleValue}")
    private String simpleValue;

    @Value("${nested.nestedValue}")
    private String nestedValue;

    @Value("${nested.otherNestedValue}")
    private String otherNestedValue;

    public void run(String... args) {
        System.out.println(simpleValue);
        System.out.println(nestedValue);
        System.out.println(otherNestedValue);
    }

}
