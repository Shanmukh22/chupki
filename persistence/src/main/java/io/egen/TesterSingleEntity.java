package io.egen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class TesterSingleEntity {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");


        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        //INSERT
//        Employee emp = new Employee();
//        emp.setEmail("jsmith@egen.io");
//        emp.setFirstName("Jake");
//        emp.setLastName("Smith");
//
//
//        entityManager.getTransaction()
//                     .begin();
//        entityManager.persist(emp);
//        entityManager.getTransaction()
//                     .commit();


        //FIND BY ID
//        Employee emp = entityManager.find(Employee.class, "e92a092d-a5bd-4eb9-9553-31404f085bd6");
//
//        System.out.println(emp);
//


        //UPDATE
//        Employee emp = entityManager.find(Employee.class, "e92a092d-a5bd-4eb9-9553-31404f085bd6");
//
//        emp.setFirstName("Prvn");
//
//        entityManager.getTransaction().begin();
//        entityManager.merge(emp);
//        entityManager.getTransaction().commit();


        //DELETE
//        Employee emp = entityManager.find(Employee.class, "e92a092d-a5bd-4eb9-9553-31404f085bd6");
//
//        entityManager.getTransaction().begin();
//        entityManager.remove(emp);
//        entityManager.getTransaction().commit();


        //FINDALL
//        TypedQuery<Employee> query = entityManager.createQuery("SELECT emp FROM Employee emp ORDER BY emp.email DESC",
//                                                               Employee.class);
//        List<Employee> resultList = query.getResultList();
//        for (Employee emp : resultList) {
//            System.out.println(emp);
//        }


        //FIND BY EMAIL
//        TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findByEmail", Employee.class);
//        query.setParameter("paramEmail", "jsmith@egen.io");
//        List<Employee> resultList = query.getResultList();
//        for (Employee emp : resultList) {
//            System.out.println(emp);
//        }

        entityManager.close();


        entityManagerFactory.close();
    }
}