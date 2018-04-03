package bootcamp.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootcamp.model.Order;

@RestController
public class OrderController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Order greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Order(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
