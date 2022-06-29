package ma.dentalcare.dentalcare.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cabinet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_Cabinet;
    private String Address;
    private String Email;
    private Long Tel_Fixe;
    private Integer ICE;
    private Integer ID;
    private Integer INPE;
    private String Name;
    private Integer Num_Patente;
    @OneToOne
    private Medecin medecin;
}
