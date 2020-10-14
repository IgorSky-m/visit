package by.uplast.repository;

import by.uplast.pojo.BusinessTrip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessTripRepository extends JpaRepository<BusinessTrip,String> {
}
