package backend.model.user;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;
    private String name;
    private String height;
    private String weight;

}
