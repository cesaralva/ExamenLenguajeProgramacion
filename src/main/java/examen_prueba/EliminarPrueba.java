package examen_prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Subject;
public class EliminarPrueba {
	 public static void main(String[] args) {
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenLenguajeProgramacion_CEAV");
	        EntityManager em = factory.createEntityManager();

	        em.getTransaction().begin();

	        Subject subject = em.find(Subject.class, 1); // Suponiendo que el Subject que quieres eliminar tiene ID = 1
	        if (subject != null) {
	            em.remove(subject);

	            em.getTransaction().commit();

	            System.out.println("Subject eliminado exitosamente.");
	        } else {
	            System.out.println("No se encontró ningún Subject con el ID proporcionado.");
	        }
	    }
}
