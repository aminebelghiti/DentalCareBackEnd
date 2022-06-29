package ma.dentalcare.dentalcare.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Secretaire")
public class Secretaire  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long ID;
    @Column(name="Nom",nullable = false)
    private String Nom;
    @Column(name="Prenom",nullable = false)
    private String Prenom;
    @Column(name="Telephone")
    private Long Telephone;
    @Column(name="UserName",nullable = false)
    private String UserName;
    @Column(name="Password",nullable = false)
    private String Password;


}
