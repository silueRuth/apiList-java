package com.orange.digitall.academemy.demo.resource;

import com.orange.digitall.academemy.demo.Models.Employe;
import com.orange.digitall.academemy.demo.services.EmployeServ;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/employe")

public class EmployeController {

    private final EmployeServ empserv;

    public EmployeController(EmployeServ empserv){
        
        this.empserv = empserv;
}

@GetMapping("/all")
public ResponseEntity<List<Employe>> getAllEmploye(){
    List<Employe> employes = empserv.listEmploye();
    return new ResponseEntity<>(employes, HttpStatus.OK);

}


    
}
