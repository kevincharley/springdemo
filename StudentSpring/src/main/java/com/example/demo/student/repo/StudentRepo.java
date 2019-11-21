package com.example.demo.student.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Studentbean;
@Repository
public interface StudentRepo extends JpaRepository<Studentbean, Integer>{
	List<Studentbean> findByName(String name);
	List<Studentbean> findByIdBetween(Integer start, Integer stop);
//    @Query("select u from User u where u.emailAddress = ?1")
//    Studentbean findByAddress(String email);
}
