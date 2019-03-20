package co.edu.sena.eps.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Solicitud_traslado")
public class SolicitudTraslado {
    @Id
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq",sequenceName="INV_SEQ", allocationSize=1)
    private Long id;
    @ManyToOne
    private Cotizante cotizante;
    @Column(name = "fecha_solicitud", nullable = false)
    private Date fechaSolicitud;
    @Column(name = "fecha_nueva_afiliacion", nullable = false)
    private Date fechaNuevaAfiliacion;
    @Column(name = "fecha_retiro_eps", nullable = false)
    private Date fechaRetiroEps;
    @Column(name = "estado", nullable = false)
    private String estado="Pendiente" ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cotizante getCotizante() {
        return cotizante;
    }

    public void setCotizante(Cotizante cotizante) {
        this.cotizante = cotizante;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaNuevaAfiliacion() {
        return fechaNuevaAfiliacion;
    }

    public void setFechaNuevaAfiliacion(Date fechaNuevaAfiliacion) {
        this.fechaNuevaAfiliacion = fechaNuevaAfiliacion;
    }

    public Date getFechaRetiroEps() {
        return fechaRetiroEps;
    }

    public void setFechaRetiroEps(Date fechaRetiroEps) {
        this.fechaRetiroEps = fechaRetiroEps;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
