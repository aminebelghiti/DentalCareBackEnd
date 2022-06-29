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
@Table(name = "Medicament")
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Medi;
    private Double Price;
    private String Name;
    @ManyToMany
    private List<Ordonnance> ordonnanceList;
}
