package backend.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import backend.config.SecuredResources;
import backend.model.store.Store;
import backend.service.StoreService;
import static backend.config.Role.*;

@RestController
@RequestMapping("/store")
public class StoreController {
    
    private final StoreService service;

    public StoreController(StoreService service) {
        this.service = service;
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "StoreController is up and running!";
    }

    @GetMapping("/find/{name}")
    public Store getStoreByName(@PathVariable String name){
        return service.getStoreByName(name);
    }

    @PostMapping("/create")
    @SecuredResources(roles = {SELLER, ADMIN})
    public Store createStore(@RequestBody Store store){
        return service.createStore(store);
    }

    @GetMapping("/all")
    public List<Store> getAllStores(){
        return service.getAllStores();
    }

    @DeleteMapping("/delete/{id}")
    @SecuredResources(roles = {SELLER, ADMIN})
    public void deleteStore(@PathVariable Long id){
        service.deleteStore(id);
    }
}