package backend.model.store;

import javax.persistence.*;

import lombok.NonNull;

@Entity
@Table(name = "stores")
public class Store {
    @Id
    private String id;
    @NonNull
    private String name;
    private String location;
}
