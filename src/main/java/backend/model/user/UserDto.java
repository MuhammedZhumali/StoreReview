package backend.model.user;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String id;
    private String name;
    private String height;
    private String weight;
    private char gender;
    private String activeAvatarId;
}
