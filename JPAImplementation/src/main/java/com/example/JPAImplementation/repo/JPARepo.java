package com.example.JPAImplementation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.JPAImplementation.entity.JPAEntity;

@Repository
public interface JPARepo extends JpaRepository<JPAEntity,Long>
{

	// ------------------------ Custom query to check "username" and "password" from database ------------------------
	@Query("SELECT n FROM JPAEntity n WHERE n.username=:username AND n.password=:password")
	JPAEntity validate(@Param ("username") String username, @Param ("password") String password);

	
}
