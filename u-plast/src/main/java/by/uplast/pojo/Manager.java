package by.uplast.pojo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Manager implements Serializable {

    @Id
    private String managerId;

    private String managerName;

    private String username;

    private String password;

}
