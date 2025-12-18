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

    public Store getStoreByName(String name) {
        return storeRepo.findStoreByName(name);
    }

    public Store createStore(Store store){
        return storeRepo.save(store);
    }
}
