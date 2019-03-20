package co.edu.sena.eps.entities;

import javax.persistence.*;

@Entity
@Table(name="Tipo_documento",
        uniqueConstraints=@UniqueConstraint(columnNames={"sigla"}))
public class TipoDocumento {

    @Id
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq",sequenceName="INV_SEQ", allocationSize=1)
    private int id;
    @Column(name = "sigla", nullable = false)
    private String sigla;
    @Column(name = "nombre_documento", nullable = false)
    private String nombreDocumento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }
}
