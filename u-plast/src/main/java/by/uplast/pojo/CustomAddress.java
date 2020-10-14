package by.uplast.pojo;

import by.uplast.enums.CustomCity;
import by.uplast.enums.CustomRegion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CustomAddress implements Serializable {

    @Id
    private String customAddressId;

    private CustomRegion region;

    private CustomCity city;

    private String address;

    private String coordinate;

}
