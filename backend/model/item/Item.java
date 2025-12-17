package backend.model.item;

import lombok.*;
import backend.model.store.Store;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private String id;
    private String name;
    private String description;
    private Store store;
    private String category;
    private double price;
}