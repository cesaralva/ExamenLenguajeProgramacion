package examen_prueba;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;

import model.Subject;

public class ListarPrueba {

	 public static void main(String[] args) {
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenLenguajeProgramacion_CEAV");
	        EntityManager em = factory.createEntityManager();

	        Query query = em.createNamedQuery("Subject.findAll");

	        List<Subject> subjectList = query.getResultList();

	        if (!subjectList.isEmpty()) {
	            System.out.println("Lista de Subjects:");
	            for (Subject subject : subjectList) {
	                System.out.println("ID: " + subject.getIdsubject() + ", Subject: " + subject.getSubject() + ", Créditos: " + subject.getCredits());
	            }
	        } else {
	            System.out.println("No hay Subjects registrados.");
	        }
	    }

}
