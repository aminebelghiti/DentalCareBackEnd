package ma.dentalcare.dentalcare.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Consultation")
public class Consultation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long ID_Consu;
    @Column(name = "Date",nullable = false)
    private Date Date;
    @Column(name = "Note",nullable = false)
    private String Note;
    @OneToOne(mappedBy = "consultation")
    private RDV RdV;

}
