package backend.repository;

import org.springframework.stereotype.Repository;
import backend.model.item.Item;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByCategory(String category);
    List<Item> findByStoreId(Long storeId);
    List<Item> findByPriceBetween(double minPrice, double maxPrice);
}
