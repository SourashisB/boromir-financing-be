package com.boromirfinancing.login;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class APIEndpoint {
    
    @GetMapping("/process-parameters")
    public ResponseEntity<String> processParameters (

        @RequestParam(name="username", required = true) String usernameString,
        @RequestParam(name="password", required = true) String passwordString
    ) {
        boolean isSuccess = verifyCreds(usernameString, passwordString);
        
        if (isSuccess){
            return new ResponseEntity<>("Success",HttpStatus.OK);
        } else{
            return new ResponseEntity<>("Failure",HttpStatus.BAD_REQUEST);
        }

    }
    private boolean verifyCreds(String param1, String param2){
        if (param1.length()>= 2 || param2.length() >=2 ){
            return true;
        } else {
            return false;
        }
    }
}
