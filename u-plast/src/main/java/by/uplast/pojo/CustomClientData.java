package by.uplast.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomClientData implements Serializable {

    @Id
    private String customClientDataId;

    private String customClientId;

    private String customAddressId;

    private String phone;

    private String email;
}
