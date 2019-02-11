package co.edu.uniBosque.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Estudiante {
    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private String apellido;
    private TipoDocumento tipoDocumento;
    private String identificacion;
    private String carrera ;
    private Float materia1;
    private Float materia2;
    private Float materia3;
    private Float materia4;
    private Float materia5;
    private Float promedio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Float getMateria1() {
        return materia1;
    }

    public void setMateria1(Float materia1) {
        this.materia1 = materia1;
    }

    public Float getMateria2() {
        return materia2;
    }

    public void setMateria2(Float materia2) {
        this.materia2 = materia2;
    }

    public Float getMateria3() {
        return materia3;
    }

    public void setMateria3(Float materia3) {
        this.materia3 = materia3;
    }

    public Float getMateria4() {
        return materia4;
    }

    public void setMateria4(Float materia4) {
        this.materia4 = materia4;
    }

    public Float getMateria5() {
        return materia5;
    }

    public void setMateria5(Float materia5) {
        this.materia5 = materia5;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio() {
        this.promedio = sacarPromedio();
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", carrera='" + carrera + '\'' +
                '}';
    }

    public Float sacarPromedio(){
        Float promedio = (materia1+materia2+materia3+materia4+materia5)/5;
        this.promedio = promedio;
        return promedio;
    }

    public String escribirPromedio(String pro){
        String concatenacion = "";
        for (int i = 0; i < 3; i++){
        switch (pro.charAt(i)){
            case '1':
                concatenacion= concatenacion + "Uno ";
                break;
            case '0':
                concatenacion= concatenacion + "Cero ";
                break;
            case '2':
                concatenacion= concatenacion + "Dos ";
                break;
            case '3':
                concatenacion= concatenacion + "Tres ";
                break;
            case '4':
                concatenacion= concatenacion + "Cuatro ";
                break;
            case '5':
                concatenacion= concatenacion + "Cinco ";
                break;
            case '6':
                concatenacion= concatenacion + "Seis ";
                break;
            case '7':
                concatenacion= concatenacion + "Siete ";
                break;
            case '8':
                concatenacion= concatenacion + "Ocho ";
                break;
            case '9':
                concatenacion= concatenacion + "Nueve ";
                break;
            case '.':
                concatenacion= concatenacion + "Punto ";
                break;
        }
    }
        return concatenacion;
    }

}
