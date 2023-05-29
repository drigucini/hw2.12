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
    private final Service service;

    public OrderController(Service service) {
        this.service = service;
    }

    @GetMapping(path = "/add")
    public Set<Integer> add(@RequestParam("ID") List<Integer> goodID) {
        return service.add(goodID);
    }

    @GetMapping(path = "/get")
    public Set<Integer> get() {
        return service.get();
    }
}
