package mx.com.gm.HiSpirng2.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.HiSpirng2.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import mx.com.gm.HiSpirng2.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControllerSpringData {
    
    //@Autowired: it allow make a dependency injection, seems to inject with Nest.js
    @Autowired
    private PersonService personService;
    
    @GetMapping("/spring-data")
    public String start(Model model){
        
        var people = personService.listPeople();
        //var people = Arrays.asList(manyPersons);
        System.out.println("people spring data" + people);
        model.addAttribute("people", people);
        return "springData.html";
    }
    
    @GetMapping("/add")
                    //Person person: spring will inject a new object of kind person
    public String add(Person person){
        return "modify";
    }
    
    //it method is only to save data
    @PostMapping("/save")
    public String save(Person person){//Person person  : we will receive data from form, Person instance is in memory and that will be injected by Spring Boot in our method
        personService.save(person);
        return "redirect:/"; //to redirect to index page
    }
    
    //we will use GetMapping because it is a link in the html
    @GetMapping("/edit/{idPerson}")
    public String edit(Person person, Model model){ //spring boot will associate Person object with idPerson 
        person = personService.findPerson(person);
        model.addAttribute("person", person);
        return "modify";
    }
    
    @GetMapping("/remove")
    public String remove(Person person){
        personService.remove(person);
        return "redirect:/";
    }
}
