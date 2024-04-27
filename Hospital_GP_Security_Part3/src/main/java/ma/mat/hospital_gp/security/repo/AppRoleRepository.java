package ma.mat.hospital_gp.security.repo;

import ma.mat.hospital_gp.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;


//UserDettailsService

public interface AppRoleRepository extends JpaRepository<AppRole, String> {
}
