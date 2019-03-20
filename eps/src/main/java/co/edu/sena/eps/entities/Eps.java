package co.edu.sena.eps.entities;

import javax.persistence.*;

@Entity
@Table(name = "Eps", uniqueConstraints =@UniqueConstraint(name = "Unique_nit",columnNames = {"nit_eps"}))
public class Eps {
    @Id
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq",sequenceName="INV_SEQ", allocationSize=1)
    private int id;
    @Column(name = "nombre_eps", nullable = false)
    private String nombreEPS;
    @Column(name = "nit_eps", nullable = false)
    private String nitEPS;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEPS() {
        return nombreEPS;
    }

    public void setNombreEPS(String nombreEPS) {
        this.nombreEPS = nombreEPS;
    }

    public String getNitEPS() {
        return nitEPS;
    }

    public void setNitEPS(String nitEPS) {
        this.nitEPS = nitEPS;
    }
}
