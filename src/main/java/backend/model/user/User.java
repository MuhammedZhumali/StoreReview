package backend.model.user;

import javax.persistence.*;

import backend.config.Role;
import lombok.*;

@Table(name = "users")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String username;
    private String email;
    private String password;
    
    @Enumerated(EnumType.STRING)
    private Role role = Role.CLIENT; // Default role
}
