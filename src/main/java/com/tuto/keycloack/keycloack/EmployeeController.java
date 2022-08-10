package com.tuto.keycloack.keycloack;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class EmployeeController {

    @RequestMapping("/employee")
    @RolesAllowed("user2")
    public ResponseEntity getEmployee(){
        return new ResponseEntity<String>("hello",HttpStatus.OK);
    }

}
