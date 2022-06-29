package ma.dentalcare.dentalcare.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RDV")
public class RDV implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long ID;
    @Column(name = "Acte",nullable = false)
    private String Acte;
    @Column(name = "Comfirmed",nullable = false)
    private String Etat ;
    @Column(name="Date",nullable = false)
    private Date Date;
    @Column(name = "Heure",nullable = false)
    private Time Heure;
    @Column(name = "Motif",nullable = false)
    private String Motif;
    @ManyToOne
    private Patient Patient;
    @OneToOne
    private Consultation consultation;

}
