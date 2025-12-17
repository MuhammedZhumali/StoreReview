package backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
@Entity
public class User {
    @Id
    private Long id;

    private String username;
    private String email;

}
