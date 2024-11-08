package com.example.SpringJPADemo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.SpringJPADemo.model.Student;

@SpringBootApplication
public class SpringJpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJpaDemoApplication.class, args);
		System.out.println("hello");

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1= context.getBean(Student.class);
		Student s2= context.getBean(Student.class);
		Student s3= context.getBean(Student.class);

		s1.setRollNo(21);
		s1.setName("tharun");
		s1.setMarks(85);

		s2.setRollNo(22);
		s2.setName("rakesh");
		s2.setMarks(78);

		s3.setRollNo(23);
		s3.setName("bhanu");
		s3.setMarks(70);

		// repo.save(s1);
		// repo.save(s2);
		// repo.save(s3);

		// System.out.println(repo.findAll());

		// Optional<Student> s = repo.findById(28); //findById gives you null in return so this optional is used
		// System.out.println(s.orElse(new Student()));// if we print direct it will give Optional.empty


		// System.out.println(repo.findByName("rakesh"));

		// System.out.println(repo.findByMarksGreaterThan(55));

		repo.save(s3); // for update
		repo.deleteById(21);
	}

}
