package backend.model.item;

import javax.persistence.*;
import backend.model.store.Store;
import lombok.*;

@Entity
@Table(name = "items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
