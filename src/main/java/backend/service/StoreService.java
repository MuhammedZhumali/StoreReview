package backend.service;

import org.springframework.stereotype.Service;
import backend.model.store.Store;
import backend.repository.StoreRepository;
import java.util.*;


@Service
public class StoreService {
    private final StoreRepository storeRepo;

    public StoreService(StoreRepository storeRepo) {
        this.storeRepo = storeRepo;
    }

    public List<Store> getAllStores() {
        return storeRepo.findAll();
    }
}
