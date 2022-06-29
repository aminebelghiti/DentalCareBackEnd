package ma.dentalcare.dentalcare.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Ordonnance")
public class Ordonnance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Ordon;
    @ManyToMany
    private List<Medicament> medicamentList;
    @OneToOne
    private Patient patient;
}
