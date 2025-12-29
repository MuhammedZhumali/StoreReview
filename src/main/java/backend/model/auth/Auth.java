package backend.model.auth;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.jpmml.model.annotations.Required;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Auth {
    @Id
    private Long id;
    @NonNull
    private String username;
    @NonNull
    private String password;   
}
