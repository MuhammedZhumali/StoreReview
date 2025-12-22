package backend.service;

import org.springframework.stereotype.Service;

import backend.repository.ItemRepository;
import backend.model.item.Item;
import java.util.*;

@Service
public class ItemService {
    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAll(){
        return itemRepository.findAll();
    }

    public Item createItem(Item item){
        return itemRepository.save(item);
    }

    public void deleteItem(Long id){
        itemRepository.deleteById(id);
    }

    public List<Item> getItemsByCategory(String category){
        return itemRepository.findByCategory(category);
    }

    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    public List<Item> getItemsByStoreId(Long storeId) {
        return itemRepository.findByStoreId(storeId);
    }

    public Item updateItem(Long id, Item item){
        Item existingItem = itemRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Item with id " + id + " not found"));
        if(item.getName()!=null){
            existingItem.setName(item.getName());
        }
        if(item.getCategory()!=null){
            existingItem.setCategory(item.getCategory());
        }
        if(item.getPrice() > 0){
            existingItem.setPrice(item.getPrice());
        }
        if (item.getStore() != null) {
            existingItem.setStore(item.getStore());
        }
        existingItem.setStockQuantity(item.getStockQuantity());
        existingItem.setRating(item.getRating());
        if (item.getImageUrl() != null) {
            existingItem.setImageUrl(item.getImageUrl());
        }

        return itemRepository.save(existingItem);
    }

    public List<Item> getItemsByPriceRange(double minPrice, double maxPrice) {
        return itemRepository.findByPriceBetween(minPrice, maxPrice);
    }

}
