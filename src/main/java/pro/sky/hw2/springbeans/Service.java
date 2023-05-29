package pro.sky.hw2.springbeans;

import java.util.List;
import java.util.Set;

public interface Service {
    Set<Integer> add(List<Integer> goodIDs);
    Set<Integer> get();
}
