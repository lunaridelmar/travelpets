package mar.del.lunari.model;

import lombok.Data;

import java.util.List;

@Data
public class PetOwner {
    private final Long id;
    private final String ownerName;
    private final String phone;
    private final List<PetEntity> petEntities;
}
