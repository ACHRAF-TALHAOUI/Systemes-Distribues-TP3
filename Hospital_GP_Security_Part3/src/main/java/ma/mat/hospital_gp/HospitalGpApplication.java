package ma.mat.hospital_gp;

import ma.mat.hospital_gp.entities.Patient;
import ma.mat.hospital_gp.repositories.PatientRepository;
import ma.mat.hospital_gp.security.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import java.util.Date;

@SpringBootApplication
public class HospitalGpApplication implements CommandLineRunner {


    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {

        SpringApplication.run(HospitalGpApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Ali",new Date(),false,840));
            patientRepository.save(new Patient(null,"Saad",new Date(),false,970));
            patientRepository.save(new Patient(null,"Yassine",new Date(),true,800));

        };
    }

    //JDBC Authentication
    //@Bean
    CommandLineRunner commandLineRunner(JdbcUserDetailsManager jdbcUserDetailsManager){
        PasswordEncoder passwordEncoder = passwordEncoder();
        return args -> {

            UserDetails u1 = jdbcUserDetailsManager.loadUserByUsername("user11");
            if(u1== null)
                jdbcUserDetailsManager.createUser(
                    User.withUsername("user11").password(passwordEncoder.encode("1234")).roles("USER").build()
            );
            UserDetails u2 = jdbcUserDetailsManager.loadUserByUsername("user22");
            if(u2== null)
            jdbcUserDetailsManager.createUser(
                    User.withUsername("user22").password(passwordEncoder.encode("1234")).roles("USER").build()
            );
            UserDetails u3 = jdbcUserDetailsManager.loadUserByUsername("admin2");
            if(u3== null)
                jdbcUserDetailsManager.createUser(
                    User.withUsername("admin2").password(passwordEncoder.encode("1234")).roles("USER","ADMIN").build()
            );



        };
    }
    //UserDetailsService
    //@Bean  car ces  roles et users sont deja ajoueter ,
    CommandLineRunner commandLineRunnerUserDetails(AccountService accountService ){
        return args -> {
            accountService.addNewRole("USER");
            accountService.addNewRole("ADMIN");
            accountService.addNewUser("user1","1234","user1@gmail.com","1234");
            accountService.addNewUser("user2","1234","user2@gmail.com","1234");
            accountService.addNewUser("admin","1234","admin@gmail.com","1234");

            accountService.addRoleToUser("user1","USER");
            accountService.addRoleToUser("user2","USER");
            accountService.addRoleToUser("admin","ADMIN");
            accountService.addRoleToUser("admin","USER");

        };

    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }




    @Override
    public void run(String... args) throws Exception {
/*
        //1er facon de cree des Patient, constructeur sans arg
        Patient patient = new Patient();
        patient.setId(null);
        patient.setNom("Mohamed");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(12);



        //2eme facon de cree des Patient ,constr avec arg
        Patient patient1 = new Patient(null,"Ahmed",new Date(),false,84);

        //3eme facon de cree des Patient ,Builder
        Patient patient2 = Patient.builder()
                .nom("Amine")
                .dateNaissance(new Date())
                .score(58)
                .malade(true)
                .build();

*/
/*
        //Directeemnt avec Save....
        patientRepository.save(new Patient(null,"Ali",new Date(),false,840));
        patientRepository.save(new Patient(null,"Saad",new Date(),false,970));
        patientRepository.save(new Patient(null,"Yassine",new Date(),true,800));


*/

    }


}
