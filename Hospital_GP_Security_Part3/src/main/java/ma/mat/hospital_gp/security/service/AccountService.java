package ma.mat.hospital_gp.security.service;

import ma.mat.hospital_gp.security.entities.AppRole;
import ma.mat.hospital_gp.security.entities.AppUser;

//UserDettailsService

public interface AccountService {
    AppUser addNewUser(String username, String password, String email, String confirmPassword);

    AppRole addNewRole(String roleName);

    void addRoleToUser(String username, String role);
    void removeRoleFromUser(String username, String role);
    AppUser loadUserByUsername(String username);
}
