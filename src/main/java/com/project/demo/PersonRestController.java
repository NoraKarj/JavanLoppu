package com.project.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class PersonRestController {
  
  private ProjectService ps = new ProjectService();

    
    @GetMapping("/person")
      public List<Person> getPerson(){
        return ps.getPersons();
      
    }
    @GetMapping("/person/hobby/{hobby}")
    public List<Person> getPersonsByHobby(@PathVariable String hobby){
      return ps.getPersonsByHobby(hobby);
    }


    @PostMapping("/addperson")
      public String addPerson(@RequestBody Person person){
        ps.addPerson(person);
        return "Person added";
    
  
    }
    
    @DeleteMapping("/deleteperson")
    public String deletePerson(@RequestBody Person person){

      if(ps.removePerson(person.getHobby())==true){
        return "Person Removed";
      } else{
        return "Error";
      }
    }

    @GetMapping("/person/name/{name}")
    public List<Person> getPersonsByName(@PathVariable String name){
      
      return ps.getPersonsByName(name);
    }

  

}
