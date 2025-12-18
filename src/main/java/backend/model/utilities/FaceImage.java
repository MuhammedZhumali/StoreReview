package backend.model.utilities;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FaceImage {
    private String id;
    private String userId;
    private String imageUrl;
    private ImageStatus status;
}
