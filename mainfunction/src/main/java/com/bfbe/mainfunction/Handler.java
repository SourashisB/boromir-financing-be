package com.bfbe.mainfunction;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.Random;


public class Handler implements RequestHandler<Object, String>{

        @Override
        public String handleRequest(Object input, Context context) {


            String[] strArr = {"Request Successful", "Request Unsuccessful", "Request Failed", "Request is shit"};


            Random rand = new Random();
            int randomNum = rand.nextInt(4);

            return strArr[randomNum];
        }
    
}
