package bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootcamp.model.Person;
import bootcamp.services.OrderService;

@RestController
public class OrderController {

	@Autowired
    private OrderService service;
	
    @RequestMapping("/getPerson")
    public Person getPerson(@RequestParam(value = "personId") int id) {
        return service.getPersonById(id);
    }
    
    @RequestMapping("/addPerson")
    public Person addPerson(@RequestParam(value = "personId") int id) {
    	service.addPerson(new Person(id, "hampson", "erica", "123", "Atlanta"));
    	return service.getPersonById(id);
    }
    
    @RequestMapping("/delete")
    public void deletePerson(@RequestParam(value = "personId") int id) {
    	service.deleteField(id);
    }
    
    @RequestMapping("/update")
    public void updatePersonLastName(@RequestParam(value = "personId") int id,
    						@RequestParam(value = "lastname") String lastname) {
    	Person person = service.getPersonById(id);
    	person.setlastname(lastname);
    	service.updateField(person);
    }
    
  }
