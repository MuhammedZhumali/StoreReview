package backend.service;

import org.springframework.stereotype.Service;

import backend.repository.ItemRepository;
import backend.model.item.Item;
import backend.model.item.ItemDto;

import java.util.*;

@Service
public class ItemService {
    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<ItemDto> getAll(){
        return itemRepository.findAll();
    }

    public ItemDto createItem(ItemDto itemDto){
        return itemRepository.save(itemDto);
    }

    public void deleteItem(Long id){
        itemRepository.deleteById(id);
    }

    public List<ItemDto> getItemsByCategory(String category){
        return itemRepository.findByCategory(category);
    }

    public Optional<ItemDto> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    public List<ItemDto> getItemsByStoreId(Long storeId) {
        return itemRepository.findByStoreId(storeId);
    }

    public ItemDto updateItem(Long id, ItemDto itemDto){
        ItemDto existingItem = itemRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Item with id " + id + " not found"));
        if(itemDto.getName()!=null){
            existingItem.setName(itemDto.getName());
        }
        if(itemDto.getCategory()!=null){
            existingItem.setCategory(itemDto.getCategory());
        }
        if(itemDto.getPrice() > 0){
            existingItem.setPrice(itemDto.getPrice());
        }
        if (itemDto.getStore() != null) {
            existingItem.setStore(itemDto.getStore());
        }
        existingItem.setStockQuantity(itemDto.getStockQuantity());
        existingItem.setRating(itemDto.getRating());
        if (itemDto.getImageUrl() != null) {
            existingItem.setImageUrl(itemDto.getImageUrl());
        }

        return itemRepository.save(existingItem);
    }

    public List<ItemDto> getItemsByPriceRange(double minPrice, double maxPrice) {
        return itemRepository.findByPriceBetween(minPrice, maxPrice);
    }

}
