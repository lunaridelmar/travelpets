package mar.del.lunari.model;

import lombok.Data;

@Data
public class PetEntity {
    private final Long id;
    private final String petName;
    private final PetType petType;
    private final PetOwner petOwner;
}
