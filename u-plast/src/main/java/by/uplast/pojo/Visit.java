package by.uplast.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Visit implements Serializable {

    @Id
    private String visitId;

    @ManyToOne
    private BusinessTrip businessTrip;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<CustomClient> customClients;

}
