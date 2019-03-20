package co.edu.sena.eps.entities;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "solicitud_afiliacion")
public class SolicitudAfiliacion {
    @Id
    private Long id;
    @Column(name = "fecha_solicitud", nullable = false)
    private Date fechaSolicitud;
    @Column(name = "fecha_afiliacion", nullable = false)
    private Date fechaAfiliacion;
    @ManyToOne
    private Cotizante idCotizante;
    @Column(name = "estado",nullable = false)
    private String estado ;
}
