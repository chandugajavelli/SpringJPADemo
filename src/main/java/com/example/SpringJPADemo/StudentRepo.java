package com.example.SpringJPADemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.SpringJPADemo.model.Student;
import java.util.List;


@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {


    @Query("select s from Student s where s.name=?1")  // this is not necessary for some methods where jpa automatically provides for columns// 1 is for index when passing more args
    List<Student> findByName(String name);


    List<Student> findByMarks(int marks);

    List<Student> findByMarksGreaterThan(int marks);

}
