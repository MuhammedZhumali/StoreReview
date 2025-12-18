package backend.model.user;

import javax.persistence.*;

import lombok.NonNull;

@Table(name = "users")
@Entity
public class User {
    @Id
    private Long id;
    @NonNull
    private String username;
    private String email;

}
