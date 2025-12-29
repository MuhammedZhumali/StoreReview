package backend.model.auth;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.*;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {
    @NotBlank (message = "Username is required")
    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
    private String username;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    @NotBlank(message = "mail is required")
    @Email(message = "Email should be valid")
    private String email;
}
