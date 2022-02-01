package mx.com.gm.HiSpirng2.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j //to access log
public class ControllerStart {
    
    //http get annotation
    @GetMapping("")
    public String start(){
        
        //we can use log due that we used @Slf4j decorator
        log.info("Executing rest controller");
        
        //afte to make configuration in application.properties
        log.debug("More detail of controller");
                
        return "Hi world with Spring boot 2";
    }
}
