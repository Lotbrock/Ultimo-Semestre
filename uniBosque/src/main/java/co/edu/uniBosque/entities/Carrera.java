package co.edu.uniBosque.entities;

import javax.persistence.*;

@Entity
public class Carrera {
@Id
@GeneratedValue(generator="InvSeq")
@SequenceGenerator(name="InvSeq",sequenceName="INV_SEQ", allocationSize=1)
    private int id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "num_semestres", nullable = false)
    private int num_semestres;
}
