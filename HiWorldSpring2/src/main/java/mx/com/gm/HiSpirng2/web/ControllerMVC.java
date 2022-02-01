package mx.com.gm.HiSpirng2.web;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.HiSpirng2.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


//behing of controller we are using servelt technology
@Controller
@Slf4j
public class ControllerMVC {//it is not necesary to extend from HttpServelt
  
    //to use value from application.properties, here also will be applied dependency injection
    @Value("${infigdex.greetFromConfig}") 
    private String greetFromConfig;
    

    @GetMapping("/mvc")
    //instead of request object, we receive Model object
    public String start(Model model){
        //using our class Domain
        var person = new Person();
        person.setName("Juan");
        person.setSurnames("Perez");
        person.setSurnames("jperez@mail_mvc.com");
        person.setPhone("985632147");
        
        var person2 = new Person();
        person2.setName("Pol");
        person2.setSurnames("Diaz");
        person2.setSurnames("poldiaz_mvc.com");
        person2.setPhone("98563214799999");
        
        
        var person3 = new Person();
        person3.setName("Karla");
        person3.setSurnames("Gomez");
        person3.setSurnames("kgomez@mail_mvc.com");
        person3.setPhone("98563214799999");
        
        //other way to create array of items
        var people = Arrays.asList(person2, person3);
        //var people = Arrays.asList();
        System.out.println("peope mvc " + people);
        
        var message = "Hi world with thymeleaf";
        
                
        model.addAttribute("message", message); // key - value
        model.addAttribute("greetFromConfig", greetFromConfig);
        model.addAttribute("person", person);
        model.addAttribute("people", people);
        
        //thymeleaf use .html extension, while jsp use .jsp extension
        return "index.html";
    }
    
//    @GetMapping("spring-data")
//    public String springData(){
//        return "";
//    }
}
