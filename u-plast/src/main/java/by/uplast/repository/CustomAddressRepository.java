package by.uplast.repository;

import by.uplast.pojo.CustomAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomAddressRepository extends JpaRepository<CustomAddress,String> {
}
