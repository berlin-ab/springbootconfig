package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Arrays;

@Component
public class Cli implements CommandLineRunner {

    @Value("${listOfValues}")
    private String[] listOfValues;

    public void run(String... args) {
        System.out.println(listOfValues[0]);
        System.out.println(listOfValues[1]);

        List<String> list = Arrays.asList(listOfValues);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
