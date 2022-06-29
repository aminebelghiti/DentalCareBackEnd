package ma.dentalcare.dentalcare.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Facture;
    private LocalDate Date_Facture;
    private String DentsTraitees;
    private String ModePaiement;
    private Double Montant;
    @OneToOne
    private Patient patient;
}
