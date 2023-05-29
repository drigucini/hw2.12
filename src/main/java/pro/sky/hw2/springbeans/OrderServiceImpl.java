package pro.sky.hw2.springbeans;


import java.util.List;
import java.util.Set;

@org.springframework.stereotype.Service
public class OrderServiceImpl implements Service {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Set<Integer> add(List<Integer> goodIDs) {
        return orderRepository.add(goodIDs);
    }

    public Set<Integer> get() {
        return orderRepository.get();
    }
}
