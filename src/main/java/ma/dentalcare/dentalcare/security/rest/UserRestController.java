package ma.dentalcare.dentalcare.security.rest;

import ma.dentalcare.dentalcare.model.Patient;
import ma.dentalcare.dentalcare.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {

    private final PatientService userService;

    public UserRestController(PatientService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<Patient> getActualUser() {
        return ResponseEntity.ok(userService.getUserWithAuthorities().get());
    }
}
