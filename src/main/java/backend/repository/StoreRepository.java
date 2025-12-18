package backend.repository;

import backend.model.store.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface StoreRepository extends JpaRepository<Store, String> {
    List<Store> findAll();
}
