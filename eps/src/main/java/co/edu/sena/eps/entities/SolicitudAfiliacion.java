package co.edu.sena.eps.entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "solicitud_afiliacion")
public class SolicitudAfiliacion {
    @Id
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq",sequenceName="INV_SEQ", allocationSize=1)
    private Long id;
    @Column(name = "fecha_solicitud", nullable = false)
    private Date fechaSolicitud;
    @Column(name = "fecha_afiliacion", nullable = false)
    private Date fechaAfiliacion;
    @ManyToOne
    private Cotizante idCotizante;
    @Column(name = "estado",nullable = false)
    private String estado ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(Date fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public Cotizante getIdCotizante() {
        return idCotizante;
    }

    public void setIdCotizante(Cotizante idCotizante) {
        this.idCotizante = idCotizante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
