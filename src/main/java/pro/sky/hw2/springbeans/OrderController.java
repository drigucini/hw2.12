package pro.sky.hw2.springbeans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final Basket basket;

    public OrderController(Basket basket) {
        this.basket = basket;
    }

    @GetMapping(path = "/add")
    public Set<Integer> add(@RequestParam("ID") List<Integer> goodIDs) {
        return basket.add(goodIDs);
    }

    @GetMapping(path = "/get")
    public Set<Integer> get() {
        return basket.get();
    }
}
