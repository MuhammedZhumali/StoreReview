package backend.repository;

import org.springframework.stereotype.Repository;
import backend.model.item.ItemDto;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ItemRepository extends JpaRepository<ItemDto, Long> {
    List<ItemDto> findByCategory(String category);
    List<ItemDto> findByStoreId(Long storeId);
    List<ItemDto> findByPriceBetween(double minPrice, double maxPrice);
}
