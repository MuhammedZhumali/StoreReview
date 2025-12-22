package backend.model.item;

import lombok.*;
import backend.model.store.StoreDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private Long id;
    private String name;
    private String description;
    private StoreDto store;
    private String category;
    private double price;
    private int stockQuantity;
    private boolean isActive;
    private int rating;
    private String imageUrl;
}