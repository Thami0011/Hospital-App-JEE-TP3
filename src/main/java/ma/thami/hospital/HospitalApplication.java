package ma.thami.hospital;

import ma.thami.hospital.entities.Patient;
import ma.thami.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "Said", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Imane", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Karim", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Nassim", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Akram", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Houda", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Said", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Imane", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Karim", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Nassim", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Akram", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Houda", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Said", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Imane", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Karim", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Nassim", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Akram", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Houda", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Said", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Imane", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Karim", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Nassim", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Akram", new Date(), false, 125));
        patientRepository.save(new Patient(null, "Houda", new Date(), false, 125));
    }
}
