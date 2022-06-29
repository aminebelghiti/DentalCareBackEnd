package ma.dentalcare.dentalcare.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Certificat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Certif;
    private LocalDate Date_Certif;
    private String Motif;
    private Integer Nb_Jours;
    @OneToOne
    private Patient patient;
}
