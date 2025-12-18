package backend.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import backend.model.store.Store;
import backend.service.StoreService;

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
    public Store createStore(@RequestBody Store store){
        return service.createStore(store);
    }

}