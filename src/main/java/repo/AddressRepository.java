package repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@repo
public interface AddressRepository extends JpaRepository<Address, Long>{

}
