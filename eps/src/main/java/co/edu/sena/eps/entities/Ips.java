package co.edu.sena.eps.entities;

import javax.persistence.*;

@Entity
@Table(name = "Ips", uniqueConstraints =@UniqueConstraint(name = "Unique_nit",columnNames = {"nit_ips"}))
public class Ips {
    @Id
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq",sequenceName="INV_SEQ", allocationSize=1)
    private int id;
    @Column(name = "nombre_ips", nullable = false)
    private String nombreIPS;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "nit_ips", nullable = false)
    private String nitIPS;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreIPS() {
        return nombreIPS;
    }

    public void setNombreIPS(String nombreIPS) {
        this.nombreIPS = nombreIPS;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNitIPS() {
        return nitIPS;
    }

    public void setNitIPS(String nitIPS) {
        this.nitIPS = nitIPS;
    }
}
