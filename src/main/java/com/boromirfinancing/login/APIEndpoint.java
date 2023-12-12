package com.boromirfinancing.login;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class APIEndpoint {
    
    @PostMapping("/process")
    public ResponseEntity<?> processParameters(@RequestBody ParametersDTO params) {

        boolean result = verifyCreds(params.getParam1(), params.getParam2());
        if (result){
            return ResponseEntity.ok(result);
        }else{
            return ResponseEntity.badRequest().body(result);
        }

    }
    private boolean verifyCreds(String param1, String param2){
        if (param1.length()>= 2 | param2.length() >=2 ){
            return true;
        } else {
            return false;
        }
    }
}
