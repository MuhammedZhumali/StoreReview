package src.main.java.backend.model.utilities;

import src.main.java.backend.model.utilities.*;

import lombok.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AvatarGroup {

    private String id;
    private String userId;

    private Integer height;
    private Integer weight;
    private Gender gender;

    private AvatarStatus status;

    // несколько вариантов тела
    private List<AvatarVariant> variants;

    private Long createdAt;
}
