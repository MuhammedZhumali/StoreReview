package backend.controller;

import org.springframework.web.bind.annotation.*;

import backend.service.*;

import static backend.config.Role.SELLER;

import java.util.*;

import backend.config.Role;
import backend.config.SecuredResources;
import backend.model.item.ItemDto;

@RestController
@RequestMapping("/item")
public class ItemController {

    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/all")
    public List<ItemDto> getAllItems(){
        return itemService.getAll();
    }


    @GetMapping("/category/{category}")
    public List<ItemDto> getItemsByCategory(@PathVariable String category){
        return itemService.getItemsByCategory(category);
    }

    @DeleteMapping("/delete/{id}")
    @SecuredResources(roles = {SELLER})
    public void deleteItem(@PathVariable Long id){
        itemService.deleteItem(id);
    }

    @PostMapping("/create")
    @SecuredResources(roles = {Role.SELLER})
    public ItemDto createItem(@RequestBody ItemDto itemDto){
        itemService.createItem(itemDto);
        return itemDto;
    }

    @GetMapping("/find/{id}")
    public Optional<ItemDto> getItemById(@PathVariable Long id){
        return itemService.getItemById(id);
    }

    @GetMapping("/store/{storeId}")
    public List<ItemDto> getItemByStore(@PathVariable Long storeId){
        return itemService.getItemsByStoreId(storeId);
    }

    @PutMapping("/update/{id}")
    public ItemDto updateItem(@PathVariable Long id, @RequestBody ItemDto itemDto){
        return itemService.updateItem(id, itemDto);
    }
}
