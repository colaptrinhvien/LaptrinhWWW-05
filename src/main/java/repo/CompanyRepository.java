package repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@repo
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
