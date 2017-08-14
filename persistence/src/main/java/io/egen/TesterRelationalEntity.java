package io.egen;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesterRelationalEntity {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        //INSERT
//        User user = new User();
//
//        user.setEmail("psalitra@egen.io");
//        user.setFirstName("Praveen");
//        user.setLastName("Salitra");
//
//        Address address = new Address();
//        address.setCity("Chicago");
//        address.setState("IL");
//        address.setStreet("Main St");
//
//        entityManager.getTransaction()
//                     .begin();
//        entityManager.persist(address);
//        user.setAddress(address);
//        entityManager.persist(user);
//        entityManager.getTransaction()
//                     .commit();

        //FIND
//        User user = entityManager.find(User.class, "a15b0200-5209-485c-95b6-d03f5fb9cff9");
//
//        System.out.println(user);

        entityManager.close();
        entityManagerFactory.close();
    }
}
