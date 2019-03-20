package co.edu.sena.eps.entities;

import javax.persistence.*;

@Entity
@Table(name = "Cotizante")
public class Cotizante {

    @Id
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq",sequenceName="INV_SEQ", allocationSize=1)
    private int id;
    @OneToOne
    private Usuario idUsuario;
    @ManyToOne
    private Eps idEps;
    @ManyToOne
    private Ips idIps;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Eps getIdEps() {
        return idEps;
    }

    public void setIdEps(Eps idEps) {
        this.idEps = idEps;
    }

    public Ips getIdIps() {
        return idIps;
    }

    public void setIdIps(Ips idIps) {
        this.idIps = idIps;
    }
}
