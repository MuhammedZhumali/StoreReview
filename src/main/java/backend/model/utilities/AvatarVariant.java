package src.main.java.backend.model.utilities;

import src.main.java.backend.model.utilities.*;

import lombok.*;


@Data
public class AvatarVariant {

    private String id;
    private String avatarGroupId;

    private BodyVariantType variantType; 

    private String avatarModelUrl; // final avatar.glb
    private float[] smplShape;     // β-вектор

    private boolean selected; // выбрал ли пользователь
}
