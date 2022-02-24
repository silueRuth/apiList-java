package com.orange.digitall.academemy.demo.repo;

import com.orange.digitall.academemy.demo.Models.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeRep extends JpaRepository<Employe,Long> {
    Optional<Employe> findEmployeById(Long id);

    
}
