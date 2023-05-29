package pro.sky.hw2.springbeans;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class BasketImpl implements Basket {
    private final Set<Integer> goodIDs= new HashSet<>();

    public Set<Integer> add(@RequestParam List<Integer> goodIDs) {
        this.goodIDs.addAll(goodIDs);
        return this.goodIDs;
    }

    public Set<Integer> get() {
        return goodIDs;
    }
}
