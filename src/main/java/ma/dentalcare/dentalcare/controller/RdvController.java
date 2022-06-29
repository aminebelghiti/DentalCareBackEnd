package ma.dentalcare.dentalcare.controller;

import ma.dentalcare.dentalcare.model.Patient;
import ma.dentalcare.dentalcare.model.RDV;
import ma.dentalcare.dentalcare.service.RDVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/rdv")
public class RdvController {
    @Autowired
    private final RDVService rdvService;

    public RdvController(RDVService rdvService) {
        this.rdvService = rdvService;
    }
    @PostMapping("/add")
    public ResponseEntity<RDV> AddRdv (@RequestBody RDV rdv)
    {
        RDV rdvI = rdvService.AddRdv(rdv);
        return new ResponseEntity<>(rdvI, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<RDV>> GetAllRDVs(){
        List<RDV> ListOfRdv = rdvService.getAllRDVs();
        return new ResponseEntity<>(ListOfRdv,HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<RDV> getRdvById(@PathVariable("id") Long id){
        RDV rdv = rdvService.getRDVById(id);
        return new ResponseEntity<>(rdv,HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<RDV> saveRdv (@RequestBody RDV rdv)
    {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/rdv/save").toUriString());
        return ResponseEntity.created(uri).body(rdvService.saveRDV(rdv));
    }
    @PostMapping("/update") //PUT
    public ResponseEntity<RDV> updateRDV(@RequestBody RDV rdv)
    {
        RDV rdvI = rdvService.updateRDV(rdv);
        return new ResponseEntity<>(rdvI,HttpStatus.OK);
    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteRDV(@PathVariable("id") Long id)
    {
        rdvService.deleteRDV(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
