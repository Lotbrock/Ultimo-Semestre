package co.edu.sena.eps.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Cargo",
        uniqueConstraints=@UniqueConstraint(columnNames={"nombre_cargo"}))
public class Cargo {
    @Id
    @GeneratedValue(generator="InvSeq")
    @SequenceGenerator(name="InvSeq",sequenceName="INV_SEQ", allocationSize=1)
    private Long id;
    @Column(name = "nombre_cargo", nullable = false)
    private String nombreCargo;
    @ManyToMany(mappedBy = "cargos")
    List<Funcionario> funcionarios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
