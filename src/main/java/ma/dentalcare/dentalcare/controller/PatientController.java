package ma.dentalcare.dentalcare.controller;

import ma.dentalcare.dentalcare.model.Patient;
import ma.dentalcare.dentalcare.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/Patient")
@CrossOrigin(origins = "*")
public class PatientController {
    //Injection des dependencies !!!
    @Autowired
    private  final PatientService patientService;
    public PatientController(PatientService patientService ) {
        this.patientService = patientService;
    }
    // MAPPING De mon App
    @GetMapping("/all")
    public ResponseEntity<List<Patient>> GetAllPatient(){
        List<Patient> ListOfPatients = patientService.getAllPatients();
        return new ResponseEntity<>(ListOfPatients,HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("id") Long id){
        Patient patient = patientService.getPatientById(id);
        return new ResponseEntity<>(patient,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient)
    {
      Patient patientI = patientService.AddPatient(patient);
      return new ResponseEntity<>(patientI,HttpStatus.CREATED);
    }
    @PostMapping("/save")
    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient)
    {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/Patient/save").toUriString());
        return ResponseEntity.created(uri).body(patientService.savePatient(patient));
    }
    @PostMapping("/update") //PUT
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient)
    {
        Patient patientI = patientService.updatePatient(patient);
        return new ResponseEntity<>(patientI,HttpStatus.OK);
    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deletePatient(@PathVariable("id") Long id)
    {
        patientService.deletePatient(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
