package co.edu.uniBosque.conexiones;

import co.edu.uniBosque.entities.Estudiante;

import javax.persistence.*;

public class Conexion {
    private static EntityManagerFactory emf;
    private static EntityManager em;

    public static void abrirConexion(){
        try {
            emf = Persistence.createEntityManagerFactory("unidadPersistencia01");
            em = emf.createEntityManager();

        }catch (PersistenceException e){
            System.err.println(e.getMessage());
        }

    }

    public static void guardarEstudiante(Estudiante estudiante){
        try {

            em.getTransaction().begin();
            em.merge(estudiante);
            em.getTransaction().commit();


        }catch (PersistenceException e){
            System.err.println(e.getMessage());
        }
    }
    public static Estudiante buscarEstudiante(String documento){
        Query query = em.createNamedQuery("find student by id");
        query.setParameter("identificacion", documento);

        Estudiante e = (Estudiante)query.getSingleResult();
        return e;
    }

    public static void cerrarConexion(){
            try {
            if (emf != null){
                emf.close();
            }
         }catch (Exception e) {
            e.getMessage();
            }
        }
    }

