package ma.mat.hospital_gp;

import ma.mat.hospital_gp.entities.Patient;
import ma.mat.hospital_gp.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalGpApplication implements CommandLineRunner {


    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {

        SpringApplication.run(HospitalGpApplication.class, args);
    }

    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Ali",new Date(),false,840));
            patientRepository.save(new Patient(null,"Saad",new Date(),false,970));
            patientRepository.save(new Patient(null,"Yassine",new Date(),true,800));

        };
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
