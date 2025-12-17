package src.main.java.backend.model.utilities;

package backend.model.avatar;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Avatar {

    private String id;
    private String userId;

    // ссылки на артефакты
    private String bodyModelUrl;    // SMPL тело
    private String faceModelUrl;    // 3D лицо (DECA)
    private String avatarModelUrl;  // final avatar.glb

    private AvatarStatus status;    // CREATED, PROCESSING, READY, FAILED

    // параметры, по которым был создан
    private Integer height;
    private Integer weight;
    private Gender gender;

    private Long createdAt;
}
