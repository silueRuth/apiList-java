package com.orange.digitall.academemy.demo.services;

import com.orange.digitall.academemy.demo.Models.Employe;
import com.orange.digitall.academemy.demo.repo.EmployeRep;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeServ {

    private final EmployeRep employeRep ;

    public EmployeServ(EmployeRep employeRep){
        this.employeRep = employeRep;
    }

    public List<Employe> listEmploye(){
        return employeRep.findAll();
    }

   /* public Employe EmployeById(Long id){
        return employeRep.findById(id).orElseThrow(()-> new RuntimeException("Employe" + id + "n'existe pas!!"));
    }*/

    
}
