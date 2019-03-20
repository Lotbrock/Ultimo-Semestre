package co.edu.sena.eps.entities;

import javax.persistence.*;

@Entity
@Table(name = "Beneficiario")
public class Beneficiario {

    @Id
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq",sequenceName="INV_SEQ", allocationSize=1)
    private Long id;
    @OneToOne
    private Usuario idUsuario;
    @ManyToOne
    private Cotizante idCotizante;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Cotizante getIdCotizante() {
        return idCotizante;
    }

    public void setIdCotizante(Cotizante idCotizante) {
        this.idCotizante = idCotizante;
    }
}
