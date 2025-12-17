package backend.model.item;

import lombok.*;
import backend.model.store.StoreDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private String id;
    private String name;
    private String description;
    private StoreDto store;
    private String category;
    private double price;
}