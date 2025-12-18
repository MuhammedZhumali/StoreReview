package backend.model.item;

import javax.persistence.*;
import backend.model.store.Store;
import lombok.NonNull;


@Entity
@Table(name = "items")
public class Item {
    @Id
    private String id;
    @NonNull
    private String name;
    @NonNull
    private String description;
    @ManyToOne
    @NonNull
    @JoinColumn(name = "store_id")
    private Store store;
    @NonNull
    private String category;
    @NonNull
    private double price;
    private int stockQuantity;
    private boolean isActive;
    private int rating;
    private String imageUrl;
}
