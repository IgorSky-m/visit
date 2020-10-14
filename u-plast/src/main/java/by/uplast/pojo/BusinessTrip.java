package by.uplast.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;
//Сделать план коммандировки , чтобы клиенты в городах которые есть в плане, подгружались в программу и были доступны оффлайн
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BusinessTrip implements Serializable {

    @Id
    private String businessTripId;

    private String managerId;

    @OneToMany(mappedBy = "businessTrip")
    private List<Visit> visitList;

}
