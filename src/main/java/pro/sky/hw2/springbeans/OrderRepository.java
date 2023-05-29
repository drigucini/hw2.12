package pro.sky.hw2.springbeans;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
@SessionScope
public class OrderRepository {
    private final Set<Integer> goodIDs= new HashSet<>();

    public Set<Integer> add(List<Integer> goodIDs) {
        this.goodIDs.addAll(goodIDs);
        return this.goodIDs;
    }

    public Set<Integer> get() {
        return goodIDs;
    }

}
