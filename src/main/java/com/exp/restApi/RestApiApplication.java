package com.exp.restApi;

import org.hibernate.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.cfg.Configuration;

import com.exp.restApi.model.Friends;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Friends friends1 = new Friends();
		friends1.setId(1);
		friends1.setFirstName("Kanchan");
		friends1.setLastName("Gupta");
		session.save(friends1);
		session.getTransaction().commit();

	}

}
