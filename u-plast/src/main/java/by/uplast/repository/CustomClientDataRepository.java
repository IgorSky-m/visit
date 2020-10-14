package by.uplast.repository;

import by.uplast.pojo.CustomClientData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomClientDataRepository extends JpaRepository<CustomClientData,String> {
}
