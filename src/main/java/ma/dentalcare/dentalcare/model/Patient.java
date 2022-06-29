package ma.dentalcare.dentalcare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@Table(name = "Patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long ID;
    @Column(name = "nom" , nullable = true)
    private String nom;
    @Column(name = "prenom" , nullable = true)
    private String prenom;
    @Column(name="username",nullable = true)
    private String username;
    @Column(name="password",nullable = true)
    private String password;
    @Column(name = "telephone" , nullable = true)
    private String telephone;
    @Column(name = "adresse" , nullable = true)
    private String adresse;

    public Patient(String nom, String prenom, String username, String password, String telephone, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    //MAPPING
    @OneToMany(mappedBy = "Patient")
    private Collection<RDV> RDVs;
    @ManyToMany
    private List<Antecedant> antecedants;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private List<Facture> factures;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Certificat> certificats;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Ordonnance> ordonnanceList;

    @JsonIgnore
    @Column(name = "ACTIVATED")
    @NotNull
    private boolean activated;

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    @ManyToMany
    @JoinTable(
            name = "USER_AUTHORITY",
            joinColumns = {@JoinColumn(name = "USER_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "AUTHORITY_NAME", referencedColumnName = "NAME")})
    @BatchSize(size = 20)
    private Set<Authority> authorities = new HashSet<>();

    public Patient() {

    }

}
