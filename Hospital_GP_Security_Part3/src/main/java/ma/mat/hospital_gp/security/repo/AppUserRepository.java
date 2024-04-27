package ma.mat.hospital_gp.security.repo;

import ma.mat.hospital_gp.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


//UserDettailsService

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}
